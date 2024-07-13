package array;

public class armStrongOfArrayElement
{

	public static void main(String[] args) 
	{
		int a[]= {6,131,37,145,153,56,33,1634};
		int n,r=0,count,p,sum,t,x;
		for(int i=0;i<a.length;i++)
		{
			n=a[i];
			count=0;
			while(n!=0)
			{
				count++;
				n=n/10;
			}
			x=a[i];
			sum=0;
			while(x!=0)
			{
				r=x%10;
				x=x/10;
				
				p=1;
				for(int j=1;j<=count;j++)
				{
					p=p*r;
				}
				sum=sum+p;
			}
			if(sum==a[i])
			{
				System.out.println("ArmStrong No is :- "+a[i]);
			}
			
		}

	}

}
