package com.example.abstractclass;

public class MainDriver {
	
	public static void main(String[] apples) {
		
		SuperHero sh = new SuperHero();
		//sh.fly(); //comes from the SuperHero class
		//sh.eat(); //comes from Person AC but is overridden in 
		//SuperHero
		//sh.sleep();
		//comes from the Person AC
		
		Person p = new SuperHero();
		p.eat();
		p.sleep();
		//p.fly(); cannot be called
		
		
	}

}
