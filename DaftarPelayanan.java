// PROJECT AKHIR PBO KELOMPOK 7 INF B P2
// J0303211083 IRNA AULIA
// J0303211111 NISRINA ISHMAH MAHIRA
// J0303211127 KHAERA UMMAH
// PROGRAM LAUNDRY KINETIC

// OOP Concept : Inheritance
public class DaftarPelayanan extends BonLaundry {
    // OOP Concept : Access Modifier
    public String jenisPelayanan;
    public int no, harga, jumlah, hargaTotal;
    
    // OOP Concept : Constructor
    public DaftarPelayanan(int no, String jenisPelayanan, int harga, int jumlah, int hargaTotal){
        this.no = no;
        this.jenisPelayanan = jenisPelayanan;
        this.harga = harga;
        this.jumlah = jumlah;
        this.hargaTotal = hargaTotal;
    }

    // OOP Concept : Override method
    @Override
    public String getNamaPelanggan(){
        return null;
    }

    @Override
    public void setNamaPelanggan(String namaPelanggan){

    }

    public String getJenis(){
        return jenisPelayanan;
    }

    public void setJenis(String jenisPelayanan){
        this.jenisPelayanan = jenisPelayanan;
    }

    public int getNo(){
        return no;
    }

    public void setNo(int no){
        this.no = no;
    }
    
    public int getHarga(){
        return harga;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public int getJumlah(){
        return jumlah;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public int getHargaTotal(){
        return hargaTotal;
    }

    public void setHargaTotal(int hargaTotal){
        this.hargaTotal = hargaTotal;
    }

    public String getjenisPelayanan(){
        return jenisPelayanan;
    }

    public void setjenisPelayanan(String jenisPelayanan){
        this.jenisPelayanan = jenisPelayanan;
    }
}