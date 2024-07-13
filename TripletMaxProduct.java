package array;

public class TripletMaxProduct
{

	public static void main(String[] args)
	{
		int a[]= {10,3,5,6,20};
		int max=0,x=0,y=0,z=0,prod=0;
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=i+2;k<a.length;k++)
				{
					prod=a[i]*a[j]*a[k];
					if(prod>max)
					{
						max=prod;
						x=a[i];
						y=a[j];
						z=a[k];
					}
				}
			}
		}
		System.out.println(max+" Multiplication of "+x+","+y+" and "+z);

	}

}
