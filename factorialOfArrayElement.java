package array;

public class factorialOfArrayElement 
{

	public static void main(String[] args) 
	{
		int a[]= {6,131,37,145,153,56,33,1634};
		double f;
		for(int i=0;i<a.length;i++)
		{
			f=1;
			for(int j=a[i];j>=1;j--)
			{
				f=f*j;
			}
			System.out.println("factorial of "+a[i]+" is :- \n"+f);
			
		}

	}

}
