//Ryan Wong
//2/23/17
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
    		double diff=doub[i]-doub[i+1];
    		diff*=100;
    		diff=(int)diff;
    		diff=(double)diff;
    		diff/=100;
    		
    		System.out.println(doub[i]+" to "+ doub[i+1]+". Change="+diff);
    	}
        
    }
}
