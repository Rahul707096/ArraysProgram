package array;

public class primeNoOfArrayElement 
{

	public static void main(String[] args) 
	{
		int p;
		int a[]= {6,131,37,145,153,56,33,1634};
		System.out.println("Prime Number is ");
		for(int i=0;i<a.length;i++)
		{
			p=0;
			for(int j=2;j<a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					p=1;
					break;
				}
			}
			if(p==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
