package core.game;

public class Wizard extends GameChangers {
	int magicPower;
	public Wizard(String name,int health,int magicPower) {
		super(name,health);
		this.magicPower = magicPower;
	}
	@Override
	void attack(GameChangers target) {
		if(isAlive()) {
			System.out.println(name+"casts a spell on"+target.name+"with magic power"+ magicPower);
			target.health -= magicPower;
		} 
		else {
			System.out.println(name + "is already defeated and cannot attack");
		}
		
	}

}
