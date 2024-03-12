package BattleArena;
		 
	public class APP {
		 
		public static void main(String[] args) {
				
				battleArena b1 =new battleArena();
				Character p1 = new Dragon("MARADONAAAAAAAA");
				Character p2 = new Dwarf("PELEEEEEEEE");
				b1.fight(p1, p2);
		}
	}