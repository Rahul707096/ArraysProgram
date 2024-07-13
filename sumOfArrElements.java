package array;

public class sumOfArrElements
{
	public static void main(String args[])
	{
		int a[]= {5,6,7,8,9,1};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum is "+sum);
	}
}