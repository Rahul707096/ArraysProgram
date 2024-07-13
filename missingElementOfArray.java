package array;

public class missingElementOfArray
{

	public static void main(String[] args) 
	{
		int a[]= {1,3,6,8};
		// missing element=2,4,5,7
		int p;
		for(int i=1;i<=8;i++)
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
				System.out.print(i+" ");// o/p= 2 4 5 7 
			}
		}
		

	}

}
