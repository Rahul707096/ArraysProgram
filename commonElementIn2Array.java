package array;

public class commonElementIn2Array
{

	public static void main(String[] args) 
	{
		int a[]= {35,73,92,17,71,69};
		int b[]= {36,73,95,17,76,69};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");	
					break;
				}
			}
		}

	}

}
