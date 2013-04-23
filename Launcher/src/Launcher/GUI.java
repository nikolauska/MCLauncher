package Launcher;

import Files.BatWrite;
import java.io.IOException;

public class GUI extends javax.swing.JFrame {

    
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        new Threads.StartThread(GUIExt).execute();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        JScrollPane = new javax.swing.JScrollPane();
        teksti = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(214, 2147483647));
        setName("Tanik Launcher"); // NOI18N
        setResizable(false);

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

        teksti.setEditable(false);
        teksti.setColumns(20);
        teksti.setRows(5);
        JScrollPane.setViewportView(teksti);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vanilla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kuva3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(kuva0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(technic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kuva1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kuva4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kuva2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftb, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kuva5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(URL1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(URL2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(URL3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(custom1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(custom2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(custom3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(update3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JScrollPane)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kuva3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kuva4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kuva5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(URL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(URL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(URL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        (new BatWrite   ("custom3", this)).execute();
    }//GEN-LAST:event_custom3ActionPerformed

    private void update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3ActionPerformed
        (new Threads.UpdateThread(GUIExt, URL3.getText(), custom3Folder, 3)).execute();      
    }//GEN-LAST:event_update3ActionPerformed

    private void custom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom2ActionPerformed
        (new BatWrite   ("custom2", this)).execute();
    }//GEN-LAST:event_custom2ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        (new Threads.UpdateThread(GUIExt, URL2.getText(), custom2Folder, 2)).execute(); 
    }//GEN-LAST:event_update2ActionPerformed

    private void custom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom1ActionPerformed
        (new BatWrite   ("custom1", this)).execute();
    }//GEN-LAST:event_custom1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        (new Threads.UpdateThread(GUIExt, URL1.getText(), custom1Folder, 1)).execute(); 
    }//GEN-LAST:event_update1ActionPerformed

    private void ftbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftbActionPerformed
        try {
            Runtime.getRuntime().exec(ftbExe);
            textUpdate("Feed the Beast started");
        } catch (IOException ex) {textUpdate("Error: FTB.exe not found");}        
    }//GEN-LAST:event_ftbActionPerformed

    private void technicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technicActionPerformed
        try {
            Runtime.getRuntime().exec(technicExe);
            textUpdate("Technic Launcher started");
        } catch (IOException ex) {textUpdate("Error: Techniclauncher.exe not found");}      
    }//GEN-LAST:event_technicActionPerformed

    private void vanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanillaActionPerformed
        try {
            Runtime.getRuntime().exec(vanillaExe);
            textUpdate("Vanilla minecraft started");
        } catch (IOException ex) {textUpdate("Error: minecraft.exe not found!");}      
    }//GEN-LAST:event_vanillaActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }  
  
    public void textUpdate(String text) {
        if(!text.equals(lastText)){
            lastText = text;
            tulostus = teksti.getText()+ text + "\n";
            teksti.setText(tulostus);

            int y;
            teksti.selectAll();
            y = teksti.getSelectionEnd();
            teksti.select(y,y);
        }
    }
    
    // path to home folder
    String home          = System.getProperty("user.home");
    
    // path to folders
    public String launcherFolder   = home              + "\\Tanik_Launcher";
    public String vanillaFolder    = home              + "\\AppData\\Roaming\\.minecraft";
    public String launcherVanilla  = launcherFolder    + "\\vanilla\\.minecraft";
    public String custom1Folder    = launcherFolder    + "\\custom1\\.minecraft";
    public String custom2Folder    = launcherFolder    + "\\custom2\\.minecraft";
    public String custom3Folder    = launcherFolder    + "\\custom3\\.minecraft";
    public String imageFolder      = launcherFolder    + "\\Images";
    public String temp             = launcherFolder    + "\\temp";
    public String META             = temp              + "\\META-INF";
    
    // rest of the needed path files       
    public String vanillaExe       = launcherFolder    + "\\minecraft.exe";
    public String technicExe       = launcherFolder    + "\\Technic.exe";
    public String ftbExe           = launcherFolder    + "\\ftb.exe";
    public String customBat        = home              + "\\temp.bat";
    public String custom1Jar       = custom1Folder     + "\\bin\\minecraft.jar";
    public String custom2Jar       = custom2Folder     + "\\bin\\minecraft.jar";
    public String custom3Jar       = custom3Folder     + "\\bin\\minecraft.jar";
    public String vanillaJar       = launcherVanilla   + "\\bin\\minecraft.jar";
    public String zip              = home              + "\\temp.zip";
    
    // Luancher download URL
    public String launcherURL      = "https://dl.dropboxusercontent.com/u/43689307/launcher.zip";
    
    //tulostus tekstejä
    public String tulostus = "";
    public String lastText = "";
    
    //booleans
    public boolean done = false;
    
    //class init
    GUI GUIExt  = this;
    Pic pic     = new Pic(GUIExt);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JTextField URL1;
    private javax.swing.JTextField URL2;
    private javax.swing.JTextField URL3;
    public javax.swing.JButton custom1;
    public javax.swing.JButton custom2;
    public javax.swing.JButton custom3;
    public javax.swing.JButton ftb;
    public javax.swing.JLabel kuva0;
    public javax.swing.JLabel kuva1;
    public javax.swing.JLabel kuva2;
    public javax.swing.JLabel kuva3;
    public javax.swing.JLabel kuva4;
    public javax.swing.JLabel kuva5;
    public javax.swing.JButton technic;
    public javax.swing.JTextArea teksti;
    public javax.swing.JButton update1;
    public javax.swing.JButton update2;
    public javax.swing.JButton update3;
    public javax.swing.JButton vanilla;
    // End of variables declaration//GEN-END:variables
}
