package oraimunka;

public class Oraimunka {

    public static void main(String[] args) {
        foprogram();
    }

    private static void foprogram() {
        int szam1 = 3;
        int szam2 = 6;
        int szam3 = 7;
        int szam4 = 8;
        double gyok = Math.sqrt(osszead(szam1, szam2)+szam4);
        
        kiir(szam1, szam2, szam3, szam4, gyok);
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;

        }
        return osszeg;
    }

    private static void kiir(int a, int b, int c, int d, double f) {
        System.out.printf("%d + %d = %d\n", a, b, osszead(a, b));
        System.out.printf("Az els? 10 szám összege: %d\n", elso10SzamOsszege());
        System.out.printf("A 4 szám összege: %d\n", nszamosszege(a, b, c, d));
        System.out.printf("%d + %d + %d -nek a gyöke: %f",a, b, c, f);
        
    }

    private static int osszead(int a, int b) {
        return a + b;
    }
    private static int nszamosszege(int a, int b, int c, int d){
       int oszertek = osszead(a, b)+osszead(c, d);
       return oszertek;
    }
    
}
