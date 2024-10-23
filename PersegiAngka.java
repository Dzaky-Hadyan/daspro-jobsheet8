import java.util.Scanner;
public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int N = sc.nextInt();
        if (N > 2) {
        int baris = 1;
        do {
            int kolom = 1;
            do {
            if (baris == 1 || baris == N) {
                System.out.print(N + " ");
            } else if (kolom == 1 || kolom == N) {
                System.out.print(N + " ");
            } else {
                System.out.print("  ");
            }
            kolom++;
            } while (kolom <= N);
        System.out.println();
        baris++;
        } while (baris <= N);
        sc.close();
        } else {
            System.out.print("Input Invalid");
        }
    }
}
