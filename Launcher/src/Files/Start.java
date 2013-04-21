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

        //booleans for starting check
        Boolean vanillaExists   = false;
        Boolean launcherExists  = false;
        Boolean vanillaLauncher = false;

        if (launcherF.exists()){// test if launcher exists
            GUIExt.textUpdate("Launcher folder found");
            launcherExists = true;
            pic.Load();

            if (vanillaF.exists()){ // test if vanilla minecraft exists
                GUIExt.textUpdate("Vanilla Minecraft found");
                vanillaExists = true;

                if (vanillaLauncherF.exists()){ // test if vanilla minecraft already copied
                    GUIExt.textUpdate("Vanilla Minecraft found in launcher folder");
                    vanillaLauncher = true;
                }
            }else{
               GUIExt.textUpdate("Vanilla Minecraft folder does not exist. Opening Minecraft.exe");
               //Process pro = Runtime.getRuntime().exec(vanillaExe);
            }
        } else{
            GUIExt.textUpdate("Launcher folder does not exist, beginning to download Launcher folder");
            (new Download(GUIExt)).execute();
            while (!GUIExt.done){}
        }
        return null; 
    }
}
