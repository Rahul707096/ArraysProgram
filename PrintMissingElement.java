package array;

public class PrintMissingElement 
{

	public static void main(String[] args)
	{
		int a[]= {10,12,11,15};
		int low=10,high=15;
		int p;
		for(int i=low;i<=high;i++)
		{
			p=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
					p=1;
					break;
				}
			}
			if(p==0)
			{
			System.out.println(i);
			}
		}
		

	}

}
