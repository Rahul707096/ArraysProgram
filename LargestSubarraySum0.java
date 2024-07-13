package array;

public class LargestSubarraySum0
{

	public static void main(String[] args) 
	{
		int a[]= {15,-2,2,-8,1,7,10,23};
		int sum,max=0,len=0;
		for(int i=0;i<a.length;i++)
		{
			
			sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum=sum+a[j];

				if(sum==0)
				{
					//System.out.print(a[i]+" ");
					//System.out.print(a[j]+" ");
					len=(j-i)+1;
					
					if(len>max)
					{
						max=len;
						//System.out.println(a[i]);
					}
				}
			}
		}
		System.out.println("Subaaray Length is :- "+max);
	}

}
