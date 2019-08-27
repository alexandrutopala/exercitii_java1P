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
        Map<Integer, Long> map =
            list.stream()
                .map(String::length)
                .collect( 
                    groupingBy(
                        i -> i, // grupam lungimile identice 
                        counting()) // si numaram de cate ori a aparut o lungime
                );
        
        // in mapu-ul rezultat vom avea o asociere de tipul
        // lungimea -> de cate ori a aparut lungimea respectiva
        return 
            map.values() // luam separat colectia care tine numarul de aparitii 
                         // pentru fiecare lungime
               .stream()
               .mapToLong(l -> l)
               .max()   // si obtinem maximul
               .orElse(0L);
    }
}