package ArrayList;

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
	}

