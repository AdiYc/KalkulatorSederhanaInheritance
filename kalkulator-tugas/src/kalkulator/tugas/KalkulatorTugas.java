

/*
 * Aplikasi Sederhana Kalkulator - Console
 * Nama: Muhammad Adiyaksa
 * Kelas: X-PPLG 1
 * Tugas 29 Mei 2023 Kalkulator Sederhana dengan Inheritance 
 * Github: https://github.com/AdiYc
 */

package kalkulator.tugas;


// import package
import java.util.Scanner;


// Class nya 
class Kalkulator{

    // Penjumlahan atau pertambahan
    public int penjumlahan(int bil1, int bil2)
    {
        return bil1 + bil2;
    }

    // Pengurangan
    public int pengurangan(int bil1, int bil2)
    {
        return bil1 - bil2;
    }

}

// Keturunan nya
class KalkulatorKeturunan extends Kalkulator {

    // Perkalian
    public int perkalian(int bil1, int bil2) {
        return bil1 * bil2;
    }

    // Pembagian
    public int pembagian(int bil1, int bil2) {
        return bil1 / bil2;
    }

}


/*
 * 
 * Beberapa kode yang saya tambah dan modif adalah:
 * 
 * 1.pembuatan pilihan pengulangan program, jadi jika sudah ada output hasil maka akan ada pilihan 
 * menu untuk ulang program jika user ketik y maka user menggulang program maka sebaliknya.
 * 
 * 2.penambahan inheritance.
 * 
 * 3.mengubah kode dari switch ke if.
 * 
 */


public class KalkulatorTugas {
    public static void main(String[] args) {

        boolean ulang;
        Scanner input  = new Scanner(System.in);  

        do{
            
            // Membersihkan teks terminal / console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Variabel
            KalkulatorKeturunan kalkulator = new KalkulatorKeturunan();

            // Mengubah nama variabel dari pilihan jadi operasi
            int bil1, bil2, hasil = 0;
            int operasi;

            String opsi_pengulangan;
            
            // Output Console
            System.out.println("PROGRAM JAVA KALKULATOR SEDERHANA");
            System.out.println("1.Perkalian");
            System.out.println("2.Pembagian");
            System.out.println("3.Penjumlahan");
            System.out.println("4.Pengurangan");
            System.out.println("-------------------------------------");
            
            // Pilihan Menu
            System.out.println("Pilihan operasi: ");
            operasi = input.nextInt();


            // Mengecek pilihan jika masuk statement ini berarti pilihan menunya tidak ada
            if(operasi > 4 || operasi == 0) 
            {
                System.out.println("Pilihan tidak tersedia");
            } 
            
            // Operasi perkalian
            if(operasi == 1) 
            {   
                System.out.println("-------------------------------------");
                System.out.println("Kamu memilih program perkalian");

                System.out.println("Masukan bilangan 1: ");
                bil1 = input.nextInt();

                System.out.println("Masukan bilangan 2: ");
                bil2 = input.nextInt();

                System.out.println("-------------------------------------");

                // Hasil
                hasil = kalkulator.perkalian(bil1, bil2);
            } 
            
            // Operasi pembagian
            if(operasi == 2)
            {
                System.out.println("-------------------------------------");
                System.out.println("Kamu memilih program pembagian");

                System.out.println("Masukan bilangan 1: ");
                bil1 = input.nextInt();

                System.out.println("Masukan bilangan 2: ");
                bil2 = input.nextInt();

                System.out.println("-------------------------------------");

                // Hasil
                hasil = kalkulator.pembagian(bil1, bil2);
            }

            // Operasi pembagian
            if(operasi == 3)
            {
                System.out.println("-------------------------------------");
                System.out.println("Kamu memilih program penjumlahan");

                System.out.println("Masukan bilangan 1: ");
                bil1 = input.nextInt();

                System.out.println("Masukan bilangan 2: ");
                bil2 = input.nextInt();

                System.out.println("-------------------------------------");

                // Hasil
                hasil = kalkulator.penjumlahan(bil1, bil2);
            }

            // Operasi pembagian
            if(operasi == 4)
            {
                System.out.println("-------------------------------------");
                System.out.println("Kamu memilih program pengurangan");

                System.out.println("Masukan bilangan 1: ");
                bil1 = input.nextInt();

                System.out.println("Masukan bilangan 2: ");
                bil2 = input.nextInt();

                System.out.println("-------------------------------------");

                // Hasil
                hasil = kalkulator.pengurangan(bil1, bil2);
            }

            // OUTPUT HASIL 
            System.out.println("Hasil nya: " + hasil);

            System.out.println("Apakah anda ingin mengulang program (y/n): ");
            opsi_pengulangan = input.next();    

            // Mengulang program
            if (opsi_pengulangan.equals("y")) {
                ulang = true;
            } else {
                ulang = false;
            }

            System.out.println("-------------------------------------");

        }while(ulang);
        
        input.close(); // Menutup scanner / input agar tidak resource leak

    }
    
}
