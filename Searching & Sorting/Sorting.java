import java.util.*;
class Sorting
{
	public static void  main(String Arg[])
	{
		int[] Arr=new int[5];
		int temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 values for sorting");
		for(int i=0;i<5;i++)
		{
		Arr[i]=sc.nextInt();
		}
		System.out.println("DESENDING ORDER");
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(Arr[i]<Arr[j])
				{
					temp=Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=temp;
				}
			}
		}
		int[] Arr1=new int[5];
		for(int i=0;i<5;i++)
		{
		Arr1[i]=Arr[i];
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
          if(Arr1[i]>Arr1[j])
          {
            temp=Arr1[i];
            Arr1[i]=Arr1[j];
            Arr1[j]=temp;
          }
			}
		}
		
		
      for(int i=0;i<5;i++)
      {
          System.out.println(" "+Arr[i]);
      }
      System.out.println("");
      System.out.println("ASENDING ORDER");
      for(int i=0;i<5;i++)
      {
          System.out.println(" "+Arr1[i]);
      }
	}
}

