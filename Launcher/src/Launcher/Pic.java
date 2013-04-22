package Launcher;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.ImageIcon;

public class Pic{ 
    private GUI GUIExt;
       
    public Pic(GUI GUIExt) {
        this.GUIExt = GUIExt;
    }   
    
    public void Load() {
        // locating specific image
        for(int i = 0; i != 6; i++) {
            ImageIcon image = new ImageIcon(GUIExt.imageFolder + Integer.toString(i) + ".png");
            Image img = image.getImage();  
            Image newimg = img.getScaledInstance(GUIExt.kuva0.getWidth(),GUIExt.kuva0.getHeight(),java.awt.Image.SCALE_SMOOTH);

            // getting image size
            switch(i){
                case 0:{newimg = img.getScaledInstance(GUIExt.kuva0.getWidth(),GUIExt.kuva0.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 1:{newimg = img.getScaledInstance(GUIExt.kuva1.getWidth(),GUIExt.kuva1.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 2:{newimg = img.getScaledInstance(GUIExt.kuva2.getWidth(),GUIExt.kuva2.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 3:{newimg = img.getScaledInstance(GUIExt.kuva3.getWidth(),GUIExt.kuva3.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 4:{newimg = img.getScaledInstance(GUIExt.kuva4.getWidth(),GUIExt.kuva4.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 5:{newimg = img.getScaledInstance(GUIExt.kuva5.getWidth(),GUIExt.kuva5.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
            }

            // setting imageIcon
            image = new ImageIcon(newimg);

            // setting imageIcon to right picture
            switch(i){
                case 0:{GUIExt.kuva0.setIcon(image); break;}
                case 1:{GUIExt.kuva1.setIcon(image); break;}
                case 2:{GUIExt.kuva2.setIcon(image); break;}
                case 3:{GUIExt.kuva3.setIcon(image); break;}
                case 4:{GUIExt.kuva4.setIcon(image); break;}
                case 5:{GUIExt.kuva5.setIcon(image); break;}
            }
            GUIExt.textUpdate("Image " + i + " loaded");
        }
    }
    
    public void Change(int num){
    try{
            File src = new File(GUIExt.custom1Folder + "\\pic.png");
            File dest = new File(GUIExt.imageFolder + (num + 2) +".png");
            OutputStream out;
            InputStream in; 
                    
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {out.write(buffer, 0, length);}
            out.close();
            Load();
        } catch(IOException e){GUIExt.textUpdate("ERROR: custom image file not found!");}  
    }  
}

