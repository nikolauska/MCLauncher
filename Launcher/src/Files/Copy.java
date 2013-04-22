package Files;

import Launcher.GUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.SwingWorker;
import org.apache.commons.io.FileUtils;


// Copy funtion by mkyong from http://www.mkyong.com/java/how-to-copy-directory-in-java/
public class Copy extends SwingWorker<String, Object> {
    String src;
    String dest;
    private GUI GUIExt;    
    
    public Copy(String src, String dest, GUI GUIExt) {
        this.src = src;
        this.dest = dest;
        this.GUIExt = GUIExt;
    }
        
    @Override
    public String doInBackground(){
        File srcFolder = new File(this.src);
        File destFolder = new File(this.dest);
            
        try {
            FileUtils.deleteDirectory(destFolder);
            destFolder.mkdir();
            GUIExt.textUpdate("Folder to copy recreated");
        } catch (IOException e) {GUIExt.textUpdate("Folder to copy not found, skipping deleting!"); destFolder.mkdir();} 
            
        try {
            folderCopy copy = new folderCopy(GUIExt);
            copy.copyFolder(srcFolder,destFolder);
        } catch(IOException e){} 
        GUIExt.textUpdate("Copying ready!");               
        return null;
    }    
}
class folderCopy {       
    private GUI GUIExt; 
    public folderCopy(GUI GUIExt) {
        this.GUIExt = GUIExt;
    }
    
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
        GUIExt.textUpdate(src + " --> " + dest);
    }
 }