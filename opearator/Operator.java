import java.util.Scanner;
class Operator
{
public static void  main(String arg[])
		{
		byte a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values A &B");
		a=s.nextByte();
		b=s.nextByte();

		System.out.println("Addition of A & B =  "+(a+b));
		System.out.println("Substraction of A & B = "+(a-b));
		System.out.println("Multiplication  of A & B ="+(a*b));
		System.out.println("remainder of A & B = "+(a%b));
		System.out.println("Division of A & B ="+(a/b));
		}
}
