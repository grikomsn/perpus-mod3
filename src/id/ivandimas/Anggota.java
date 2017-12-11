package id.ivandimas;

public class Anggota {

    private String user, pass, nama, ktp, alamat, lahir;

    public Anggota(String user, String pass, String nama, String ktp, String alamat, String lahir) {
        this.user = user;
        this.pass = pass;
        this.nama = nama;
        this.ktp = ktp;
        this.alamat = alamat;
        this.lahir = lahir;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getNama() {
        return nama;
    }

    public String getKtp() {
        return ktp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getLahir() {
        return lahir;
    }

}
