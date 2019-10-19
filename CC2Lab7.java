import java.util.Scanner;
public class CC2Lab7{
   public static void main(String args[]) {
   
   Scanner s=new Scanner(System.in);
      System.out.print("grade:");
      int grade=s.nextInt();
      
      
      if(grade>=91 && grade<=100)
        System.out.println("A");
      else if (grade>=87 && grade<=91)
        System.out.println("B+");
      else if (grade>=83 && grade<=86)
        System.out.println("B");
      else if (grade>=79 && grade<=82)
        System.out.println("C+");
      else if (grade>=75 && grade<=78)
        System.out.println("C");
      else if (grade>=69 && grade<=74)
        System.out.println("D");
      else if(grade<70)
        System.out.println("F");
      
   }
}