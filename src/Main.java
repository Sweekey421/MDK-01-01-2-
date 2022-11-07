import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
        {
            String filename="C:\\Users\\ПК\\OneDrive\\Рабочий стол\\Домашка\\z.txt";
            FileWriter fw = new FileWriter(filename,true);
            fw.write("Java Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ПК\\OneDrive\\Рабочий стол\\Домашка\\z.txt"));
            while (strLine != null)
            {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}