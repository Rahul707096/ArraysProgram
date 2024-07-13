package array;

public class leaderElement
{

	public static void main(String[] args) 
	{
		int a[]= {35,73,92,17,71,69};
		int led=a[a.length-1];
		for(int i=a.length-2;i>=0;i--)
		{
			if(led<a[i])
			{
				led=a[i];
				System.out.println(led);
			}
			
		}

	}

}
