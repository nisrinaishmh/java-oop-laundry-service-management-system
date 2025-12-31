// PROJECT AKHIR PBO KELOMPOK 7 INF B P2
// J0303211083 IRNA AULIA
// J0303211111 NISRINA ISHMAH MAHIRA
// J0303211127 KHAERA UMMAH
// PROGRAM LAUNDRY KINETIC

// Scanner untuk menginput data atau nilai saat setelah program dijalankan
// Berfungsi untuk menginput paket scanner guna mempersingkat pengetikan
import java.util.Scanner;

// OOP Concept : Class : Main
public class Main {

    static CRUD ce = new CRUD();
    static Pelanggan ok = new Pelanggan();
    static Scanner input = new Scanner(System.in);
    static int Bayar;
    static int Kembalian;
    static int pil;
    static int pilihan;

    public static void main(String[] args) {
        login();
    }

    public static void login(){
        Login c = new Login();

        System.out.println("=====================================================");
        System.out.println("            SELAMAT DATANG DI LOGIN ADMIN            ");
        System.out.println("=====================================================");
        System.out.print("Masukkan Username : ");
        c.nama = input.nextLine();
        System.out.print("Masukkan Password : ");
        c.pass = input.nextLine();
        c.setUsername("Admin Laundry Kinetic");
        c.setPassword("admin123");

        if(c.nama.equals(c.getUsername()) && c.pass.equals(c.getPassword())) {
            System.out.println("Login berhasil !");
            menu();
        }else {
            System.out.println("Login gagal, Masukkan Anda salah !");
            login();
        }
    }

    // OOP Concept : Method menu untuk menampilkan menu pelayanan 
    public static void menu() {
        System.out.println("Masukkan nama pelanggan : ");
        String nama = input.nextLine();
        ok.setNamaPelanggan(nama);
        System.out.println("Halo, "+ ok.getNamaPelanggan()+", Silahkan pilih pelayanan laundry dibawah ini :");
        do {
            System.out.println("=====================================================");
            System.out.println("          DAFTAR PELAYANAN LAUNDRY KINETIC           ");
            System.out.println("=====================================================");
            System.out.println("1. Lihat Daftar Pelayanan dan Pilih Pelayanan");
            System.out.println("2. Lihat Pelayanan yang sudah dipilih");
            System.out.println("3. Hapus Pelayanan");
            System.out.println("4. Bayar Pelayanan");
            System.out.println("5. Keluar Pelayanan");
            System.out.println("Pilih : ");
            pil = input.nextInt();

            switch(pil){
                case 1 : 
                    ce.menuPilih();
                    break;
                case 2 : 
                    ce.lihatPelayanan();
                    break;
                case 3 : 
                    System.out.print("Nomor berapa yang ingin dihapus : ");
                    int no = input.nextInt();
                    ce.hapus(no);
                    break;
                case 4 : 
                    System.out.println("Apakah pemilihan pelayanan sudah selesai? Ketik 1 jika Ya, dan Ketik 2 jika Tidak : ");
                    pilihan = input.nextInt();
                    CetakBon();
            }
        } while (pil < 5);
    }

    // OOP Concept : Method
    public static void CetakBon(){
        System.out.println("=====================================================");
        System.out.println("                 BON LAUNDRY KINETIC                 ");
        System.out.println("-----------------------------------------------------");
        System.out.println("              Jalan Kumbang No.14, Bogor             ");
        System.out.println("=====================================================");
        System.out.println("Admin : Irna");
        System.out.println("Lokasi : Bogor");
        System.out.println("");
        System.out.println("Nama Pelanggan : "+ ok.getNamaPelanggan());
        System.out.println("Daftar Pelayanan Anda : ");
        ce.lihatPelayanan();
        if (pilihan == 1){
            System.out.println("Total     : Rp. "+CRUD.Semua);
            System.out.println("Bayar     : Rp. ");
            Bayar = input.nextInt();
            Kembalian = Bayar - CRUD.Semua;  
        }
        else{
            System.out.println("Total     : Rp. "+CRUD.Semua2);
            System.out.println("Bayar     : Rp. ");
            Bayar = input.nextInt();
            Kembalian = Bayar - CRUD.Semua2;
        }
        System.out.println("                                         _________________ -");
        System.out.println("                            Kembalian : Rp "+ Kembalian);
        System.out.println("\n");
        System.out.println("                                        Admin       ");
        System.out.println("\n\n");
        System.out.println("                                         Irna       ");
        System.out.println("");
        System.out.println("  - TERIMA KASIH SUDAH MENGGUNAKAN PELAYANAN KAMI -  ");
        System.out.println("");
        System.out.println("=====================================================");
        System.out.println("        TERIMA KASIH ATAS KEPERCAYAAN ANDA           ");
        System.out.println("=====================================================");
    }
}
