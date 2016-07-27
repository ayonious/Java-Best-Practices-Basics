package chapter3_inheritance_dynamic_method_dispatch;




public class A 
{
	private int a,b,c;
	
	
	public A(int a, int b,int c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
	
	public A() 
    {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }
	
	
	public void show() 
    {
		System.out.println("show in A");
    }
}


