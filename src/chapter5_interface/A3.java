package chapter5_interface;





//cant extend as a class
/*
public class A3 extends A
{
	
}
*/


//cant extend as abstract
//but
//"public abstract class A3 implements" A is possible


/*
public abstract class A3 extends A
{
	
}
*/



interface A3 extends A
{
	public int volA3();
}