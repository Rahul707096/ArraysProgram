package array;

public class MaxAndMinNoOfArray 
{
	public static void main(String[] args) 
	{
		
		int a[]= {49,57,78,12,36,18,89};
		
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length+1;j++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
				else if(min>a[i])
				{
					min=a[i];
				}
			}
		}
		System.out.println("Largest No. is :- "+max);
		System.out.println("Smallest No. is :- "+min);

	}
}
