public class MethodUsingThis {
public void defaultmethod()
{
	System.out.println("This is default method");
	this.methodWithOneParameter(10);
}
public void methodWithOneParameter(int a)
{
	
	System.out.println("This is  one parametized method");
	this.methodWithTwoParameter(10,20);
}
public void methodWithTwoParameter(int a, int b)
{
	
	System.out.println("This is two parameterized method");
	this.methodWithFourParameter(10, 20, 30, 40);
}
public void methodWithThreeParameter(int a, int b, int c)
{
	System.out.println(" This is three parameterized method");
	this.defaultmethod();
	
}
public void methodWithFourParameter(int a, int b, int c, int d)
{
	
	System.out.println("This is four parameterized method");
}
public static void main(String[] args) {
	MethodUsingThis obj=new MethodUsingThis();
	obj.methodWithThreeParameter(10,20,30);
}
}
