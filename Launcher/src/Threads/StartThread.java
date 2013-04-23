package Threads;

import Launcher.GUI;
import javax.swing.SwingWorker;

public class StartThread extends SwingWorker<String, Object> {
    private GUI GUIExt;
    private Launcher.Buttons buttons;
    private Files.Start check;
    
    public StartThread(GUI GUIExt) {
        this.GUIExt     = GUIExt;
        this.check      = new Files.Start(GUIExt);
        this.buttons    = new Launcher.Buttons(GUIExt);
    } 
     @Override
    public String doInBackground() {
        buttons.Init(false);
        
        check.start();// start downloading launcher
        
        buttons.Init(true);
        GUIExt.textUpdate("Starting check is ready!"); 
        return null;       
    }
}
