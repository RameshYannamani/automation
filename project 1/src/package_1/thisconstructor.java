package package_1;

public class thisconstructor {
	public thisconstructor()
	{
		this (1,2,3);
		System.out.println("default constructor");
	}
	public thisconstructor(int a)
	{
		this(1,2);
		System.out.println("one parameter constructor");
	}
	public thisconstructor(int a, int b)
	{
		this();
		System.out.println("two parameter constructor");
	}
	public thisconstructor(int a, int b, int c)
	{
		System.out.println("three parameter constructor");
		
	}
	public static void main(String[] args) {
		thisconstructor abc =new thisconstructor(1);
	}

}
