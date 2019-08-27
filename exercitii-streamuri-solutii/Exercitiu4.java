import java.util.*;
import static java.util.stream.Collectors.*;

/**
 * Se da o lista de angajati, care au: un nume, o vechime (in ani) si un salariu.
 * Se cere afisarea salariului mediu in functie de vechime.
 * 
 * Solutia va fi scrisa in metoda Exercitiu4#computeAverageSalariesByExperience
 * 
 * Exemplu: 
 * Pentru angajatii: 
 *   (nume=Gigel, aniExperienta=2, salariu=7000)
 *   (nume=Maria, aniExperienta=3, salariu=9000)
 *   (nume=Costel, aniExperienta=2, salariu=6000)
 * se va afisa:
 *   2 : 6500.0 
 *   3 : 9000.0
 * (nu neaparat in aceasta ordine sau sub acest format)
 */
public class Exercitiu4 {
    public static void main(String [] args) {
        List<Angajat> angajati = Arrays.asList(
            new Angajat("Gigel", 3, 9000), 
            new Angajat("Maria", 1, 5000),
            new Angajat("Costel", 3, 8500),
            new Angajat("Ion", 2, 7000),
            new Angajat("Florina", 2, 8000),
            new Angajat("Dorel", 3, 10_000),
            new Angajat("Matei", 4, 12_000),
            new Angajat("Andrei", 2, 6000)
        );
        
        Map<Integer, Double> averageSalaries = 
            computeAverageSalariesByExperience(angajati);
            
        System.out.println(averageSalaries);    
    }
    
    private static Map<Integer, Double> computeAverageSalariesByExperience(
        List<Angajat> angajati) {
        return 
        angajati.stream()
                .collect(
                    groupingBy(
                        Angajat::getAniExperienta, // grupam dupa anii de experienta
                        averagingInt(Angajat::getSalariu) // si pentru fiecare grup, face media salariilor
                    )
                );
    }
}