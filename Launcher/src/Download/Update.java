package Download;

import Launcher.GUI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.SwingWorker;
import org.apache.commons.io.FileUtils;

public class Update extends SwingWorker<String, Object> {
        String dlURL;
        String unZipTo;
        private GUI GUIExt;
        private Files.Zip zip;
        
        public Update(String dlURL, String unZipTo, GUI GUIExt) {
            this.dlURL      = dlURL;
            this.unZipTo    = unZipTo;
            this.GUIExt     = GUIExt;
            this.zip        = new Files.Zip(GUIExt);
        }
        
        @Override
        public String doInBackground() {
            // easteregg
            if(dlURL.equals("pidipidipidi")){   
                try {
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.youtube.com/watch?v=n5JiIkjpeDY&t=0m15s"));
                } catch (java.io.IOException e) {GUIExt.textUpdate("Error: EasterEgg could not be opened :( ");}
                return null;
            }
            
            // download function from http://cookbooks.adobe.com/post_Download_a_file_from_a_URL_in_Java-17947.html
            try
            {
                // start connecting
                GUIExt.textUpdate("Connecting...");
                URL url = new URL(this.dlURL);
                url.openConnection();
                InputStream reader = url.openStream(); 
                FileOutputStream writer;
                writer = new FileOutputStream(GUIExt.zip);
                byte[] buffer = new byte[153600];
                int totalBytesRead = 0;
                int bytesRead;

                while ((bytesRead = reader.read(buffer)) > 0)
                {  
                    writer.write(buffer, 0, bytesRead);
                    buffer = new byte[153600];
                    totalBytesRead += bytesRead;
                    GUIExt.textUpdate("Downloaded: " + (totalBytesRead/1048576) + "MB");
                }
                writer.close();
                
                File tempF = new File(GUIExt.temp); 
                File METAF = new File(GUIExt.META);
                File zipF = new File(GUIExt.zip);
                
                // start unzipping after download
                zip.unZipIt(GUIExt.zip, this.unZipTo);
                GUIExt.textUpdate("Downloaded file unzipped");
                zipF.delete();
                GUIExt.textUpdate("zip file deleted");
                
                
                // create temp folder and unzipt to it
                tempF.mkdir();
                zip.unZipIt(GUIExt.vanillaJar, GUIExt.temp);
                GUIExt.textUpdate("Jar files unzipped");
                
                // delete META-INF if found
                try { 
                    FileUtils.deleteDirectory(METAF);
                    GUIExt.textUpdate("META-INF deleted");
                } catch (IOException e) {GUIExt.textUpdate("META-INF not found, skip deleting!");}
                
                
                // delete temp folder
                try { 
                    FileUtils.deleteDirectory(tempF);
                    GUIExt.textUpdate("Temp folder deleted");
                } catch (IOException e) {GUIExt.textUpdate("ERROR: temp folder not found!");}
                
                //end download
                GUIExt.textUpdate("Ready!");
                
            }
            //inform user from error
            catch (MalformedURLException e){GUIExt.textUpdate("Error: URL cannot be connected!");}
            catch (IOException e){GUIExt.textUpdate("Error: zip file not found!");}
            
            return null;
        }
        public void done()
        {
            GUIExt.done = true;
        }
    }
    
