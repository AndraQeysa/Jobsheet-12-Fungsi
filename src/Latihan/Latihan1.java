package Latihan;

import java.util.Scanner;

public class Latihan1 {

    public static void greet() {
        System.out.println("Welcome to SMK TELKOM MALANG");
    }

    public static void hitung(int a, int b) {
        System.out.println("Hasil: " + (a + b));
    }

    public static void main(String[] args) {
        greet();
        Scanner noir = new Scanner(System.in);

        System.out.print("Masukkan nilai bilangan I: ");
        int bil = noir.nextInt();

        System.out.print("Masukkan nilai bilangan II: ");
        int bilII = noir.nextInt();

        hitung(bil, bilII);
     
    }
}
