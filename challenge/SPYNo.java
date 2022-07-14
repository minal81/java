class SPYNo
{
public static void main(String Arg[])
	{
      int ov=1124;
      int sum=0;
      int mul=1;
      int a=ov;
      int rem=0;
			while(a>0)
			{
				rem=a%10;
				sum=sum+rem;
				mul=mul*rem;
				a/=10;
			}
			if(sum==mul)
				{
					System.out.println("This is spy number");
				}
			else
				{
					System.out.println("This is not spy number");
				}
	}
}


