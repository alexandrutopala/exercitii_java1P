import java.util.*;

/**
 * Pentru un text dat, se cere afisarea numarului de aparitii pentru
 * fiecare cuvant.
 * 
 * Solutia va fi scrisa in metoda: Exercitiu2#countWords
 * 
 * Exemplu: pentru textul "a fi sau a nu fi" se va afisa:
 * "a" : 2
 * "fi" : 2
 * "sau" : 1
 * "nu" : 1
 * (nu neaparat in aceasta ordine sau sub acest format)
 * 
 * Indicatie: expresia regulata care poate fi folosita pentru separarea
 * cuvintelor este: "(\b[^\s]+\b)"
 */
public class Exercitiu2 {
    public static void main(String [] args) {
        String text = "a fi sau a nu fi";
        
        Map<String, Long> rez = countWords(text);
        
        System.out.println(rez);
    }
    
    private static Map<String, Long> countWords(String text) {
        // TODO: scrie solutia aici
        return null;
    }
}