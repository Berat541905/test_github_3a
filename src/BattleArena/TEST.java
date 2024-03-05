package BattleArena;
		 
	public class TEST {
		 
		public static void main(String[] args) {
				
				battleArena b1 =new battleArena();
				Character p1 = new Dragon("GRIMALDO GRIMUERES");
				Character p2 = new Dwarf("FERID ABDULKERIMALIDOGLU");
				b1.fight(p1, p2);
			}
}