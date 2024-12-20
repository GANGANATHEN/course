package core.game;

public class GameExample {

	public static void main(String[] args) {
		
    Warrior warrior = new Warrior("warrior1",100,20);
    Wizard wizard = new Wizard("wizard1",80,30);
    
    while(warrior.isAlive() && wizard.isAlive()) {
    	warrior.attack(wizard);
    	if(wizard.isAlive()) {
    		wizard.attack(warrior);
    	}
    }
    if(warrior.isAlive()) {
    	System.out.println(warrior.name+"is the winner");
    }
    else {
    	System.out.println(wizard.name+"is the winner");
    }
	}

	
}
