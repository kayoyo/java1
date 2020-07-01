package com.kita.first.level7;

public class Marine extends Unit implements AttackUnit, Careble{
	//  interface를 상속 받을 떄는 implements
	
	private int damage; 
	
	
	//Unit이 가지고 있는 생성자 호출
	//unit의 기본 생성자가 없기 때문에 기본 생성자 형태로 호출 불가
	public Marine() { //String name, int max_hp 인자를 받아옴
		super("마린", 50);
		damage = 5;
	}
	
	@Override
	public void attack(Unit u) {
		if(u == this) {return;}
		System.out.println("따다다");
		u.getDamege(damage);
}
	
	
		
	}
	
