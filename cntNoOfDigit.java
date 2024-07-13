package array;

public class cntNoOfDigit
{

	public static void main(String[] args) 
	{
		int a[]= {6,131,37,145,153,56,33,1634,};
		for(int i=0;i<a.length;i++)
		{
			int count=0,r,n=a[i];
			while(n!=0)
			{
				r=n%10;
				count++;
				n=n/10;
			}
			System.out.println("\nCount of "+a[i]+" is "+count);
			
		}

	}

}
