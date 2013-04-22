package Files;

import Launcher.GUI;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.SwingWorker;

public class BatWrite extends SwingWorker<String, Object> {
        String pack;
        private GUI GUIExt;
        
        public BatWrite(String pack, GUI GUIExt) {
            this.pack = pack;
            this.GUIExt = GUIExt;
        }
        @Override
        public String doInBackground(){
            try {
            File f = new File(GUIExt.customBat);
            f.createNewFile();
            GUIExt.textUpdate("bat file created");
            BufferedWriter bat;
            bat = new BufferedWriter(new FileWriter(GUIExt.customBat));
            
            bat.write("@echo off");
            bat.write("Title Minecraft Launcher");
            bat.write("set APPDATA=" + GUIExt.launcherFolder + "\\" + this.pack);
            bat.write("start " + GUIExt.launcherFolder + "\\minecraft.exe");
            bat.close();
            
            Process p = Runtime.getRuntime().exec("cmd /c start " + GUIExt.customBat);
            
            try {Thread.sleep(3000);} catch (InterruptedException ex) {}
            f.delete();
            
            } catch (IOException e) {GUIExt.textUpdate("Error: Creating bat file failed!");}
            return null;
       }
}
