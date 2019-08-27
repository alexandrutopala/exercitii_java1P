import java.util.*;

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
        // TODO: scrie solutia aici
        return "";
    }
}