package package_1;

public class Day2_2 {
	
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("multiplication result is " + c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("sub result is " + c);
		return c;
	}
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("add result is " + c);
		return c;
	}
	public int sub1(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("sub result is " + c);
		return c;
	}
	public void div1(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Final result is " + c);
	}
	public static void main(String[] args) 
	{
	Day2_2 abc=new Day2_2();
	int mul=abc.mul(10,2);
	int sub=abc.sub(mul,2);
	int add=abc.add(sub,2);
	int sub1=abc.sub1(add, 2);
	abc.div1(sub1,2);
	
	
	}
	

}
