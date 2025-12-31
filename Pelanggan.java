// PROJECT AKHIR PBO KELOMPOK 7 INF B P2
// J0303211083 IRNA AULIA
// J0303211111 NISRINA ISHMAH MAHIRA
// J0303211127 KHAERA UMMAH
// PROGRAM LAUNDRY KINETIC

// OOP Concept : Inheritance
public class Pelanggan extends BonLaundry {
    private String namaPelanggan;

    // OOP Concept : Overriding
    @Override
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    @Override
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
}
