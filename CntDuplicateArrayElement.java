package array;

public class CntDuplicateArrayElement 
{

	public static void main(String[] args) 
	{
		int a[]= {5,3,4,6,7,5,3,2,1};
		int cnt=0;
		System.out.println("Duplicate Element is:-");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					cnt++;
				}
			}
		}
		System.out.println("Count of Duplicate Elements : "+cnt);
	}

}
