import java.util.Scanner;
public class BioskopWithScanner06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    
    String[][] penonton = new String[4][2];
    int menu;

        do {
            System.out.println("\n=== MENU BIOSKOP MINI ===");
            System.out.println("Menu 1 : Input data penonton");
            System.out.println("Menu 2 : Tampilkan daftar penonton");
            System.out.println("Menu 3 : Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

            if (menu == 1) {
                sc.nextLine();
                System.out.print("Masukkan nama penonton: ");
                String nama = sc.nextLine();

                boolean kursiValid = false;
                while (!kursiValid) {
                    System.out.print("Masukkan nomor baris (0-3): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan nomor kolom (0-1): ");
                    int kolom = sc.nextInt(); 

                    if (baris < 0 || baris >= 4 || kolom < 0 || kolom >= 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia!");
                    } else if (penonton[baris][kolom] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris][kolom]);
                    } else {
                        penonton[baris][kolom] = nama;
                        System.out.println("Data berhasil disimpan!");
                        kursiValid = true;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print((penonton[i][j] == null ? "***" : penonton[i][j]) + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih telah menggunakan sistem bioskop!");
            } else {
                System.out.println("Menu tidak tersedia!");
            }
        } while (menu != 3);
    }
}
