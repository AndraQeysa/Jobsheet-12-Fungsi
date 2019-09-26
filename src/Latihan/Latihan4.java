package Latihan;
import java.util.Scanner;
public class Latihan4 {
    public static double kecepatan(double jarak, double waktu){
        System.out.println("Kecepatan = " + (jarak / waktu) +" Km/jam");
        return 0;
    }
    
    public static void main(String[] args){
        Scanner noir = new Scanner(System.in);
        System.out.print("Masukkan Nilai Jarak(dalam Km): ");
        double jarak = noir.nextDouble();
        System.out.print("\nMasukkan Nilai Waktu(dalam jam): ");
        double waktu = noir.nextDouble();
        
        kecepatan(jarak,waktu);
    }
}
