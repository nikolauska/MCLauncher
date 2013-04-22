package Files;

import Download.Download;
import Launcher.GUI;
import java.io.File;
import java.io.IOException;
import javax.swing.SwingWorker;

public class Start extends SwingWorker<String, Object> { 
    private GUI GUIExt;
    private Launcher.Pic pic;
    
    public Start(GUI GUIExt) {
        this.GUIExt = GUIExt;
        this.pic = new Launcher.Pic(GUIExt);
    }
    
    @Override
    public String doInBackground() throws IOException {      
        // files needed for checking
        File vanillaF           = new File (GUIExt.vanillaFolder);
        File launcherF          = new File (GUIExt.launcherFolder);
        File vanillaLauncherF   = new File (GUIExt.launcherVanilla);
        
        //custom folders
        File custom1            = new File (GUIExt.launcherFolder + "\\custom1");
        File custom2            = new File (GUIExt.launcherFolder + "\\custom2");
        File custom3            = new File (GUIExt.launcherFolder + "\\custom3");
        File customvanilla      = new File (GUIExt.launcherFolder + "\\vanilla");
        
        //booleans for starting check
        Boolean vanilla         = false;
        Boolean launcher        = false;
        Boolean vanillaLauncher = false;
        
        // check which folders exists
        if (launcherF.exists()){// test if launcher exists
            GUIExt.textUpdate("Launcher folder found");
            launcher = true;
            pic.Load(); //launcher exist so pictures can be loaded
                
            if (vanillaLauncherF.exists()){ // test if vanilla minecraft already copied
                GUIExt.textUpdate("Vanilla Minecraft found in launcher folder");
                vanillaLauncher = true;
            }         
        } 
        if (vanillaF.exists()){ // test if vanilla minecraft exists
            GUIExt.textUpdate("Vanilla Minecraft found");
            vanilla = true;
        }
        
        //download/copy
        if(!launcher){
            GUIExt.textUpdate("Launcher folder does not exist, beginning to download Launcher folder");
            (new Download(GUIExt)).execute();
            try {Thread.sleep(10000);} catch (InterruptedException ex) {} //sleep function for waiting downloading to finish
            custom1.mkdirs();
            custom2.mkdirs();
            custom3.mkdirs();
            pic.Load();
        }
        if(!vanilla){
            GUIExt.textUpdate("Vanilla Minecraft folder does not exist. Opening Minecraft.exe");
            Runtime.getRuntime().exec(GUIExt.vanillaExe);
        }
        if(vanilla && !vanillaLauncher){
            GUIExt.textUpdate("Copying .minecraft to launcher");
            customvanilla.mkdirs();
            (new Copy(GUIExt.vanillaFolder,GUIExt.launcherVanilla, GUIExt)).execute();
            try {Thread.sleep(10000);} catch (InterruptedException ex) {} //sleep function for waiting copying to finish
        }
        GUIExt.textUpdate("Starting check is ready!");
        return null; 
    }
}
