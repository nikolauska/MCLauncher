package Launcher;

import Download.Download;
import java.io.File;
import java.io.IOException;
import javax.swing.SwingWorker;

public class Start extends SwingWorker<String, Object> { 
    private GUI GUIExt;
       
    public Start(GUI GUIExt) {
        this.GUIExt = GUIExt;
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
            GUIExt.pic.Load();

            if (vanillaF.exists()){ // test if vanilla minecraft exists
                GUIExt.textUpdate("Vanilla minecraft found");
                vanillaExists = true;

                if (vanillaLauncherF.exists()){ // test if vanilla minecraft already copied
                    GUIExt.textUpdate("Vanilla minecraft found in launcher folder");
                    vanillaLauncher = true;
                }
            }else{

            }
        } else{
            GUIExt.textUpdate("Launcher folder does not exist, beginning to download Launcher folder");
            (new Download(GUIExt)).execute();
            while (!GUIExt.done){}
        }
        return null; 
    }
}
