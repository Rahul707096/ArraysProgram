package array;

public class swapArrayElement
{

	public static void main(String[] args) 
	{
		int a[]= {35,73,92,17,71,69};
		int f=0,s=2,temp=0;
		
			temp=a[f];
			a[f]=a[s];
			a[s]=temp;
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		
	}

}
