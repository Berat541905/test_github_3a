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
		System.out.println(attacker.getName() + ",  ist dran ");
		System.out.println("Was willst du wählen "
				+ "\n\t attack"
				+ "\n\t aktiviere Spezialfähigkeit"
				+ "\n\t deaktiviere Spezialfähigkeit");
		String move = sc.nextLine().toLowerCase();
		switch (move) {
			case "attack":
				System.out.println(attacker.getName() + " attackiert!");
				attacker.attack(defender);
				System.out.println("Lebenspunkte von " + defender.getName() + ": " + defender.getLifePoints());
				break;
			case "aktiviert Spezialfähigkeit":
				System.out.println(attacker.getName() + " hat Spezialfähigkeit aktiviert!");
				attacker.setSpecialAbility(true);
				break;
			case "deaktiviert Spezialfähigkeit":
				System.out.println(attacker.getName() + " hat Spezialfähigkeit deaktiviert!");
				attacker.setSpecialAbility(false);
				break;
			default:
				System.out.println("ungültige Aktion!");
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
	            System.out.println(attacker.getName() + " SIEGERRRRRR!");
	            break;
	        }
	        Character temp = attacker;
	        attacker = defender;
	        defender = temp;
	    }
	    sc.close();
	}
	
}