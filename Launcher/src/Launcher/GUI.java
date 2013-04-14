package Launcher;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;
import org.apache.commons.io.*;

public class GUI extends javax.swing.JFrame {

    
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        (new buttons(false)).execute();
        (new picLoad(0)).execute();
        (new picLoad(1)).execute();
        (new picLoad(2)).execute();
        (new picLoad(3)).execute();
        (new picLoad(4)).execute();
        (new picLoad(5)).execute();
        (new buttons(true)).execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teksti = new javax.swing.JLabel();
        URL1 = new javax.swing.JTextField();
        technic = new javax.swing.JButton();
        kuva3 = new javax.swing.JLabel();
        ftb = new javax.swing.JButton();
        kuva0 = new javax.swing.JLabel();
        URL3 = new javax.swing.JTextField();
        kuva1 = new javax.swing.JLabel();
        update1 = new javax.swing.JButton();
        custom2 = new javax.swing.JButton();
        update3 = new javax.swing.JButton();
        kuva4 = new javax.swing.JLabel();
        update2 = new javax.swing.JButton();
        kuva5 = new javax.swing.JLabel();
        vanilla = new javax.swing.JButton();
        kuva2 = new javax.swing.JLabel();
        custom3 = new javax.swing.JButton();
        custom1 = new javax.swing.JButton();
        URL2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(214, 2147483647));
        setName("Tanik Launcher"); // NOI18N
        setResizable(false);

        teksti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teksti.setText("Valmis");

        URL1.setText("Download URL");
        URL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URL1ActionPerformed(evt);
            }
        });

        technic.setBackground(new java.awt.Color(255, 255, 255));
        technic.setText("Technic launcher");
        technic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technicActionPerformed(evt);
            }
        });

        ftb.setBackground(new java.awt.Color(255, 255, 255));
        ftb.setText("Feed the Beast");
        ftb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftbActionPerformed(evt);
            }
        });

        URL3.setText("Download URL");

        update1.setBackground(new java.awt.Color(255, 255, 255));
        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        custom2.setBackground(new java.awt.Color(255, 255, 255));
        custom2.setText("Custom 2");
        custom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom2ActionPerformed(evt);
            }
        });

        update3.setBackground(new java.awt.Color(255, 255, 255));
        update3.setText("Update");
        update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update3ActionPerformed(evt);
            }
        });

        update2.setBackground(new java.awt.Color(255, 255, 255));
        update2.setText("Update");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        vanilla.setBackground(new java.awt.Color(255, 255, 255));
        vanilla.setText("Vanilla");
        vanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanillaActionPerformed(evt);
            }
        });

        custom3.setBackground(new java.awt.Color(255, 255, 255));
        custom3.setText("Custom 3");
        custom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom3ActionPerformed(evt);
            }
        });

        custom1.setBackground(new java.awt.Color(255, 255, 255));
        custom1.setText(" Custom 1");
        custom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom1ActionPerformed(evt);
            }
        });

        URL2.setText("Download URL");
        URL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URL2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(vanilla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kuva3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(kuva0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(technic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(custom2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(update2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kuva4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kuva1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kuva2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftb, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(kuva5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(custom3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(update3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(URL3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(teksti, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custom1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(URL1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(URL2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kuva1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kuva0, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kuva2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vanilla)
                    .addComponent(technic)
                    .addComponent(ftb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teksti, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kuva4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(kuva3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kuva5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custom1)
                    .addComponent(custom2)
                    .addComponent(custom3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update1)
                    .addComponent(update2)
                    .addComponent(update3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(URL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(URL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(URL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void URL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_URL1ActionPerformed

    private void URL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_URL2ActionPerformed

    private void custom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom3ActionPerformed
        (new batWrite   ("custom3")).execute();
    }//GEN-LAST:event_custom3ActionPerformed

    private void update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3ActionPerformed
        (new buttons    (false)).execute();
        
        File f = new File(custom3Folder);
        try {
            FileUtils.deleteDirectory(f);
            f.mkdir();
        } catch (IOException e) {teksti.setText("ERROR: Folder not found, skipping deleting!"); f.mkdir();}
        (new Copy       (launcherVanilla,custom3Folder)).execute();
        (new Download   (URL3.getText(), custom3Folder, custom3Jar)).execute();
        
        (new buttons    (true)).execute();
    }//GEN-LAST:event_update3ActionPerformed

    private void custom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom2ActionPerformed
        (new batWrite   ("custom2")).execute();
    }//GEN-LAST:event_custom2ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        (new buttons    (false)).execute();
        
        File f = new File(custom2Folder);
        try {
            FileUtils.deleteDirectory(f);
            f.mkdir();
        } catch (IOException e) {teksti.setText("ERROR: Folder not found, skipping deleting!"); f.mkdir();}
        (new Copy       (launcherVanilla,custom2Folder)).execute();
        (new Download   (URL2.getText(), custom2Folder, custom2Jar)).execute();
        
        (new buttons    (true)).execute();
    }//GEN-LAST:event_update2ActionPerformed

    private void custom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom1ActionPerformed
        (new batWrite   ("custom1")).execute();
    }//GEN-LAST:event_custom1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        (new buttons    (false)).execute();
        
        File f = new File(custom1Folder);
        try {
            FileUtils.deleteDirectory(f);
            f.mkdir();
        } catch (IOException e) {teksti.setText("ERROR: Folder not found, skipping deleting!"); f.mkdir();}
        (new Copy       (launcherVanilla,custom1Folder)).execute();
        (new Download   (URL1.getText(), desktop, custom1Jar)).execute();
        
        (new buttons    (true)).execute();
    }//GEN-LAST:event_update1ActionPerformed

    private void ftbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftbActionPerformed
        try {
            Runtime.getRuntime().exec(ftbExe);
            teksti.setText("Feed the Beast started");
        } catch (IOException ex) {teksti.setText("Error: FTB.exe not found");}        
    }//GEN-LAST:event_ftbActionPerformed

    private void technicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technicActionPerformed
        try {
            Runtime.getRuntime().exec(technicExe);
            teksti.setText("Technic Launcher started");
        } catch (IOException ex) {teksti.setText("Error: Techniclauncher.exe not found");}      
    }//GEN-LAST:event_technicActionPerformed

    private void vanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanillaActionPerformed
        try {
            Runtime.getRuntime().exec(vanillaExe);
            teksti.setText("Vanilla minecraft started");
        } catch (IOException ex) {teksti.setText("Error: minecraft.exe not found!");}      
    }//GEN-LAST:event_vanillaActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
 
    class buttons extends SwingWorker<String, Object> {
        boolean yes;
        
        public buttons(boolean yes) {
            this.yes = yes;
        }
        @Override
        public String doInBackground() {      
            custom1.setEnabled(this.yes);
            custom2.setEnabled(this.yes);
            custom3.setEnabled(this.yes);
            ftb.    setEnabled(this.yes);
            technic.setEnabled(this.yes);
            update1.setEnabled(this.yes);
            update2.setEnabled(this.yes);
            update3.setEnabled(this.yes);
            vanilla.setEnabled(this.yes);
            return null;
       }
    }
    
     class batWrite extends SwingWorker<String, Object> {
        String pack;
        
        public batWrite(String pack) {
            this.pack = pack;
        }
        @Override
        public String doInBackground(){
            try {
            File f = new File(customBat);
            f.createNewFile();
            BufferedWriter bat;
            bat = new BufferedWriter(new FileWriter(customBat));
            bat.write(  
                        "@echo off" + "\n" +
                        "Title Minecraft Launcher" + "\n" +
                        "set APPDATA=%CD%\\" + this.pack + "\n" +
                        "start %CD%\\minecraft.exe"
                     );
            bat.close();
            //Process p = Runtime.getRuntime().exec("cmd /c start " + customBat);
            //p.waitFor();
            //f.delete();       
            } catch (IOException e) {teksti.setText("Error: Creating bat file failed!");}
            return null;
       }
    }
    
    class Download extends SwingWorker<String, Object> {
        String dlURL;
        String unZipTo;
        String customJar;
        
        public Download(String dlURL, String unZipTo, String customJar) {
            this.dlURL      = dlURL;
            this.unZipTo    = unZipTo;
            this.customJar  = customJar;
        }
        
        @Override
        public String doInBackground() {
            // easteregg
            if(dlURL.equals("pidipidipidi")){   
                try {
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.youtube.com/watch?v=n5JiIkjpeDY&t=0m15s"));
                } catch (java.io.IOException e) {teksti.setText("Error: EasterEgg could not be opened :( ");}
                return null;
            }
            
            // download function from http://cookbooks.adobe.com/post_Download_a_file_from_a_URL_in_Java-17947.html
            try
            {
                // start connecting
                teksti.setText("Connecting...");
                URL url = new URL(this.dlURL);
                url.openConnection();
                InputStream reader = url.openStream(); 
                FileOutputStream writer = new FileOutputStream(zip);
                byte[] buffer = new byte[153600];
                int totalBytesRead = 0;
                int bytesRead;

                while ((bytesRead = reader.read(buffer)) > 0)
                {  
                    writer.write(buffer, 0, bytesRead);
                    buffer = new byte[153600];
                    totalBytesRead += bytesRead;
                    teksti.setText("Downloaded: " + (totalBytesRead/1048576) + "MB");
                }
                writer.close();
                
                File tempF = new File(temp); 
                File METAF = new File(META);
                File zipF = new File(zip);
                
                // start unzipping after download
                unZipIt(zip, this.unZipTo);
                teksti.setText("Downloaded file unzipped");
                zipF.delete();
                teksti.setText("zip file deleted");
                
                
                // create temp folder and unzipt to it
                tempF.mkdir();
                unZipIt(vanillaJar, temp);
                unZipIt(customJar, temp);
                teksti.setText("Jar files unzipped");
                
                // delete META-INF if found
                try { 
                    FileUtils.deleteDirectory(METAF);
                    teksti.setText("META-INF deleted");
                } catch (IOException e) {teksti.setText("META-INF not found, skip deleting!");}
                
                zip(temp,customJar);
                
                // delete temp folder
                try { 
                    FileUtils.deleteDirectory(tempF);
                    teksti.setText("Temp folder deleted ");
                } catch (IOException e) {teksti.setText("ERROR: temp folder not found!");}
                
                //end download
                teksti.setText("Ready!");
                
            }
            //inform user from error
            catch (MalformedURLException e){teksti.setText("Error: URL cannot be connected!");}
            catch (IOException e){teksti.setText("Error: Place to save file was incorrect");}
            
            return null;
        }
    }
    
    class Copy extends SwingWorker<String, Object> {
        String src;
        String dest;
        
        public Copy(String src, String dest) {
            this.src = src;
            this.dest = dest;
        }
        
        @Override
        public String doInBackground(){
            
            File srcFolder = new File(this.src);
            File destFolder = new File(this.dest);
            
            try {
                FileUtils.deleteDirectory(destFolder);
                destFolder.mkdir();
                teksti.setText("Folder to copy recreated");
            } catch (IOException e) {teksti.setText("Folder to copy not found, skipping deleting!"); destFolder.mkdir();} 
            
            try {
                copyFolder(srcFolder,destFolder);
            } catch(IOException e){teksti.setText("Error: Folder to Copy was not found!");} 
                       
            return null;
        }
    }
    
    class picLoad extends SwingWorker<String, Object> {
        int customNum;
        
        public picLoad (int customNum){
            this.customNum = customNum;
        }
       
        @Override
        public String doInBackground() {
            // locating specific image
            ImageIcon image = new ImageIcon(imageFolder + Integer.toString(this.customNum) + ".png");
            Image img = image.getImage();  
            Image newimg = img.getScaledInstance(kuva0.getWidth(),kuva0.getHeight(),java.awt.Image.SCALE_SMOOTH);
             
            // getting image size
            switch(customNum){
                case 0:{newimg = img.getScaledInstance(kuva0.getWidth(),kuva0.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 1:{newimg = img.getScaledInstance(kuva1.getWidth(),kuva1.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 2:{newimg = img.getScaledInstance(kuva2.getWidth(),kuva2.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 3:{newimg = img.getScaledInstance(kuva3.getWidth(),kuva3.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 4:{newimg = img.getScaledInstance(kuva4.getWidth(),kuva4.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                case 5:{newimg = img.getScaledInstance(kuva5.getWidth(),kuva5.getHeight(),  java.awt.Image.SCALE_SMOOTH); break;}
                default:{teksti.setText("Error: Incorrect image number");}
            }
            // setting imageIcon
            image = new ImageIcon(newimg);
             
            // setting imageIcon to right picture
            switch(customNum){
                case 0:{kuva0.setIcon(image); break;}
                case 1:{kuva1.setIcon(image); break;}
                case 2:{kuva2.setIcon(image); break;}
                case 3:{kuva3.setIcon(image); break;}
                case 4:{kuva4.setIcon(image); break;}
                case 5:{kuva5.setIcon(image); break;}
                default:{teksti.setText("Error: Incorrect image number");}
            }
            teksti.setText("Images loaded");
            return null;
        }
     }
    
    // Copy funtion by mkyong from http://www.mkyong.com/java/how-to-copy-directory-in-java/
    public void copyFolder(File src, File dest) throws IOException{
        if(src.isDirectory()){
            if(!dest.exists()) {dest.mkdir();}

            String files[] = src.list();

            for (String file : files) {
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);
                copyFolder(srcFile,destFile);
            }
        } else {
            OutputStream out;
            try (InputStream in = new FileInputStream(src)) {
                out = new FileOutputStream(dest);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = in.read(buffer)) > 0) {out.write(buffer, 0, length);}
            }
            out.close();
        }
        teksti.setText(src + " --> " + dest);
    }
    
    // unzip function (can't remember where this was found)
    public void unZipIt(String strZipFile, String unZipTo) {
        try {
            File fSourceZip = new File(strZipFile);
            String zipPath = strZipFile.substring(0, strZipFile.length()-4);
            File temp = new File(unZipTo);
            temp.mkdir();
            teksti.setText(zipPath + " created");

            ZipFile zipFile = new ZipFile(fSourceZip);
            Enumeration e = zipFile.entries();
                       
            while(e.hasMoreElements()) {
                ZipEntry entry = (ZipEntry)e.nextElement();
                File destinationFilePath = new File(unZipTo,entry.getName());
 
                destinationFilePath.getParentFile().mkdirs();
                               
                if(entry.isDirectory()){
                    continue;
                } else {
                    teksti.setText("Unzipping: " + entry);
                    BufferedInputStream bis = new BufferedInputStream(zipFile.getInputStream(entry));                    
                    byte buffer[] = new byte[1024];
                    FileOutputStream fos = new FileOutputStream(destinationFilePath);
                    BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
                    
                    int b;
                    while ((b = bis.read(buffer, 0, 1024)) != -1) {
                        bos.write(buffer, 0, b);
                    }

                    bos.flush();
                    bos.close();                                      
                    bis.close();
                    fos.close();
                }
            }            
            zipFile.close();            
        }
        catch(IOException e){teksti.setText("Error: Zipfile not found!");}               
    }
      
    //Zip function from http://www.java-examples.com/create-zip-file-directory-recursively-using-zipoutputstream-example
    public void zip(String src,String dest) { 
        try {
            FileOutputStream fout = new FileOutputStream(dest);
            ZipOutputStream zout = new ZipOutputStream(fout);
            File fileSource = new File(src);
            ZipIt(zout, fileSource);
            zout.close();
                       
            teksti.setText("Jar file has been created!");
                       
        } catch(IOException e){teksti.setText("Error: Jar file could not be created");}
    }
    
    public void ZipIt(ZipOutputStream zout, File fileSource) {
        File[] files = fileSource.listFiles();
        teksti.setText("Adding directory " + fileSource.getName());
               
        for(int i=0; i < files.length; i++) {
            if(files[i].isDirectory()){
                ZipIt(zout, files[i]);
                continue;
            }
                       
            try {
                teksti.setText("Adding file " + files[i].getName());
                             
                byte[] buffer = new byte[1024];
                FileInputStream fin = new FileInputStream(files[i]);
                zout.putNextEntry(new ZipEntry(files[i].getName()));

                int length;
                while((length = fin.read(buffer)) > 0){
                    zout.write(buffer, 0, length);
                }
                zout.closeEntry();
                fin.close();

            } catch(IOException ioe) {teksti.setText("Error: Adding file/directory to jar failed!");}
        }
               
    }
    
    public void picChange(int customNum){
        try{
            File src = new File(custom1Folder + "\\pic.png");
            File dest = new File(imageFolder + (customNum + 2) +".png");
            OutputStream out;
            InputStream in; 
                    
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {out.write(buffer, 0, length);}
            out.close();
            (new picLoad(customNum)).execute();
            teksti.setText("New image loaded");
        } catch(IOException e){teksti.setText("ERROR: custom image file not found!");}                   
    }
    
    // path to roaming folder
    String Roaming          = System.getProperty("user.home") + "\\AppData\\Roaming\\";
    
    // path to folders
    String launcherFolder   = Roaming           + "Tanik_Launcher";
    String vanillaFolder    = Roaming           + ".minecraft";
    String launcherVanilla  = launcherFolder    + "\\vanilla";
    String custom1Folder    = launcherFolder    + "\\custom1\\.minecraft";
    String custom2Folder    = launcherFolder    + "\\custom2\\.minecraft";
    String custom3Folder    = launcherFolder    + "\\custom3\\.minecraft";
    //String imageFolder    = launcherFolder    + "Images\\";
    String imageFolder      = "D:\\Ohjelmointi\\Java\\Launcher\\src\\Images\\"; // WIP folder
    String temp             = launcherFolder    + "\\temp";
    String META             = temp              + "\\META-INF";
    
    // rest of the needed path files       
    String vanillaExe       = launcherFolder    + "\\minecraft.exe";
    String technicExe       = launcherFolder    + "\\techniclauncher.exe";
    String ftbExe           = launcherFolder    + "\\ftb.exe";
    String desktop          = "Z:\\Dox\\Desktop";
    //String zip            = Roaming           + "\\temp.zip";
    String zip              = "Z:\\Dox\\Desktop\\temp.zip";
    //String customBat        = Roaming           + "\\temp.bat";
    String customBat        = "Z:\\Dox\\Desktop\\temp.bat";
    String custom1Jar       = custom1Folder     + "\\bin\\minecraft.jar";
    String custom2Jar       = custom2Folder     + "\\bin\\minecraft.jar";
    String custom3Jar       = custom3Folder     + "\\bin\\minecraft.jar";
    String vanillaJar       = launcherVanilla   + "\\.minecraft\\bin\\minecraft.jar";
    
    //download URL and version number
    String launcherURL      = "";
    String versio           = "0.1";  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField URL1;
    private javax.swing.JTextField URL2;
    private javax.swing.JTextField URL3;
    private javax.swing.JButton custom1;
    private javax.swing.JButton custom2;
    private javax.swing.JButton custom3;
    private javax.swing.JButton ftb;
    private javax.swing.JLabel kuva0;
    private javax.swing.JLabel kuva1;
    private javax.swing.JLabel kuva2;
    private javax.swing.JLabel kuva3;
    private javax.swing.JLabel kuva4;
    private javax.swing.JLabel kuva5;
    private javax.swing.JButton technic;
    public javax.swing.JLabel teksti;
    private javax.swing.JButton update1;
    private javax.swing.JButton update2;
    private javax.swing.JButton update3;
    private javax.swing.JButton vanilla;
    // End of variables declaration//GEN-END:variables
}
