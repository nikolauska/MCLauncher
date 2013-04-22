package Files;

import Launcher.GUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
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

     public void unZipIt(String zipFile, String outputFolder){
     byte[] buffer = new byte[1024];
     try{
    	File folder = new File(zipFile);
    	if(!folder.exists()){
    		folder.mkdir();
    	}

    	ZipInputStream zis = 
    	new ZipInputStream(new FileInputStream(zipFile));
    	ZipEntry ze = zis.getNextEntry();
 
    	while(ze!=null){
    	   String fileName = ze.getName();
           File newFile = new File(outputFolder + File.separator + fileName);
 
           GUIExt.textUpdate("file unzip: " + newFile.getAbsoluteFile());
           if(ze.isDirectory()) 
           {
        	   new File(newFile.getParent()).mkdirs();
           }
           else
           {
        	FileOutputStream fos;
                new File(newFile.getParent()).mkdirs();
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
}