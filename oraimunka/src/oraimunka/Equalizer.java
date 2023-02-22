
package oraimunka;
import java.util.Random;


public class Equalizer {
    private static Random rng = new Random();

public static void main(String[] args) {
 foprogram();
}

    private static void foprogram() {
        kiir(eq());
    }
 private static String eq(){
     
     String s = "";
     for (int i = 0; i < 5; i++) {
         int szam = rng.nextInt(5) + 3;
         for (int j = 0; j < szam; j++) {
             s += "\u001B[45m" + " ";
         }
         s +="\n";
 
     }
     return s;

}
 private static void kiir(String szineket){
     System.out.println(szineket);
 }
}