package array;

public class EvenOddShift 
{

	public static void main(String[] args) 
	{
		int a[]= {49,57,78,12,36,18,89};
		int even[]=new int[a.length];
		int odd[]=new int[a.length];
		
		int e=0,d=0;
		System.out.println("Before Shifting Array");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		for(int x:a)
		{
			if(x%2==0)
			{
			  even[e++]=x;
			}
			else
			{
				odd[d++]=x;
			}
		}
		int shift[]=new int[e+d];
		for(int i=0;i<e;i++)
		{
			shift[i]=even[i];
		}
		for(int j=0;j<d;j++)
		{
			shift[e+j]=odd[j];
		}
		System.out.println();
		System.out.println("\nAfter Shifting Array ");
		for(int x:shift)
		{
			System.out.print(x+" ");
		}
	}

}
