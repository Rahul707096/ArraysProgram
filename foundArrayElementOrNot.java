package array;

public class foundArrayElementOrNot 
{

	public static void main(String[] args) 
	{
		int a[]= {35,73,92,17,71,69};
		int f=17,p=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==f)
			{
				System.out.println("Founded");
				break;
			}
			else
			{
				System.out.println("Not Founded");
				break;
			}
		}

	}

}
