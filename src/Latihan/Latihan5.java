package Latihan;
import java.util.Scanner;
public class Latihan5 {
    static Scanner noir = new Scanner(System.in);
    
    static int bilangan (int a, int b, int c){    
        if (a >  b && b > c) {
            System.out.println("\nBilangan Terbesar Adalah I: " + a);
        } else if (a < b && b > c) {
            System.out.println("\nBilangan Terbesar Adalah II: " + b);
        } else System.out.println("\nBilangan Terbesar Adalah III : " + c);
        return 0;
    }
    
    public static void main (String[] args){
        System.out.print("Input Bilangan I: ");
        int a = noir.nextInt();
        System.out.print("\nInput Bilangan II: ");
        int b = noir.nextInt();
        System.out.print("\nInput Bilangan III: ");
        int c = noir.nextInt();
        
        bilangan(a,b,c);
    }
}
