package com.kita.first.level4;

public class AnimalTest {

	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		//Bird bird = new Bird(); 
		
		Bird bird2 = new Bird("참새");
		Bird bird3 = new Bird("기러기");
		
		
		/*animal.crying(); //animal.flying은 안됨
		  bird.crying();
		  bird.flying();*/
		
	   
		Sparrow sparrow = new Sparrow(); //객체화
		sparrow.whoAmI();
		// sparrow에서 가져오고, 없으면 bird에서 가져옴
	}
}
