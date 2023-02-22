/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oraimunka;

/**
 *
 * @author tegze
 */
public class Oraimunka {

    /**
     * @param args the command line arguments
     */
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
        System.out.printf("Az els? %d szám összege: %d\n", a, b);
        
            
    }
    }
