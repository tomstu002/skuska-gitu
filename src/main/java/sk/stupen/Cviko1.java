package sk.stupen;



public class Cviko1 {
    public static void main(String[] args) {
    Auto skoda = new Auto();

    skoda.setStavNadrze(50) ;

    skoda.jazdi(100);
        System.out.println(skoda.getStavNadrze());
    skoda.jazdi(100);
        System.out.println(skoda.getStavNadrze());



    }

}
