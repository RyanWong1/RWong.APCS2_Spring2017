import java.io.*;     // for File
import java.util.*;   // for Scanner

public class Temp {
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner input = new Scanner(new File("./data/weather.txt"));
        String text = input.next();
        System.out.println(text);
    }
}
