package chapter3_inheritance;



public class A21 extends A2
{
	private int randomshit;
	
	public A21(int a,int b,int c,int w,int shit) 
    {
		//super will always call the immidiate parent
		super(a,b,c,w);
        this.randomshit=shit;
    }
	
	
	//this is called method overriding
	//when same function was declared in the parent but we create anther
	//this will call the set from 'Box' and set of WeightBox is overridden
	public void set(int a, int b,int c,int shit) 
    {
		//this will also call the set of 
		set(a,b,c);
		this.randomshit=shit;
    }
	
	
	
	public void set(int a, int b,int c,int w,int shit) 
    {
		//this will call the set of 
		set(a,b,c,w);
		this.randomshit=shit;
    }
	
	
	
	
	
	//this is another use of super
	public void show_supers_variables() 
    {
		super.show_weight();
		
		
		//if we write
		//super.set(1,1,1,1);
		//this will call set from 'WeightBox'
    }
	
	
}


