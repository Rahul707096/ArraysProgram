package array;

public class MostFrequentElement 
{

	public static void main(String[] args)
	{
		int a[]= {78,77,17,71,78,17,78,78,78,78};
		int max=0,temp=0,cnt,smax=0;
		for(int i=0;i<a.length;i++)
		{
			cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				temp=a[i];
			}
			
		}
		//System.out.println(max+" Times");
		System.out.println(temp+" is Most Frequent Element ");
		
	}
}		
		
		
/*
		int a[]= {78,77,17,71,78,17,78,78,17,17,17};
		int b[]=new int[256];
		int n,max=b[0],y=0,i=0;
		for( i=0;i<a.length;i++) 
		{
			n=a[i];
			b[n]=b[n]+1;
			//max=b[n];
		}
		for( i=0;i<b.length;i++)
		{
			if(b[i]>max)
			{
				y=a[i];
				max=b[i];	
			}
		}
		System.out.println(max+" "+a[i]);
*/
