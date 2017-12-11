package id.ivandimas;

import java.util.ArrayList;

public class DaftarBuku {

    private ArrayList<Buku> daftar;

    public DaftarBuku() {
        this.daftar = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        this.daftar.add(buku);
    }

    public void hapusBuku(int id) {
        for (Buku buku : this.daftar) {
            if (buku.getId() == id) {
                this.daftar.remove(buku);
                break;
            }
        }
    }

    public int getSize() {
        return this.daftar.size();
    }

    public Buku getBuku(int id) {
        for (Buku buku : this.daftar) {
            if (buku.getId() == id) {
                return buku;
            }
        }
        return null;
    }

    public Buku[] getArray() {
        Buku[] array = new Buku[this.daftar.size()];
        for (int i = 0; i < this.daftar.size(); i++) {
            array[i] = this.daftar.get(i);
        }
        return array;
    }

}
