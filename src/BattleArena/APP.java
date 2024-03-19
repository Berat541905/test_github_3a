package BattleArena;

public class APP {

    /**
     * Entry point of the application.
     * Creates characters and initiates a fight in the battle arena.
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {

        battleArena b1 = new battleArena();
        Character p1 = new Dragon("Berat");
        Character p2 = new Dwarf("Arda");
        b1.fight(p1, p2);
    }
}
