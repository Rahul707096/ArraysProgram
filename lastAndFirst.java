package array;

public class lastAndFirst 
{

	public static void main(String[] args) 
	{
		int a[]= {20,50,23,2,45};
		
		for(int i=0;i<a.length;i++)
		{
			if(i==0 || i==a.length-1)
			{
				System.out.println(a[i]);
				
			}
		}

	}

}
