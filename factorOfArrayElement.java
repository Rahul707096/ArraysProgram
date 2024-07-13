package array;

public class factorOfArrayElement
{

	public static void main(String[] args) 
	{
		int a[]= {6,131,37,145,153,56,33,1634};

		for(int i=0;i<a.length;i++)
		{	
			System.out.println("Factor of "+a[i]);
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{	
					System.out.println(j);
				}
			}
		}

	}

}
