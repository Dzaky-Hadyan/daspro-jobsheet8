import java.util.Scanner;
public class Porseni {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String namaBadmintonTotal = "", namaTenisMejaTotal = "", namaBasketTotal = "", namaVolyTotal = "", namaPoliteknik;
        System.out.print("Jumlah politeknik yang mendaftar: ");
        int jumlah = sc.nextInt();
        int politeknik = 1;
        String sampah = sc.nextLine();
        do {
        System.out.print("Masukkan nama politeknik ke-" + politeknik + ": ");
        namaPoliteknik = sc.nextLine();
        System.out.println();
        System.out.println("Badminton");
        System.out.println();
        int i = 1;    
        do {
            System.out.print("Nama atlet ke-" + i + ": ");
            String namaBadminton = sc.nextLine();
            namaBadmintonTotal += " " + namaBadminton + ",";
            i++;
        } while (i <= 5);
        System.out.println();
        System.out.println("Tenis meja");
        System.out.println();
        int j = 1;
        do {
            System.out.print("Nama atlet ke-" + j + ": ");
            String namaTenisMeja = sc.nextLine();
            namaTenisMejaTotal += " " + namaTenisMeja + ",";
            j++;
        } while (j <= 5);
        System.out.println();
        System.out.println("Basket");
        System.out.println();
        int k = 1;
        do {
            System.out.print("Nama atlet ke-" + k + ": ");
            String namaBasket = sc.nextLine();
            namaBasketTotal += " " + namaBasket + ",";
            k++;
        } while (k <= 5);
        System.out.println();
        System.out.println("Bola Voly");
        System.out.println();
        int l = 1;
        do {
            System.out.print("Nama atlet ke-" + l + ": ");
            String namaVoly = sc.nextLine();
            namaVolyTotal += " " + namaVoly + ",";
            l++;
        } while (l <= 5);
        politeknik++;
        } while (politeknik <= jumlah);
        System.out.println();
        System.out.println("Atlet Badminton: " + namaBadmintonTotal);
        System.out.println();
        System.out.println("Atlet Tenis Meja: " + namaTenisMejaTotal);
        System.out.println();
        System.out.println("Atlet Basket: " + namaBasketTotal);
        System.out.println();
        System.out.println("Atlet Bola Voly: " + namaVolyTotal);
        sc.close();
    }
}