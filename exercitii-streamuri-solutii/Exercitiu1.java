import java.util.*;
import java.util.stream.*;

/**
 * Se da o lista de numere intregi.
 * Se cere afisarea patratelor perfecte din lista, despartite prin virgula,
 * ca String.
 * 
 * Solutia va fi scrisa in metoda Exercitiu1#getPerfectSquaresAsString
 * 
 * Exemplu: pentru lista [1, 3, 6, 4, 3, 4] se va afisa: "1,4,4"
 */
public class Exercitiu1 {
    public static void main(String [] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 4, 3, 4);
        
        String rez = getPerfectSquaresAsString(numbers);
        
        System.out.println(rez);
    }
    
    private static String getPerfectSquaresAsString(List<Integer> numbers) {
        return 
            numbers.stream()
                   .filter(Exercitiu1::isPerfectSquare) // filtram numerele care sunt patrate perfecte
                   .map(String::valueOf) // convertim numerele la String (String.valueOf(1) => "1")
                   .collect(Collectors.joining(","));
    }
    
    private static boolean isPerfectSquare(int x) {
        double sq = Math.sqrt(x); // obtinem radacina patrata cu tot partea zecimala
        int roundedSq = (int) sq; // trunchiam partea zecimala
        
        return sq - roundedSq == 0.0; // daca diferenta dintre radicalul netrunchiat si cel trunchiat 
                                      // este 0, inseamna ca partea zecimala e 0, deci x e patrat perfect
        /*
         * Exemplu: pentru x = 4
         * sq = 2.0;
         * roundedSq = 2.0;
         * sq - rountededSq = 0.0 => x = 4 e patrat perfect
         * 
         * Pentru x = 2
         * sq = 1.41
         * roundedSq = 1
         * sq - roundedSq = 0.41 != 0 => 2 nu e patrat perfect
         */                              
    }
}