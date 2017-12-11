package id.ivandimas;

import java.util.ArrayList;

public class DaftarAnggota {

    private ArrayList<Anggota> daftar;

    public DaftarAnggota() {
        this.daftar = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        this.daftar.add(anggota);
    }

    public boolean loginAnggota(String username, String password) {
        for (Anggota anggota : this.daftar) {
            if (anggota.getUser().equals(username)) {
                return anggota.getPass().equals(password);
            }
        }
        return false;
    }

}
