package pinger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Inputfile extends MainForm {
    String text;
    public void fileInput(String text)
    {
        this.text = text;
        File filePath = new File("C:/Program Files (x86)/Pinger/logs.txt");
        String texts = "============================================\n";
        Date currentDate = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy 'time' hh:mm:ss\n\n");

        String buffer = formatForDateNow.format(currentDate) + text + texts;
        try {
            if (filePath.createNewFile() == true){
                byte[] bs = buffer.getBytes();
                Files.write(Paths.get(filePath.toURI()), bs);
            }
            else {
                byte[] bs = buffer.getBytes();
                Files.write(Paths.get(filePath.toURI()), bs, StandardOpenOption.APPEND);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
