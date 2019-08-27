import java.util.*;
import java.util.stream.*;

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
            new Angajat("Viorel", 2, 7000),
            new Angajat("Costel", 3, 8000),
            new Angajat("Ion", 2, 7000),
            new Angajat("Florina", 2, 8000),
            new Angajat("Dorel", 3, 10_000),
            new Angajat("Matei", 4, 12_000),
            new Angajat("Andrei", 2, 6000)
        );
        
        List<Angajat> sortedAngajati = sortAngajati(angajati);
        
        System.out.println(sortedAngajati);
    }
    
    private static List<Angajat> sortAngajati(List<Angajat> angajati) {
        Comparator<Angajat> comp = 
            Comparator.comparingInt(Angajat::getSalariu).reversed() // compar intai salariu, in ordine descrescatoare
                      .thenComparing(Comparator.comparing(Angajat::getAniExperienta).reversed()) // apoi compar dupa anii de experienta, tot descrescator
                      .thenComparing(Angajat::getNume);  // apoi compar dupa nume, in ordine naturala (crescator)
                      
        return
            angajati.stream()    
                    .sorted(comp)
                    .collect(Collectors.toList());
    }
    
    private static List<Angajat> sortAngajati_explicit(List<Angajat> angajati) {
        Comparator<Angajat> bySalariuReversed = Comparator.comparingInt(Angajat::getSalariu).reversed();
        Comparator<Angajat> byAniExperientaReversed = Comparator.comparingInt(Angajat::getAniExperienta).reversed();
        Comparator<Angajat> byNume = Comparator.comparing(Angajat::getNume);
        
        Comparator<Angajat> bySalariuReversedThenByAniExperientaReversedThenByNume = 
                    bySalariuReversed
                      .thenComparing(byAniExperientaReversed)
                      .thenComparing(byNume);
                      
        return angajati.stream()
                       .sorted(bySalariuReversedThenByAniExperientaReversedThenByNume)
                       .collect(Collectors.toList());
            
    }
    
}