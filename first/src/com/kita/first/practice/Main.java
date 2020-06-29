package com.kita.first.practice;

public class Main {
	
	public static void main(String[] args) {
		
	
	People people = new People("김철수" , "남자");
	Female female = new Female("김영희");
	System.out.println(people.name);
	System.out.println(people.gender);
	System.out.println(female.gender);
	female.selfIntroduce();
	

	}
}

