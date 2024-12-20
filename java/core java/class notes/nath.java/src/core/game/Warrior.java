package core.game;

public class Warrior extends GameChangers {
	int stength;
	public Warrior(String name,int health,int strength) {
		super(name,health);
		this.stength = strength;
	}
	@Override
	void attack(GameChangers target) {
		if(isAlive()) {
			System.out.println(name + "attacks"+target.name+"with strength"+stength);
			target.health-=stength;
		}
		else {
			System.out.println(name+ "is already defeated and cannot attack");
		}
		
	}
	

}
