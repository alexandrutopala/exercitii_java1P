public class Angajat {
    private String nume;
    private int aniExperienta;
    private int salariu;
    
    public Angajat(String nume, int aniExperienta, int salariu) {
        this.nume = nume;
        this.aniExperienta = aniExperienta;
        this.salariu = salariu;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public int getAniExperienta() {
        return aniExperienta;
    }
    
    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }
    
    public int getSalariu() {
        return salariu;
    }
    
    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
    
    @Override
    public String toString() {
        return nume + " " + aniExperienta + " " + salariu;
    }
}