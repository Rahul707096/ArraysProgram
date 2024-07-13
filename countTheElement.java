package array;

public class countTheElement 
{

	public static void main(String[] args) 
	{
		int a[]= {78,77,17,71,78,17,78};
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
			if(cnt>0)
			{
			System.out.println(a[i]+":"+cnt);
			}
		}

	}

}
