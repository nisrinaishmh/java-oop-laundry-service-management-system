// PROJECT AKHIR PBO KELOMPOK 7 INF B P2
// J0303211083 IRNA AULIA
// J0303211111 NISRINA ISHMAH MAHIRA
// J0303211127 KHAERA UMMAH
// PROGRAM LAUNDRY KINETIC

// ArrayList untuk menyimpan list data pelayanan
import java.util.ArrayList;
// Scanner untuk menginput data atau nilai saat setelah program dijalankan
// Berfungsi untuk menginput paket scanner guna mempersingkat pengetikan
import java.util.Scanner;

// OOP Concept : Inheritance
public class CRUD extends BonLaundry {
    // OOP Concept : Object
    ArrayList<DaftarPelayanan> list = new ArrayList<>();
    // OOP Concept : Object
    Scanner input = new Scanner(System.in);

    String namaPelayanan = null;
    int harga = 0, jumlah = 0, hargaTotal = 0, TotalSemua = 0, TotalSemua2;
    static int Semua, Semua2;
    int no = 1;
    int pilih,banyak;
    // OOP Concept : Modifier : Private
    private String jenisPelayanan;

    // OOP Concept : Method
    void menuPilih() {
        System.out.println("          SELAMAT DATANG DI LAUNDRY KINETIC          ");
        System.out.println("=====================================================");
        System.out.print("Masukkan berapa banyak pelayanan yang akan diakan dipilih : ");
        banyak = input.nextInt();
        for(int i = 0; i<banyak ; i++) {
            System.out.println("==========================================");
            System.out.println("No  |   Nama Pelayanan   |     Harga     |");
            System.out.println("1.  |   Cuci Basah       |    Rp 4.000   |");
            System.out.println("2.  |   Cuci Kering      |    Rp 5.000   |");
            System.out.println("3.  |   Cuci Lipat       |    Rp 6.000   |");
            System.out.println("4.  |   Cuci Setrika     |    Rp 7.000   |");
            System.out.println("==========================================");
            System.out.println("");
            System.out.print("Masukkan pilihan pelayanan laundry : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1 :
                    jenisPelayanan = "Cuci Basah";
                    harga = 4000;
                    System.out.print("Jumlah pakaian : ");
                    jumlah = input.nextInt();
                    break;
                case 2 :
                    jenisPelayanan = "Cuci Kering";
                    harga = 5000;
                    System.out.print("Jumlah pakaian : ");
                    jumlah = input.nextInt();
                    break;
                case 3 :
                    jenisPelayanan = "Cuci Lipat";
                    harga = 6000;
                    System.out.print("Jumlah pakaian : ");
                    jumlah = input.nextInt();
                    break;
                case 4 :
                    jenisPelayanan = "Cuci Setrika";
                    harga = 7000;
                    System.out.print("Jumlah pakaian : ");
                    jumlah = input.nextInt();
                    break;
                default :
                    System.out.println("Maaf Anda salah memasukkan kode");
                    break;
            }
            hargaTotal = jumlah * harga;
            list.add(new DaftarPelayanan(no, jenisPelayanan, harga, jumlah, hargaTotal));
            no++;
        }
    }

    // OOP Concept : Method
    void lihatPelayanan() {
        System.out.println("|  No  |"+" Nama Pelayanan  |"+" Harga  |"+" Jumlah  |"+" Harga Total  |");
        for(int i = 0; i < list.size(); i++){
            System.out.println("|  "+ list.get(i).getNo()+ "      " + list.get(i).getjenisPelayanan()+ "       " + list.get(i).getHarga()+ "      "+ list.get(i).getJumlah()+ "           "+ list.get(i).getHargaTotal()+ "          ");
            TotalSemua += list.get(i).getHargaTotal();
            TotalSemua2 += list.get(i).getHargaTotal();
            Semua2 = TotalSemua2/2;
        }
    }

    // OOP Concept : Method
    void hapus(int no) {
        for (int i = 0; i < list.size(); i++) {
            if (no == list.get(i).getNo()){
                Semua = TotalSemua - list.get(i).getHargaTotal();
                list.remove(list.get(i));
                System.out.println("Pilihan telah dihapus");
                System.out.println("=====================================================");
            }
        }
    }

    // OOP Concept : Overriding
    @Override
    public String getNamaPelanggan(){
        return null;
    }

    @Override
    public void setNamaPelanggan(String namaPelanggan){

    }
}