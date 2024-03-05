package ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Aufgabe2 {

    public static void trimNonGrowingNumbers(List<Double> numbers) {
        if (numbers == null || numbers.size() < 2) {
            // Nicht genug Elemente zum Vergleichen oder ungültige Liste
            return;
        }

        Iterator<Double> iterator = numbers.iterator();
        double current = iterator.next();
        
        while (iterator.hasNext()) {
            double next = iterator.next();
            if (next < current) {
                iterator.remove();
            } else {
                current = next;
            }
        }
    }

    public static void main(String[] args) {
        // Test der Methode mit einem Beispiel
        List<Double> numbers = new ArrayList<>(Arrays.asList(1.0 , 2.0, 3.0, 2.0, 5.0));
        trimNonGrowingNumbers(numbers);
        System.out.println(numbers); 
    }
}
