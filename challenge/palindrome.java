class palindrome
{
public static void main(String Arg[])
{
      int ov=121;
      int sum=0;
      int a=ov;
      int rem=0;
			while(a>0)
				{
					rem=a%10;
					sum=sum*10+rem;
					a/=10;
				}
			if(sum==ov)
				{
					System.out.println("This is palindrome number");
				}
			else
				{
					System.out.println("This is not palindrome number");
				}
		}
	}
	
