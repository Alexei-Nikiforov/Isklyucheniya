package DZ_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWrite {
    public static void createFile(String[] array) throws IOException {
        String fileName = array[0] + ".txt";
        try {
            File path = new File(fileName);

            if (!path.exists()){
                path.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

            String writeString = ("<") + String.join("> <", array) + (">");

            bw.write(writeString);
            bw.newLine();
            bw.close();

        } catch (IOException e){
            throw new IOException("Произошла ошибка во время создания/записи файла");
        }
    }
}