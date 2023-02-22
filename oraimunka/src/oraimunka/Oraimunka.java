
package oraimunka;


public class Oraimunka {

    
    public static void main(String[] args) {
        
    }
    
    private static void elso10SzamOsszege(){
        int osszeg = 0;
        int db = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
            db++;
        }
        osszead(osszeg, db);
        }
    
    private static void osszead(int a, int b){
        System.out.printf("%d + %d =%d\n", a, b, a+b);
        System.out.printf("Az els? %d szám összege: %d\n", a, b);
        
            
    }
    }
