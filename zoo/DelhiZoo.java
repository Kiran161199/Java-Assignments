package zoo;

import org.animals.*;

public class DelhiZoo {
	public static void main(String[] args) {
	System.out.println("-----------------------------------------------");
	Animal a=new Animal();
	a.sound();
	System.out.println("------------------");
	a=new Deer("golden",50.0,10);
	a.sound();
	System.out.println("----------------------");
	Animal b=new Lion("light brown",40.0,15);
	b.sound();
	Animal c=new Tiger("Yellow",60.0,12);
	c.sound();
}
}

