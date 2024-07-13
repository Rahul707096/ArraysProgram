package array;

public class TransposeOfMatrix 
{

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int t[][]=new int[a.length][a[0].length];
		System.out.println("Before Transpose");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				t[j][i]=a[i][j];
			}
		}
		System.out.println("\nAfter Transpose");
		for(int x[]:t)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
