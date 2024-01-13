import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {

        String pathFileName = "C:\\Users\\meeta\\Desktop\\Java\\test.txt";

        // Writing..
        try {
            File fileExist = new File(pathFileName);
            if (fileExist.delete())
                System.out.println("File was there!");

            FileWriter writer = new FileWriter(pathFileName, true);
            // FileWriter writer = new FileWriter(pathFileName,true); - if Append

            writer.write("Writing something, " + myNum);
            writer.close();
        }

        catch (Exception e) {
        }

        // Reading..
        try {
            File fileRead = new File(pathFileName);
            Scanner reader = new Scanner(fileRead);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            
            reader.close();
        } catch (Exception e) {
            System.out.println("Error occurred");

        }

    }
}