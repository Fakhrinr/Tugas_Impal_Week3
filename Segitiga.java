
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author fakhrinurramdhani
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        
        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("tidak ada segitiga yang dibangun");
        }
        
    }
    
}
