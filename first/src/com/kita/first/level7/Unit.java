package com.kita.first.level7;

public class Unit {
	
	public final String NAME;
	public final int MAX_HP;
	private int current_hp;
	
	/*public Unit() { Unit의 기본 생성자 형태, final을 선언했기때문에 super (); 밑에 무조건 값을 넣어 줘야 함
	 * super (); 
	 * NAME = "dd"
	 * MAX_HP = 10;
	 */
	
	public Unit(String name, int max_hp) { //생성자가 있기 때문에 Unit의 기본 생성자 추가 안됨
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp = max_hp; //current_hp(현재 체력) , max_hp(가질 수 있는 최대 체력)
	}
	
	public int getCurrent_hp() { //타입 + getter + 변수명
		return current_hp;
	}
	
	public void setCurrent_hp(int hp) { //void + setter + 변수명
		this.current_hp += hp;
	}
	
	public void getDamege(int damage) {
		current_hp -= damage; 
	}
	
	public void move(int x, int y) {
		System.out.printf("x : %d , y : %d 좌표로 이동\n", x, y);
	}
	
	@Override
	public String toString() {
		return String.format("이름 : %s, 현재 HP : %d", NAME, current_hp);

}
}
