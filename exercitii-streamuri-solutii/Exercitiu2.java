import java.util.*;
import java.util.stream.*;

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
 * cuvintelor este: "\\W+"
 */
public class Exercitiu2 {
    public static void main(String [] args) {
        String text = "a fi sau a nu fi";
        
        Map<String, Long> rez = countWords(text);
        
        System.out.println(rez);
    }
    
    private static Map<String, Long> countWords(String text) {
        String[] words = text.split("\\W+");
        
        System.out.println(Arrays.toString(words));
        
        return
            Arrays.stream(words)
                  .collect(Collectors.toMap(
                    word -> word, // map-am cheia ca fiind chiar cuvantul
                    word -> 1L, // map-am ca valoare numarul de aparitii pentru cuvantul dat (initial este 1)
                    (v1, v2) -> v1 + v2 // pentru fiecare coliziune a cheilor (adica atunci cand intalnim
                                        // un cuvant pe care l-am mai intalnit deja), adunam numarul de aparitii
                  ));
    }
}