package Launcher;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class Zip{
    private GUI GUIExt;
       
    public Zip(GUI GUIExt) {
        this.GUIExt = GUIExt;
    }   
    //Zip function from http://www.java-examples.com/create-zip-file-directory-recursively-using-zipoutputstream-example
    public void zip(String src,String dest) { 
        try {
            File f = new File(dest);
            f.delete();
            FileOutputStream fout = new FileOutputStream(dest);
            ZipOutputStream zout = new ZipOutputStream(fout);
            File fileSource = new File(src);
            ZipIt(zout, fileSource);
            zout.close();
                       
            GUIExt.textUpdate("Jar file has been created!");
                       
        } catch(IOException e){GUIExt.textUpdate("Error: Jar file could not be created");}
    }
    
        public void ZipIt(ZipOutputStream zout, File fileSource) {
        File[] files = fileSource.listFiles();
        GUIExt.textUpdate("Adding directory " + fileSource.getName());
               
        for(int i=0; i < files.length; i++) {
            if(files[i].isDirectory()){
                ZipIt(zout, files[i]);
                continue;
            }
                       
            try {
                GUIExt.textUpdate("Adding file " + files[i].getName());
                             
                byte[] buffer = new byte[1024];
                FileInputStream fin = new FileInputStream(files[i]);
                zout.putNextEntry(new ZipEntry(files[i].getName()));

                int length;
                while((length = fin.read(buffer)) > 0){
                    zout.write(buffer, 0, length);
                }
                zout.closeEntry();
                fin.close();

            } catch(IOException ioe) {GUIExt.textUpdate("Error: Adding file/directory to jar failed!");}
        }          
    }
    
    // unzip function (can't remember where this was found)
    public void unZip(String strZipFile, String unZipTo) {
        try {
            File fSourceZip = new File(strZipFile);
            String zipPath = strZipFile.substring(0, strZipFile.length()-4);
            File temp1;
            temp1 = new File(unZipTo);
            temp1.mkdir();
            GUIExt.textUpdate(zipPath + " opened");

            ZipFile zipFile;
            zipFile = new ZipFile(fSourceZip);
            Enumeration e = zipFile.entries();
                       
            while(e.hasMoreElements()) {
                ZipEntry entry = (ZipEntry)e.nextElement();
                File destinationFilePath = new File(unZipTo,entry.getName());
 
                destinationFilePath.getParentFile().mkdirs();
                               
                if(entry.isDirectory()){
                    continue;
                } else {
                    GUIExt.textUpdate("Unzipping: " + entry);
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
                }
            }            
            zipFile.close();            
        }
        catch(IOException e){GUIExt.textUpdate("Error: file not found!");}               
    }
}
