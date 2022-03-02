package sk.stupen;

public class Auto {
    private double kapacitaNadrze;
    private double stavNadrze;
    public static final double PALIVO_NA_KM = 0.2;
    public static final double NADRZ = 50;
    private boolean ojazdene;
    private String nazov;

    public Auto(){
        this(NADRZ);
    }

    public Auto(double kapacitaNadrze){
        this.ojazdene = true;
        this.kapacitaNadrze = kapacitaNadrze;
        this.stavNadrze = 50;
    }



    public void jazdi(double vzdialenost){
        stavNadrze -= vzdialenost * PALIVO_NA_KM;
        if (stavNadrze<0){
            stavNadrze = 0;
        }

    }
    public double getStavNadrze(){
    return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze){
        this.stavNadrze = stavNadrze;
    }

    public String stav(){
        String vysledok;
        if (this.ojazdene){
            vysledok = "Auto je ojazdene";
        }else {
            vysledok = "Auto nie je ojazdene";
        }
        return vysledok;
    }
}
