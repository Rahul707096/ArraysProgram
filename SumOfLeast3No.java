package array;

public class SumOfLeast3No 
{

	public static void main(String[] args)
	{
		int a[]= {49,57,78,12,36,18,89};
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		/*
		for(int x:a)
		{
		  System.out.print(x+" ");
		}
		*/
		System.out.println("Sum of Least Of 3 No :- "+(a[0]+a[1]+a[2]));
		
	}

}
