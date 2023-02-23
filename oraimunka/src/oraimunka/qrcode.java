
package oraimunka;
import java.util.Random;

public class qrcode {
    private static Random rng = new Random();
public static void main(String[] args) {
   foprogram();
}
 private static void foprogram() {
        kiir(qr());
        kiir(qr(true));
        kiir(qr(15));
 }
 private static String qr(int meret){
      String s = "";
         
        for (int i = 0; i < meret; i++) {
            for (int j = 0; j < meret; j++) {
                int szam = rng.nextInt(2);
                if (szam == 1){
                    s += "*";
                }
                else{
                    s += " ";
                }
           
            }
            if(i < meret-1){
                s +="\n";
            }
     }
     return s;
 }
 private static String qr(){
      String s = "";
      int szam = 5;
         s = qr(szam);
     return s;
 }      
 private static String qr(boolean allit){
      String s = "";
      if(allit == true){
       s+= "..........\n";
       s+= ".        .\n";
       s+= ".   .    .\n";
       s+= ".        .\n";
       s+= "..........\n";
      }
      return s;
 }
 
 private static void kiir(String szineket){
     System.out.println(szineket);
 }
}
