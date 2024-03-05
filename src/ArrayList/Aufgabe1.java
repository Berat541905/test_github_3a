package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe1 {

	public static void reduceToComments(List<String> lines) {
		        if (lines.size() % 4 != 0) {
		            throw new IllegalArgumentException("Illegal size of list, must be divisible by 4");
		        }

		        for (int i = 0; i < lines.size(); i++) {
		             
		            if (i % 4 < 3) {
		                lines.set(i, null);
		            }
		        }
		        lines.removeIf(s -> s == null);
		    
		}
	  public static void main(String[] args) {
	        // Beispiel für die Verwendung der Methode
	        List<String> Entries = new ArrayList<String>();
	        Entries.add("A1");
	        Entries.add("A2");
	        Entries.add("A3");
	        Entries.add("A4");
	        Entries.add("B1");
	        Entries.add("B2");
	        Entries.add("B3");
	        Entries.add("B4");
	        Entries.add("C1");
	        Entries.add("C2");
	        Entries.add("C3");
	        Entries.add("C4");

	        try {
	            reduceToComments(Entries);
	            System.out.println(Entries);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	
	

