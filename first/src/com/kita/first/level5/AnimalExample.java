package com.kita.first.level5;

public class AnimalExample {
	
	public static void main(String[] arg) {
		
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		
		Cat cat = new Cat();
		cat.sleep();
		Cat cat2 = (Cat)ani;
		cat2.sleep();
	}
	


}
