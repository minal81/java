class Test
{
	void binary(int First,int Last,int Arr[],int Mid,int key)
	{
		while(First<=Last)
		{
			if(Arr[Mid]<key)
			{
				First=Mid+1;
			}
			else if(Arr[Mid]==key)
			{
				System.out.println("Number is found");
				break;
			}
			else
			{
				Last=Mid-1;
			}
			Mid=(First+Last)/2;
		}
		if(First > Last)
		{
			System.out.println("number not found");
		}
	}
}
			
class BinarySearch
{
	public static void main(String args[])
	{
		Test T1=new Test();
		int Arr[]={20,25,30,35,40,45};
		int First=0;
		int key=90;
		int Last=(Arr.length-1);
		
		int Mid=(First+Last)/2;
		
		T1.binary(First,Last, Arr,Mid,key);
	}
}
