import java.io.*;
import java.text.DecimalFormat;
public class Room {
    public static void main(String[] args)throws IOException{
    
    double l = 0;
    double w = 0;
    
    DecimalFormat b = new DecimalFormat ("0.00"); 
    
    BufferedReader f = new BufferedReader(new InputStreamReader (System.in));
    
    
    System.out.println("Enter length: ");
    l = Double.parseDouble(f.readLine());
    System.out.println("Enter width: ");
    w = Double.parseDouble(f.readLine());
    System.out.println("The floor space of the room is " + b.format(l*w) + " square units.");
    
    
    }
    }