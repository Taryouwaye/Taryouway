import java.util.*;

public class Kamotesayote{
   public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   
   int a = 0;
   int b = 0;
   int c = 0;
   int d;
   int e;
   
   
   System.out.print("Enter input:");
   a = s.nextInt();
   b = s.nextInt();
   c = s.nextInt();
   
   if(a<=1000 && b<=1000 && c<=1000){
   
   d = a/b;
   e = a%b*c;
   
   System.out.println(d +" kamotes");
   System.out.println(e +" sayotes");
   }else{
   System.out.println("invalid input");
   
   }
    }
    }