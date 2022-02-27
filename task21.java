import java.util.*;
class number
{
	int x,y;
	public void getnum()
	{
		System.out.println("enter the value of x");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter the value of y");
		y=sc.nextInt();
	}
	public void printresult()
	{
		if(x>y)
		{
			System.out.println("addition="+(x+y));
			System.out.println("subtraction="+(x-y));
			System.out.println("multiplication="+(x*y));
			System.out.println("division="+(x/y));
		}
		if(x<y)
		{
			System.out.println("addition="+(y+x));
			System.out.println("subtraction="+(y-x));
			System.out.println("multiplication="+(y*x));
			System.out.println("division="+(y/x));
		}
		
	}
}
public class Calculator
{
	public static void main(String[] args)
	{
		number obj;
		obj=new number();
		obj.getnum();
		obj.printresult();

	  
	}

}
