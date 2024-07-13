package array;

public class SeconcMaxElement 
{

	public static void main(String[] args) 
	{
		
		int a[]= {78,77,17,71,78,17,17,78,78,78};
		int b[]=new int[a.length];
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
			}
			else if(cnt>smax && cnt<max)
			{
				smax=cnt;
				temp=a[i];
			}
		}
		//System.out.println(smax);
		System.out.println("SecondMax is "+temp);
		
		
		/*
		int a[]= {78,77,17,71,78,17,17,17,78,78,78};
		int b[]=new int[256];
		int n,max=0,smax=0,temp=0,i=0;
		System.out.println("SecondMax Frequent ");
		for( i=0;i<a.length;i++)
		{
			n=a[i];
			b[n]=b[n]+1;
		}
		for( i=0;i<b.length;i++)
		{
			if(b[i]>max)
			{
				smax=max;
				max=b[i];
			}
			else if(b[i]>smax)
			{
				smax=b[i];
			}
		}
		System.out.println((smax+" "+temp));
		//System.out.println(max);
		*/
	}

}
