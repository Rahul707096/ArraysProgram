package array;

public class SecondMinNoOfArray 
{

	public static void main(String[] args) 
	{
		int a[]= {49,57,78,12,36,18,89};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Second Smallest No. is "+a[1]);
		

	}

}
