package array;

public class LargestDifOfTwoElement
{

	public static void main(String[] args)
	{
		 int a[]= {2,3,10,6,4,8,1};
		   int max=0,d=0,x=0,y=0;

		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=i+1;j<a.length;j++)
			   {
				   if(a[i]<a[j])
				   {
					   d=a[j]-a[i];
					   x=a[i];
					   y=a[j];
					   if(d>max)
					   {
						   max=d;
					   } 
				   }
				   //System.out.println(x+" - "+y+" = "+d);
			   } 
		   }
		   System.out.println("largest diff is " + max);

	}

}
