package package_1;

public class student {
	int roll_no;
	int age;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	public void dispaly2()
	{
		System.out.println("Automation is Easy");
	}
	public static void main(String[] args) {
		student a=new student();
		a.roll_no=1;
		System.out.println("roll no is" +a.roll_no);
		a.age=25;
		System.out.println("age is "+a.age);
		a.display1();
		a.dispaly2();
	}

}
