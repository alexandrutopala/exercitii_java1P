import java.util.*;

/**
 * Se da o lista de Angajati.
 * Se cere sortarea lor astfel: 
 *  - descrescator dupa salariu
 *  - pentru cei cu acelasi salariu, descrescator dupa anii de experienta
 *  - pentru cei cu acelasi salariu si acelasi numar de ani de experienta, 
 *  alfabetic
 *  
 *  Solutia se va scrie in metoda Exercitiu5#sortAngajati
 *  
 *  Exemplu;
 *  Pentru angajatii: 
 *   (nume=Gigel, aniExperienta=2, salariu=7000)
 *   (nume=Maria, aniExperienta=3, salariu=9000)
 *   (nume=Costel, aniExperienta=2, salariu=6000)
 *   (nume=Costelus, aniExperienta=2, salariu=6000)
 *  se va afisa:
 *   (nume=Maria, aniExperienta=3, salariu=9000) 
 *   (nume=Gigel, aniExperienta=2, salariu=7000)
 *   (nume=Costel, aniExperienta=2, salariu=6000)
 *   (nume=Costelus, aniExperienta=2, salariu=6000)
 *  (nu neaparat sub acest format) 
 *  
 *  HINT: folositi metodele clasei java.util.Comparator aparute in Java 8
 */
public class Exercitiu5 {
    public static void main(String [] args) {
        List<Angajat> angajati = Arrays.asList(
            new Angajat("Gigel", 3, 9000), 
            new Angajat("Maria", 1, 5000),
            new Angajat("Costel", 3, 8500),
            new Angajat("Ion", 2, 7000),
            new Angajat("Florina", 2, 8000),
            new Angajat("Dorel", 3, 10_000),
            new Angajat("Matei", 4, 12_000),
            new Angajat("Andrei", 2, 6000),
            new Angajat("Ionel", 2, 7000)
        );
        
        List<Angajat> sortedAngajati = sortAngajati(angajati);
        
        System.out.println(sortedAngajati);
    }
    
    private static List<Angajat> sortAngajati(List<Angajat> angajati) {
        // TODO: scrie solutia aici
        return null;
    }
    
    
}