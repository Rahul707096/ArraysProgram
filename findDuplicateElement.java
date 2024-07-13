package array;

public class findDuplicateElement 
{
	public static void main(String[] args) 
	{	
		int a[]= {78,77,17,71,78,17,78,78,17,78,78};
		int b[]=new int[256];
		int n;
		System.out.println("Duplicates Elements is");
		for(int i=0;i<a.length;i++)
		{
			n=a[i];
			b[n]=b[n]+1;
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>1)
			{
				System.out.println((int)i);
			}
		}
		
	}
}
