package array;

public class perfectNoOfArrayElement
{

	public static void main(String[] args) 
	{
		int a[]= {6,28,131,37,145,153,56,33,1634};
		int sum;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			for(int j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==a[i])
			{
				System.out.println("Perfect No is "+a[i]);
			}
		}

	}

}
