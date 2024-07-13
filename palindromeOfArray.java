package array;

public class palindromeOfArray {

	public static void main(String[] args) {
		int a[]= {6,131,37,145,153,56,33,1634,};
		for(int i=0;i<a.length;i++)
		{
			int p=0,n=a[i],r;
			while(n!=0)
			{
				r=n%10;
				p=p*10+r;
				n=n/10;
			}
			if(p==a[i])
			{
				System.out.println("Palindrome No. is "+ a[i]);
			}
		}

	}

}
