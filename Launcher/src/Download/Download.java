package Download;

import Launcher.GUI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.SwingWorker;

public class Download extends SwingWorker<String, Object> {
    private GUI GUIExt;
    private Files.Zip zip;
    
    public Download(GUI GUIExt) {
        this.GUIExt = GUIExt;
        this.zip = new Files.Zip(GUIExt);
    }   
    
    @Override
    public String doInBackground() {

        // download function from http://cookbooks.adobe.com/post_Download_a_file_from_a_URL_in_Java-17947.html
        try
        {
            // start connecting
            GUIExt.textUpdate("Connecting...");
            URL url = new URL(GUIExt.launcherURL);
            url.openConnection();
            InputStream reader = url.openStream(); 
            FileOutputStream writer;
            writer = new FileOutputStream(GUIExt.zip);
            byte[] buffer = new byte[153600];
            int totalBytesRead = 0;
            int bytesRead;

            while ((bytesRead = reader.read(buffer)) > 0){  
                writer.write(buffer, 0, bytesRead);
                buffer = new byte[153600];
                totalBytesRead += bytesRead;
                GUIExt.textUpdate("Downloaded: " + (totalBytesRead/1048576) + "MB");
            }
            writer.close();

            File zipF = new File(GUIExt.zip);

            // start unzipping after download
            zip.unZipIt(GUIExt.zip, GUIExt.launcherFolder);
            GUIExt.textUpdate("Downloaded file unzipped");
            zipF.delete();
            GUIExt.textUpdate("zip file deleted");

        }
        catch (MalformedURLException e){GUIExt.textUpdate("Error: URL cannot be connected!");}
        catch (IOException e){GUIExt.textUpdate("Error: zip file not found!");}

        return null;
    }
}
