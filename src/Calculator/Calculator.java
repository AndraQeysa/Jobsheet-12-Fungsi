package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        boolean looping = true;
        do {
            
        System.out.println("====== CALCULATOR ======");
        System.out.println("[1] PENJUMLAHAN");
        System.out.println("[2] PENGURANGAN");
        System.out.println("[3] PERKALIAN");
        System.out.println("[4] PEMBAGIAN");
        System.out.println("[5] MODULUS");
        System.out.println("[6] Exit");
        System.out.print("Pilih Nomor Pesanan: ");
        Scanner noir = new Scanner(System.in);
        int bilangan = noir.nextInt();
        if (bilangan == 1) {
            System.out.println("===CALCULATOR PENJUMLAHAN ===");
            System.out.print("MASUKKAN BILANGAN 1: ");
            int a = noir.nextInt();
            System.out.print("\nMASUKKAN BILANGAN 2: ");
            int b = noir.nextInt();
            System.out.println();
            jumlah(a, b);

        } else if (bilangan == 2) {
            System.out.println("===CALCULATOR PENGURANGAN ===");
            System.out.print("MASUKKAN BILANGAN 1: ");
            int a = noir.nextInt();
            System.out.print("\nMASUKKAN BILANGAN 2: ");
            int b = noir.nextInt();
            System.out.println();
            kurang(a, b);

        } else if (bilangan == 3) {
            System.out.println("===CALCULATOR PERKALIAN ===");
            System.out.print("MASUKKAN BILANGAN 1: ");
            int a = noir.nextInt();
            System.out.print("\nMASUKKAN BILANGAN 2: ");
            int b = noir.nextInt();
            System.out.println();
            kali(a, b);

        } else if (bilangan == 4) {
            System.out.println("===CALCULATOR PEMBAGIAN ===");
            System.out.print("MASUKKAN BILANGAN 1: ");
            int a = noir.nextInt();
            System.out.print("\nMASUKKAN BILANGAN 2: ");
            int b = noir.nextInt();
            System.out.println();
            bagi(a, b);

        } else if (bilangan == 5) {
            System.out.println("===CALCULATOR MODULUS ===");
            System.out.print("MASUKKAN BILANGAN 1: ");
            int a = noir.nextInt();
            System.out.print("\nMASUKKAN BILANGAN 2 : ");
            int b = noir.nextInt();
            System.out.println();
            if (a > b) {
                modulus(a, b);
            } else {
                System.out.println("INFINITY");
            }

        } else if (bilangan == 6) {
         looping = false;   
        } else {
            System.out.println("CODE SALAH");
            System.out.println("SILAHKAN COBA LAGI!!");
        }
       } while (looping); 
    }

    public static int jumlah(int a, int b) {
        System.out.println("HASIL: " + (a + b));
        return 0;
    }

    public static int kurang(int a, int b) {
        System.out.println("HASIL: " + (a - b));
        return 0;
    }

    public static int kali(int a, int b) {
        System.out.println("HASIL: " + (a * b));
        return 0;
    }

    public static double bagi(double a, double b) {
        System.out.println("HASIL: " + (a / b));
        return 0;
    }

    public static int modulus(double a, double b) {
        System.out.println("HASIL: " + (a % b));
        return 0;
    }

}
