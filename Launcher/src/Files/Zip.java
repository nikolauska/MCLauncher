package Files;

import Launcher.GUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Zip{
    private GUI GUIExt;
    List<String> fileList;
    
    public Zip(GUI GUIExt) {
        this.GUIExt = GUIExt;
    }   
    //Zip function from http://www.java-examples.com/create-zip-file-directory-recursively-using-zipoutputstream-example
    public void zip(String src,String dest) { 
        try {
            File f = new File(dest);
            f.delete();
            FileOutputStream fout;
            fout = new FileOutputStream(dest);
            ZipOutputStream zout;
            zout = new ZipOutputStream(fout);
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
                FileInputStream fin;
                fin = new FileInputStream(files[i]);
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

     public void unZipIt(String zipFile, String outputFolder){
        byte[] buffer = new byte[1024];
        try{
           File folder = new File(zipFile);
           if(!folder.exists()){
                   folder.mkdir();
           }

           ZipInputStream zis;
           zis = new ZipInputStream(new FileInputStream(zipFile));
           ZipEntry ze = zis.getNextEntry();

           while(ze!=null){
               String fileName = ze.getName();
               File newFile = new File(outputFolder + File.separator + fileName);

               GUIExt.textUpdate("file unzip: " + newFile.getAbsoluteFile());
               if(ze.isDirectory()){
                   new File(newFile.getAbsoluteFile().getParent()).mkdirs();
               }else {
                   FileOutputStream fos;
                   new File(newFile.getAbsoluteFile().getParent()).mkdirs();
                   fos = new FileOutputStream(newFile);             

                   int len;
                   while ((len = zis.read(buffer)) > 0) 
                   {
                       fos.write(buffer, 0, len);
                   }
                   fos.close();   
               }
               ze = zis.getNextEntry();
           }

           zis.closeEntry();
           zis.close();

           GUIExt.textUpdate("Unzipping done");

       }catch(IOException ex){}
    }  
     

     public void jarUnZip(String zipfile, String outputfolder){
        byte[] buffer = new byte[4096];
        try {
            File zipfileF = new File(zipfile);
            File outputFolderF = new File(outputfolder);
            JarFile zip = new JarFile(zipfileF);

            Enumeration entries = zip.entries();
            while(entries.hasMoreElements()) {
                JarEntry entry = (JarEntry) entries.nextElement();
                File unzipped = new File(outputFolderF,entry.getName());
                GUIExt.textUpdate("file unzip: " + unzipped.getAbsoluteFile());

                if (entry.isDirectory() && !unzipped.exists()){
                    unzipped.mkdirs();
                    continue;
                } else if (!unzipped.getParentFile().exists()) {
                    unzipped.getParentFile().mkdirs();
                }

                InputStream in;
                in = zip.getInputStream(entry);
                FileOutputStream fos;
                fos = new FileOutputStream(unzipped);

                int count;
                while((count = in.read(buffer, 0, buffer.length)) != -1) {
                    fos.write(buffer, 0, count);
                }

                // clean up
                fos.close();
                in.close();
            }
        } catch (IOException ex) {GUIExt.textUpdate("ERROR: Unzipping jar failed!");}
   }
}
