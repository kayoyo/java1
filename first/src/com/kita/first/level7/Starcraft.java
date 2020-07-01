package com.kita.first.level7;

public class Starcraft {
	
	public static void main(String[] args) {
		Marine m1 = new Marine ();
		Medic medic = new Medic();
		FireBat fb = new FireBat();
		
	    fb.attack(m1); 	
	    fb.attack(m1); 	
	    fb.attack(m1); 	
	    
		System.out.println(m1); 
		
		m1.attack(fb);
		m1.attack(fb);
		
		System.out.println(fb);
		
		medic.heal(m1);
		System.out.println(m1);

		medic.heal(fb);
		System.out.println(fb);
	
		
		System.out.println(fb instanceof Careble); 
		//fb가 가르키는 객체(Unit)가 Careble로 형변환이 가능한지의 여부 
		
	}

}
