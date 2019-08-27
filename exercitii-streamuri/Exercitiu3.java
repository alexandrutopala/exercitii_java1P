import java.util.*;
import static java.util.stream.Collectors.*;

/**
 * Se da o lista de siruri de caractere. 
 * Se cere afisarea celei mai frecvente lungimi de sir de caractere.
 * 
 * Solutia va fi scrisa in metoda Exercitiu3#mostFrequentLength
 * 
 * Exemplu: pentru lista de siruri de caractere: "aa", "b", "ccc", "dddd", "ee", 
 * se va afisa: 2.
 * 
 * OBS.: daca sunt doua lungimi cu aceeasi frecventa, se va afisa oricare 
 * dintre ele
 */
public class Exercitiu3 {
    public static void main(String [] args) {
        List<String> list = Arrays.asList("aa", "b", "ccc", "dddd", "ee");
        
        long length = mostFrequentLength(list);
        
        System.out.println(length);
    }
    
    private static long mostFrequentLength(List<String> list) {
        // TODO: scrie solutia aici
        return 0L;
    }
}