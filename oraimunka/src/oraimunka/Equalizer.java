
package oraimunka;
import java.util.Random;


public class Equalizer {
    

public static void main(String[] args) {
 int szam = 5;
 kiir(szin(szam));
}
 private static String szin(int a){
     Random rng = new Random();
     String s = "";
     for (int i = 0; i < a; i++) {
         int szam = rng.nextInt(5) + 3;
         for (int j = 0; j < szam; j++) {
             s += "\u001B[45m";
         }
         s +="\n";
 
     }
     return s;

}
 private static void kiir(String szineket){
     System.out.println(szineket);
 }
}