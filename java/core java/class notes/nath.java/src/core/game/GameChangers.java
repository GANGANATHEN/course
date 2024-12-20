package core.game;

public abstract class GameChangers {
	String name;
	int health;

	public GameChangers(String name, int health) {
		this.name = name;
		this.health = health;

	}

	abstract void attack(GameChangers target);

	public boolean isAlive() {
		return health > 0;
	}
}
