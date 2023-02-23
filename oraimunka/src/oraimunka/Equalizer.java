
package oraimunka;
import java.util.Random;


public class Equalizer {
    private static Random rng = new Random();

public static void main(String[] args) {
 foprogram();
}

    private static void foprogram() {
        kiir(eq());
        kiir(eq(12, true));
        kiir(eq());
        kiir(eq());
        kiir(eq(8, false));
        kiir(eq());
    }
 
  private static String eq(){   
     String s = "";
         int szam = rng.nextInt(5) + 3;
         s = eq(szam);
     return s;

}
private static String eq(int szam){
    String s = "";
         for (int j = 0; j < szam; j++) {
             s += "\u001B[45m" + " ";
         }
     return s;
}
private static String eq(int szam, boolean vez){
    String s = "";
    if (vez == true){
       s = eq(szam);
       s +=  s += "\u001B[40m" + " "+szam;
       
   }
   else{
       s = eq(szam);
   }
   return s;
}
 private static void kiir(String szineket){
     System.out.println(szineket);
 }
}