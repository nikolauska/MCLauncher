package Launcher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.SwingWorker;

public class BatWrite extends SwingWorker<String, Object> {
        String pack;
        private GUI GUIExt;
        String home = System.getProperty("user.home");
        String customBat = home + "\\temp.bat";
        
        public BatWrite(String pack, GUI GUIExt) {
            this.pack = pack;
            this.GUIExt = GUIExt;
        }
        @Override
        public String doInBackground(){
            try {
            File f = new File(customBat);
            f.createNewFile();
            GUIExt.textUpdate("bat file created");
            BufferedWriter bat;
            bat = new BufferedWriter(new FileWriter(customBat));
            bat.write(  
                        "@echo off" + "\n" +
                        "Title Minecraft Launcher" + "\n" +
                        "set APPDATA=%CD%\\" + this.pack + "\n" +
                        "start %CD%\\minecraft.exe"
                     );
            bat.close();
            Process p = Runtime.getRuntime().exec("cmd /c start " + customBat);
            
            try {Thread.sleep(3000);} catch (InterruptedException ex) {}
            f.delete();
            
            } catch (IOException e) {GUIExt.textUpdate("Error: Creating bat file failed!");}
            return null;
       }
}
