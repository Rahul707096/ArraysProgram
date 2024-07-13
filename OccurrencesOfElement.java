package array;

public class OccurrencesOfElement 
{

	public static void main(String[] args) 
	{
		int a[]= {78,77,17,71,78,17};
		int cnt=0,n=0,el=17;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==el)
			{
				n=a[i];
				cnt++;
			}
		}
		System.out.println("Occurrences Of "+n+" is "+cnt);

	}

}
