package chapter2.class_;

public class Examples {
	void example1() {
		// in this case it will show area of c1
		Cell c1 = new Cell(2, 3, 0);
		Cell c2;
		c2 = c1;
		c2.show_area();

		// if we change c1,c2 will change
		c1.X = 10;
		c2.show_area();

		// CPP equivalent of this is
		/*
		 * Cell *c1=new Cell(2,3,0); Cell *c2; c2=c1; c2.show_area();
		 */
	}

	public void start() {
		example1();
		// example2();

	}

}
