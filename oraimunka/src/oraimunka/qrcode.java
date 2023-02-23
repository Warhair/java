package oraimunka;

import java.util.Random;

public class qrcode {

    private static Random rng = new Random();

    public static void main(String[] args) {
        foprogram();
    }

    private static void foprogram() {
        kiir(qr());
        kiir(qr(20));
        kiir(qr(true));
        kiir(qr(20, true));
    }

    private static String qr(int meret, boolean allit) {
        String s = "";

        for (int i = 0; i < meret; i++) {
            for (int j = 0; j < meret; j++) {
                int szam = rng.nextInt(2);
                if (szam == 1) {
                    s += "*";
                } else {
                    s += " ";
                }

            }
            if (i < meret - 1) {
                s += "\n";
            }
        }
        if (allit == true) {
            s += "\n..........\n";
            s += ".        .\n";
            s += ".   .    .\n";
            s += ".        .\n";
            s += "..........\n";
        }
        return s;
    }

    private static String qr() {
        int szam = 10;
        String s = qr(szam, false);
        return s;
    }

    private static String qr(int hossz) {

        String s = qr(hossz, false);
        return s;
    }

    private static String qr(boolean allitas) {

        String s = qr(10, allitas);
        return s;
    }

    private static void kiir(String szineket) {
        System.out.println(szineket);
    }
}
