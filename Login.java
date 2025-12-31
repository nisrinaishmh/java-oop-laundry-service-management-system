// PROJECT AKHIR PBO KELOMPOK 7 INF B P2
// J0303211083 IRNA AULIA
// J0303211111 NISRINA ISHMAH MAHIRA
// J0303211127 KHAERA UMMAH
// PROGRAM LAUNDRY KINETIC

// OOP Concept : Class Relation Composition dari LoginAdmin
public class Login implements LoginAdmin {
    // OOP Concept : Attribute
    String username, password, nama, pass;
    
    // OOP Concept : Polymorphisme (Overloading dan Overriding)
    // OOP Concept : Overloading
    public Login(String username, String password, String nama, String pass){
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.pass = pass;
    }

    // OOP Concept : Overloading
    public Login(){

    }

    // OOP Concept : Overriding
    @Override
    public String getUsername(){
        return username;
    }

    @Override
    public void setUsername(String username){
        this.username = username;
    }

    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public void setPassword(String password){
        this.password = password;
    }

}