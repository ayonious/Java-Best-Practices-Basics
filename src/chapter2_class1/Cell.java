package chapter2_class1;



public class Cell 
{
	public int X;
	public int Y;
	public int Val = 0;
	public int Player = 0;
	
	public Cell(int a, int b, int p) 
    {
        X = a;
        Y = b;
        Val = 0;
        Player = p;
    }
	public int area()
	{
		return X*Y;
	}
	
	public void show_area()
	{
		System.out.println(area());
	}
}


