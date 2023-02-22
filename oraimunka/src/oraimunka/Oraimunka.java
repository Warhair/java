
package oraimunka;


public class Oraimunka {

    
    public static void main(String[] args) {
        int szam1 = 3;
        int szam2 = 6;
        kiir(szam1, szam2);
    }
    
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
            
        }
       return osszeg;
        }
    
    private static void kiir(int a, int b){
        System.out.printf("%d + %d = %d\n", a, b, osszead(a, b));
        System.out.printf("Az els? 10 szám összege: %d\n", elso10SzamOsszege());
    
            
    }
    private static int osszead(int a, int b){
        return a+b;
    }
    }
