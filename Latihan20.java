import java.util.Scanner;
/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Target Saldo tabungan
 */
public class Latihan20 {
    public static void main(String[] args) {
        System.out.print("Saldo Awal : Rp.");
        int saldo = new Scanner(System.in).nextInt();

        System.out.print("Bunga/bulan(%) :");
        int bunga = new Scanner(System.in).nextInt();

        System.out.print("Saldo Target :");
        int target = new Scanner(System.in).nextInt();

    int i;
    i=1;
        do {
            saldo = saldo + (saldo*bunga/100);
            System.out.println("Saldo di bulan ke-"+i+" Rp. " + saldo );
            i++;
            target++;
        } while (saldo<=target);

    }
}
