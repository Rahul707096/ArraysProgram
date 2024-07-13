package array;

public class ChangeOddToEvenArray 
{

	public static void main(String[] args) 
	{
		int a[]= {36,37,67,56,88};
		System.out.println("Before changing Array:- ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				a[i]=a[i]+1;
			}
		}
		System.out.println("\nAfter changing Array Odd to Even:- ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}

	}

}
