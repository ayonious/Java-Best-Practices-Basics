package chapter1_array;


public class Examples 
{
	void example1()
	{
		int i,j;
		
		Cell[][] grid = new Cell[7][6];
	    
		for(i = 0; i < 7; i++)
        for(j = 0; j < 6; j++)
        {
        	grid[i][j] = new Cell(i, j, 0);         
        } 
	    
		for(i = 0; i < 7; i++)
        for(j = 0; j < 6; j++)
        {
        	System.out.println(grid[i][j].X);
        } 
	}
	
	void example2()
	{
		int i,j;
		
		//this is not same as c++  char **c,c1 where c is char**, c1 is char
		//in java Cell[][] grid,grid2 means both grid and grid2 are Cell[][]
		Cell[][] grid,grid2 ;
		grid=new Cell[3][4];

		
		//there is no difference between
		//Cell[][] a,b;
		//and
		//Cell [][]a,b;
		
		
		//so this will give compilation error
		//grid2=new Cell(1,1,1);
		
		
		
		//every cell we create in java is like a pointer in C++
		//so this is not allowed in java
		//Cell c(0,0,0);
		
		
		for(i = 0; i < 3; i++)
        for(j = 0; j < 4; j++)
        {
        	grid[i][j] = new Cell(i, j, 0);         
        } 
	    
		
		for(i = 0; i < 3; i++)
        for(j = 0; j < 4; j++)
        {
        	System.out.println(grid[i][j].X);
        } 
	}
	public void start() 
	{
		example1();
		example2();
		
	}
}

