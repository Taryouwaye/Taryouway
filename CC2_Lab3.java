public class CC2_Lab3{
public static void main(String[] aigs){
char J = 'J';
char I = 'I';
char N = 'N';
char H = 'H';
char O = 'O';
char EE= '!';

int aJ =J;
int aI =I;
int aN =N;
int aH =H;
int aO =O;
int aEE =EE;

System.out.println(J+"-"+aJ);
System.out.println(I+"-"+aI);
System.out.println(N+"-"+aN);
System.out.println(H+"-"+aH);
System.out.println(O+"-"+aO);
System.out.println(EE+"-"+aEE);
System.out.println(""+J+I+N+H+O+EE);

int sum=aJ+aI+aN+aH+aO+aEE;
int product=aJ*aI*aN*aH*aO*aEE;
int Average=sum/6;
int Remainder=product%Average;
System.out.println("sum: "+sum);
System.out.println("product: "+product);
System.out.println("Average: "+Average);
System.out.println("Remainder: "+Remainder);


}
}