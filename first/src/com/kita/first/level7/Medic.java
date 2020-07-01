package com.kita.first.level7;

public class Medic extends Unit {

	public Medic() {
		super("메딕", 70);
	}

	public void heal(Unit unit) {
		if(unit instanceof Careble) {
			System.out.println("히이일");
			while(unit.getCurrent_hp() < unit.MAX_HP ) {
				unit.setCurrent_hp(1);
			}
			}else {
				System.out.println("치료 할 수 없습니다.");
			}
	}

}
