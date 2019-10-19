import java.util.Scanner;

public class Operations{

   public static void main(String[] args){
     
     int e=0;
     int f=0;
     int t=0;
     int g=0;
     
     String operation;
     
     Scanner s= new Scanner (System.in);
      
     System.out.println("Enter # of Operations:");
     e=s.nextInt();
     if (e>=1 && e<=100){
      System.out.println("Enter all operation inone line");
     for(int i=1; i<=e; i++){
      operation=s.next();
      if (operation.equals("negate")){
     t=s.nextInt();
      System.out.println(-1*t);
      }else if (operation.equals("add")){
     t=s.nextInt();
     g=s.nextInt();
      System.out.println(t+g);
      }else if (operation.equals("max")){
     t=s.nextInt();
     g=s.nextInt();
     if (t>g)
      System.out.println(t);
       else
      System.out.println(g);
     
     }
     }
     
     
   
   }
}
}