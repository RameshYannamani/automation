package package_1;

public class day2 
{
public int sum(int a, int b)
{
int c;
c=a+b;
System.out.println("sum result is "+ c);	
return c;
}
public int sub(int c, int e)
{
int f;
f= c-e;
System.out.println("sub result is "+ f);
return f;
}
public int sum1(int f, int g)
{
int h;
h=f+g;
System.out.println("sum result is "+ h);	
return h;

}
public int mul(int h, int i)
{
int j;
j=h*i;
System.out.println("mul result is "+ j);	
return j;
}
public void div(int j, int k)
{
int l;
l=j/k;
System.out.println("final result is "+ l);	
}
public static void main(String[] args) {
day2 result=new day2();

int sumresult=result.sum(10,2);
int subresult=result.sub(sumresult,2);
int sum1result=result.sum1(subresult,2);
int mulresult=result.mul(sum1result,2);
result.div(mulresult,2);


}
}