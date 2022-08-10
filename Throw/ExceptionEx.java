
public class ExceptionEx
{
	static void validation(int age)
	{ 
      if(age<22)
      {
        throw new ArithmeticException("not valid age");
      }
      else
      {
        System.out.println("welcome to the club");
      }
		
	}

	public static void main(String[] args)
	{
		validation(22);
	}

}
