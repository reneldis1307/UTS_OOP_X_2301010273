
package uts_oop_x_2301010273;

import java.util.Scanner;

class DataEntry {
    private String isiData;

    public DataEntry() {
        this.isiData = "";
    }

    public DataEntry(String isiData) {
        this.isiData = isiData;
    }

    public String getIsiData() {
        return isiData;
    }

    public void setIsiData(String isiData) {
        this.isiData = isiData;
    }

    @Override
    public String toString() {
        return isiData;
    }
}

public class MenuAplikasitakoyaki {
    private static DataEntry[] dataList = new DataEntry[100];
    private static int jumlahData = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU APLIKASI  Mr.takoyaki===");
            System.out.println("1. Pencatatan Data");
            System.out.println("2. Menampilkan Data");
            System.out.println("3. Mengubah Data");
            System.out.println("4. Menghapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) {
                System.out.print("Input tidak valid, masukkan angka: ");
                input.next();
            }
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData(input);
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    ubahData(input);
                    break;
                case 4:
                    hapusData(input);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
            System.out.println();
        } while (pilihan != 5);

        input.close();
    }

    private static void tambahData(Scanner input) {
        if (jumlahData >= dataList.length) {
            System.out.println("Data penuh, tidak bisa menambahkan lagi.");
            return;
        }
        System.out.print("Masukkan data baru: ");
        String dataBaru = input.nextLine();
        dataList[jumlahData] = new DataEntry(dataBaru);
        jumlahData++;
        System.out.println("Data berhasil ditambahkan.");
    }

    private static void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data untuk ditampilkan.");
            return;
        }
        System.out.println("Daftar Data:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println((i + 1) + ". " + dataList[i]);
        }
    }

    private static void ubahData(Scanner input) {
        if (jumlahData == 0) {
            System.out.println("Data kosong, tidak ada yang bisa diubah.");
            return;
        }
        tampilkanData();
        System.out.print("Masukkan nomor data yang ingin diubah: ");
        if (!input.hasNextInt()) {
            System.out.println("Input tidak valid.");
            input.next();
            return;
        }
        int index = input.nextInt();
        input.nextLine();
        if (index < 1 || index > jumlahData) {
            System.out.println("Nomor data tidak valid.");
            return;
        }
        System.out.print("Masukkan data baru: ");
        String dataBaru = input.nextLine();
        dataList[index - 1].setIsiData(dataBaru);
        System.out.println("Data berhasil diubah.");
    }

    private static void hapusData(Scanner input) {
        if (jumlahData == 0) {
            System.out.println("Data kosong, tidak ada yang bisa dihapus.");
            return;
        }
        tampilkanData();
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        if (!input.hasNextInt()) {
            System.out.println("Input tidak valid.");
            input.next();
            return;
        }
        int index = input.nextInt();
        input.nextLine();
        if (index < 1 || index > jumlahData) {
            System.out.println("Nomor data tidak valid.");
            return;
        }
        for (int i = index - 1; i < jumlahData - 1; i++) {
            dataList[i] = dataList[i + 1];
        }
        dataList[jumlahData - 1] = null;
        jumlahData--;
        System.out.println("Data berhasil dihapus.");
    }
}
