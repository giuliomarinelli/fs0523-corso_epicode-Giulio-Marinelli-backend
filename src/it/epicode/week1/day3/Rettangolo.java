package it.epicode.week1.day3;

public class Rettangolo {


    private double altezza;
    private double larghezza;
    public Rettangolo(double larghezza, double altezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public double area() {
        return altezza * larghezza;
    }
    public double perimetro() {
        return 2 * (altezza + larghezza);
    }
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("AREA = " + r.area() + "; PERIMETRO = " + r.perimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        double sommaAree = r1.area() + r2.area();
        double sommaPerimetri = r1.perimetro() + r2.perimetro();
        System.out.println("AREA RETTANGOLO 1 = " + r1.area() + "; PERIMETRO RETTANGOLO 1 = " + r1.perimetro());
        System.out.println("AREA RETTANGOLO 2 = " + r2.area() + "; PERIMETRO RETTANGOLO 2 = " + r2.perimetro() + "SOMMA AREE = " + sommaAree + ";SOMMA PERIMETRI = " + sommaPerimetri);
    }
}
