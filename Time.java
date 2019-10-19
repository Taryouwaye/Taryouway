import java.util.Scanner;

public class Time {
    public static void main(String[] args){
    
    int r = 60;
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter number of minutes: ");
   int input=sc.nextInt();
   
    
    int hr = input /r;
    
    int min = input % r;
    System.out.println(input + " minutes is " + hr + " Hours and " + min +" Minutes");
    
    
    }









}

    