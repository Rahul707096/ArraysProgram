package array;

public class primeFactorOfArrayElement
{

	public static void main(String[] args) 
	{
		int a[]= {6,131,37,145,153,56,33,1634};
		int p;
			
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Prime Factor of "+a[i]);
			for(int j=2;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					p=0;
					for(int k=2;k<j;k++)
					{
						if(j%k==0)
						{
							p=1;
							break;
						}
					}
					if(p==0)
					{
						System.out.println(j);
					}
				}
			}
		}
		
		}
	
	}


