package com.kita.first.mission;

import com.kita.first.level5.Animal;
import com.kita.first.level5.Cat;
import com.kita.first.level5.Dog;
import com.kita.first.level5.Sparrow;

public class AnimalMission {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Sparrow spa = new Sparrow();

		doCry(dog);
		doCry(cat);
		doCry(spa);
		
		
	}

	public static void doCry(Animal ani) { // cat, dog, sparrow가  Animal에게 상속 받음
		ani.cry(); //public void cry() 메소드를 만들어서 cry를 호출
		
	}

}
