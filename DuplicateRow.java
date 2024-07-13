package array;

public class DuplicateRow
{

	public static void main(String[] args) 
	{
		//int a[][]= {{1,0,0,1,0},{0,1,1,0,0},{1,0,0,1,0},
				  // {0,0,1,1,0},{0,1,1,0,0},{0,0,1,1,0}};
		//int a[][]= {{1,0,1,0},{1,0,0,0},{1,0,1,0},{1,0,1,1}};
		//int p;
		int a[][]= {{1,2,3,4,5},{4,5,6,7,8},{1,2,3,4,5},
				   {6,7,8,9,7},{4,5,6,7,8},{6,7,8,9,7}};
		System.out.println("Array is :-");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a[i].length;j++)
			{
				int p=0;
				for(int k=0;k<a[i].length;k++)
				{
					if(a[i][k]!=a[j][k])
					{
						p=1;
						break;					
					}
				}
				if(p==0)
				{
					//System.out.println("Duplicate row is "+i);
					System.out.println(i+":"+j);
				}
				
			}
		}
	}
}
