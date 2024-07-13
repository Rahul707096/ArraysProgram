package array;

public class MaxProductOfTwoNo
{

	public static void main(String[] args)
	{
		int a[]= {49,57,78,12,36,18,89};
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])  // Desending Order Sorting
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Max Product of Two No is:-\n"+a[0]*a[1]);
		

	}

}
