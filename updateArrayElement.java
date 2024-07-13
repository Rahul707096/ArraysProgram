package array;

public class updateArrayElement 
{

	public static void main(String[] args) 
	{
		int a[]= {35,73,92,17,71,69};
		int ind=4;
		int el=52;
		int b[]=new int[a.length+1];
		System.out.println("Before Update Array Elements");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(i<ind)
			{
				b[i]=a[i];
			}
			else if(i==ind)
			{
				b[i]=el;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		System.out.println("\nAfter Update Array Elements");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
			
		

	}

}
