package id.ivandimas;

public class DaftarBukuBaru extends DaftarBuku {

    public DaftarBukuBaru() {
        super();
        int[] id = {123, 234, 345, 456, 567};
        String[] nama = {"Atlas", "Buku Sembarang", "C++: 7th Edition", "Delphi: Basics", "Economy Fundamentals"};
        for (int i = 0; i < 5; i++) {
            this.tambahBuku(new Buku(id[i], nama[i]));
        }
    }
}
