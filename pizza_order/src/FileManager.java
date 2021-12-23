import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) throws IOException {

    }
    static ArrayList<String> read(){
        ArrayList<String> list = new ArrayList<>();
        try {
            File myObj = new File("hello1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);
            }
            myReader.close();
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

    static String arraylistToString(ArrayList<String > list){
        String listString = String.join("\n ", list);
        return listString;
    }


    static void append(String text){
        String newText = text + "\n";
        try {
            Files.write(Paths.get("hello1.txt"), newText.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}