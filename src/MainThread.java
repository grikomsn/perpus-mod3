import id.ivandimas.*;

public class MainThread implements Runnable {

    @Override
    public void run() {
        // inisialisasi daftar anggota
        DaftarAnggota daftarAnggota = new DaftarAnggota();
        // inisialisasi daftar anggota

        // tambah anggota inline
        daftarAnggota.tambahAnggota(new Anggota(
                "username", "passWORD1234", "Nama Lengkap",
                "123456789012345", "Alamat", "31/12/1987"
        ));
        // tambah anggota inline

        // tambah anggota input
        String user;
        do {
            System.out.print("User:");
            user = Bantuan.inputTulisan();
            if (!Bantuan.checkUsername(user)) {
                System.out.println("User salah anjay :v");
            }
        } while (!Bantuan.checkUsername(user));

        String pass;
        do {
            System.out.print("Pass:");
            pass = Bantuan.inputTulisan();
            if (!Bantuan.checkPassword(pass)) {
                System.out.println("Password ga tepak :v");
            }
        } while (!Bantuan.checkPassword(pass));

        System.out.print("Nama:");
        String namaLengkap = Bantuan.inputTulisan();

        String katepe;
        do {
            System.out.print("Katepe:");
            katepe = Bantuan.inputTulisan();
            if (!Bantuan.checkKtp(katepe)) {
                System.out.println("Katepe salah he :v");
            }
        } while (!Bantuan.checkKtp(katepe));

        System.out.print("Alamat:");
        String alamat = Bantuan.inputTulisan();

        System.out.print("Lahir:");
        String lahir = Bantuan.inputTulisan();

        daftarAnggota.tambahAnggota(new Anggota(user, pass, namaLengkap, katepe, alamat, lahir));
        // tambah anggota input

        // input username
        System.out.print("Username: ");
        String username = Bantuan.inputTulisan();
        // input username

        // input password
        System.out.print("Password: ");
        String password = Bantuan.inputTulisan();
        // input password

        // check login
        System.out.printf("Login %s!\n", daftarAnggota.loginAnggota(username, password) ? "sukses" : "gagal");
        // check login

        // inisialisasi daftar buku
        DaftarBuku daftarBuku = new DaftarBukuBaru();
        // inisialisasi daftar buku

        // tambah buku inline
        daftarBuku.tambahBuku(new Buku(666, "Buku Sesat"));
        // tambah buku inline

        // tambah buku manual
        int id;
        System.out.print("ID buku: ");
        id = Bantuan.inputAngka();

        String namaBuku;
        System.out.print("Nama buku: ");
        namaBuku = Bantuan.inputTulisan();

        daftarBuku.tambahBuku(new Buku(id, namaBuku));
        // tambah buku manual

        // list semua buku
        for (Buku buku : daftarBuku.getArray()) {
            System.out.println(buku.getId() + " - " + buku.getNama());
        }
        // list semua buku
    }

}
