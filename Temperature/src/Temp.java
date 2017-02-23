import java.io.*;     // for File
import java.util.*;   // for Scanner

public class Temp {
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner input = new Scanner(new File("./data/weather.txt"));
    	double[] doub=new double[8];
    	for(int i=0;i<8;i++){
    		doub[i]= input.nextDouble();
    	}
    	for(int i=0;i<7;i++){
    		System.out.println(doub[i]+" to "+ doub[i+1]+". Change="+(doub[i]-doub[i+1]));
    	}
        
    }
}
