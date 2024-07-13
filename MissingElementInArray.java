package array;

public class MissingElementInArray 
{

	public static void main(String[] args) 
	{
		int a[] ={10,12,11,15};
		int low=10,high=15,p;
		System.out.println("Missing Element is:-");
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
		System.out.println();
		
		int b[]={1,14,11,51,15};
		int l=50,h=55,x;
		System.out.println("Missing Element is:-");
		for(int i=l+2;i<h;i++)
		{
			x=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
					x=1;
					break;
				}
			}
			if(x==0)
			{
				System.out.println(i);
			}
			
		}
		
		
		

	}

}
