import java.util.Scanner;

class Student
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student ID:");
		byte StudentId=s.nextByte();
		System.out.println("Enter the Student Name:");
		String  StudentName=s.next();
		System.out.println("Enter the Student Gender(M/F):");
		char StudentGender=s.next().charAt(0);
		System.out.println("Enter the Student Age:");
		byte StudentAge=s.nextByte();
		System.out.println("Enter the Student mobile NO.:");
		long StudentMObNo=s.nextLong();
		System.out.println("Enter the Student CGPA:");
		float StudentCGPA=s.nextFloat();
		
		
		
		System.out.println("Enter the Student ID: "+StudentId);
		System.out.println("Enter the Student Name: "+StudentName);
		System.out.println("Enter the Student Gender: "+StudentGender);
		System.out.println("Enter the Student Age: "+StudentAge);
		System.out.println("Enter the Student mobile number: "+StudentMObNo);
		System.out.println("Enter the Student CGPA: "+StudentCGPA);
	}
}
		
		
		
		
		
		