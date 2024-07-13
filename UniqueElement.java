package array;

public class UniqueElement 
{

	public static void main(String[] args) 
	{
		int a[]= {78,77,71,78,71,17};
		int cnt;
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
			if(cnt==1)
			{
				System.out.println(a[i]);
			}
			
		}	
	}

}
