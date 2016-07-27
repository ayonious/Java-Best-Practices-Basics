package chapter5_interface;





//so multiple implents can be possible
public class AB1 implements A,B
{
	
	//each function has to be defined here
	public int volA(){return -1;}
	public int volB(){return -1;}
	
	
	
	public void printA(){System.out.println("AB1");}
	public void printB(){System.out.println("AB1");}
	
	
	
	//you can add some of your own garbage here
	public void garbage_AB1()
	{
		System.out.println("faul AB1");
	}
	
}


