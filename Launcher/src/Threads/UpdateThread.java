package Threads;

import Launcher.GUI;
import javax.swing.SwingWorker;


public class UpdateThread extends SwingWorker<String, Object> {
    private GUI                 GUIExt;
    private Launcher.Buttons    buttons;
    //private Files.Zip           zip;
    private Download.Update     update;
    private Files.Copy          copy;
    private Launcher.Pic        pic;
    private String              URL;
    private String              unZipTo;
    private int                 num;
    
    public UpdateThread(GUI GUIExt, String URL, String unZipTo, int num) {
        this.GUIExt     = GUIExt;
        //this.zip        = new Files.Zip(GUIExt);
        this.buttons    = new Launcher.Buttons(GUIExt);
        this.update     = new Download.Update(GUIExt);
        this.copy       = new Files.Copy(GUIExt);
        this.pic        = new Launcher.Pic(GUIExt);
        this.URL        = URL;
        this.unZipTo    = unZipTo;
        this.num        = num;
    } 
    @Override
    public String doInBackground() {
        buttons.Init(false);
        
        // easteregg
        if(this.URL.equals("pidipidipidi")){   
            try {java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.youtube.com/watch?v=n5JiIkjpeDY&t=0m15s"));} 
            catch (java.io.IOException e) {GUIExt.textUpdate("Error: EasterEgg could not be opened :( ");}
            System.exit(0);
        }
        
        copy.start(GUIExt.launcherVanilla, this.unZipTo);
        update.start(this.URL, this.unZipTo);
        
        pic.Change(this.num);
        pic.Load();
        //jar unzip function (not working currently)
        /*
        File tempF = new File(GUIExt.temp); 
        File METAF = new File(GUIExt.META);
        
        // create temp folder and unzipt to it
        tempF.mkdir();
        zip.unZipIt(GUIExt.vanillaJar, GUIExt.temp);
        GUIExt.textUpdate("Jar files unzipped");
                
        // delete META-INF if found
        try { 
            FileUtils.deleteDirectory(METAF);
            GUIExt.textUpdate("META-INF deleted");
        } catch (IOException e) {GUIExt.textUpdate("META-INF not found, skip deleting!");}
                
        
        // delete temp folder
        try { 
            FileUtils.deleteDirectory(tempF);
            GUIExt.textUpdate("Temp folder deleted");
        } catch (IOException e) {GUIExt.textUpdate("ERROR: temp folder not found!");}
        */
        
        buttons.Init(true);        
        GUIExt.textUpdate("Updating Ready!");
        return null;
    }
}
