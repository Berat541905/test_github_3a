package BattleArena;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class battleArena {
	
	private Scanner sc;

	public battleArena() {
        this.sc = new Scanner(System.in);
    }

    /**
     * Method to start a fight between two players
     * @param attacker
     * @param defender
     */
    public void Fighting(Character attacker, Character defender) {
    	System.out.println(attacker.getName() + ", your turn: ");
		System.out.println("What do you want to choose? (write a number ... 1-3)"
				+ "\n\t 1 = attack "
				+ "\n\t 2 = activate special ability"
				+ "\n\t 3 = deactivate special ability");
		int move = sc.nextInt();
		switch (move) {
			case 1:
				System.out.println(attacker.getName() + " is attacking!");
				attacker.attack(defender);
				System.out.println("lifepoints of " + defender.getName() + ": " + defender.getLifePoints());
				break;
			case 2:
				System.out.println(attacker.getName() + " special activity active!");
				attacker.setSpecialAbility(true);
				break;
			case 3:
				System.out.println(attacker.getName() + " special activity deactive!");
				attacker.setSpecialAbility(false);
				break;
			default:
				System.out.println("invalid action!");
				break;
		}
	}
	/**
	 * Method to decide which player begins
	 * @return
	 */
	public boolean decideWhoBegins() {
		int i=ThreadLocalRandom.current().nextInt(1,10);
		if(i<=5) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Method to check if a player still has life points
	 * @param player
	 * @return
	 */
	public boolean checkIfPlayerHasLifepoints(Character player) {
		if(player.getLifePoints()==0) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * Method to start the fight between two players
	 * @param player1
	 * @param player2
	 */
	public void fight(Character player1, Character player2) {
	    boolean player1Turn = decideWhoBegins();
	    Character attacker, defender;
	    if (player1Turn) {
	        attacker = player1;
	        defender = player2;
	    } else {
	        attacker = player2;
	        defender = player1;
	    }
	    while (checkIfPlayerHasLifepoints(player1) && checkIfPlayerHasLifepoints(player2)) {
	        Fighting(attacker, defender);
	        if (!checkIfPlayerHasLifepoints(defender)) {
	            System.out.println(attacker.getName() + " has wonnn!!!!!");
	            break;
	        }
	        Character temp = attacker;
	        attacker = defender;
	        defender = temp;
	    }
	    sc.close();
	}
}