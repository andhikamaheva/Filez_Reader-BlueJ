import javax.swing.*;
import java.io.*;
/**
 * Write a description of class FileViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileViewer extends JFrame
{
    private JTextField txtIsiFile = new JTextField();
    private FileReader fl1 = new FileReader();
    // instance variables - replace the example below with your own
    public FileViewer()
    {
        super("File Viewer V1.0");
        setSize(300,400);

        getContentPane().add(txtIsiFile);
        String nama = fl1.getNama();
        try{
            txtIsiFile.setText(fl1.getNama());
        }
        catch (Exception e){e.printStackTrace();}
                setVisible(true);
    }
    
//    public String bacaFile(String namaFile) throws IOException{
  //      String str = "";
    //    Scanner sc = new Scanner(new File)
    //}
}
