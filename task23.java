import java.util.*;
public class factorial 
{
	public static void main(String[] args) 
	{
		int i,f=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of which hyou want factorial :");
	    n=sc.nextInt();
		for(i=1;i<=n;i++)
	    {
			f=f*i;
		}
		System.out.println("factorial of "+n+"is :"+f);
	}

}
