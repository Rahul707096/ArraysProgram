package array;

public class strongNoOfArrayElement 
{
	public static void main(String[] args)
	{
		int a[]= {6,131,37,145,153,56,33,1634,};
		int n,r,fact,sum=0;
		for(int i=0;i<a.length;i++)
		{
			n=a[i];
			sum=0;
			while(n!=0)
			{
				r=n%10;
				fact=1;
				for(int j=r;j>=1;j--)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				n=n/10;
			}
			if(sum==a[i])
			{
				System.out.println("Strong No. is "+a[i]);
			}
		}
	}

}
