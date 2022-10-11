package package_1;

public class thismethod {
public void m1()
{
	System.out.println("default");
}
public void m2()
{
	System.out.println("one");
}

public void m3()
{
	System.out.println("two");
}
public void m4()
{
	System.out.println("three");
	
}
public void m5()
{
	this.m4();
	this.m1();
	this.m2();
	this.m3();
	System.out.println("four");
	
}
public static void main(String[] args) {
	thismethod A1=new thismethod();
	A1.m5();
}

}
