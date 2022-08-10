class WrapperClass
{
public static void main(String arg[])
	{
		int a=14;
		int b=15;
		int c=17;
		Integer p=Integer.valueOf(a);
		Integer q=Integer.valueOf(b);
		Integer r=Integer.valueOf(c);
		if(p.equals(a)|| q.equals(b)||r.equals(c))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same because one is datatype and other is wrapper class object");
		}
	}
}
