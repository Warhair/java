
package oraimunka;


public class Oraimunka {

    
    public static void main(String[] args) {
        
    }
    
    private static int elsonSzamOsszege(int z){
        int osszeg = 0;
        for (int i = 0; i < z; i++) {
            osszeg += i;
            
        }
       return osszeg;
        }
    
    private static void kiir(int a, int b){
        System.out.printf("%d + %d =%d\n", a, b, a+b);
        System.out.printf("Az els? %d sz�m �sszege: %d\n", a, b);
        
            
    }
    
    }
