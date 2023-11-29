package pkg22166012.pbo.lat60;

/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program Latihan 60
 */

class Karakter {
    private String nama;
    private String elemen;
    private String kekuatan;

    public Karakter(String nama, String elemen, String kekuatan) {
        this.nama = nama;
        this.elemen = elemen;
        this.kekuatan = kekuatan;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Elemen: " + elemen);
        System.out.println("Kekuatan: " + kekuatan);
    }
}

class Akatsuki {
    private String[] anggota;
    private String tujuan;

    public Akatsuki(String[] anggota, String tujuan) {
        this.anggota = anggota;
        this.tujuan = tujuan;
    }

    public void tampilInfo() {
        System.out.println("Anggota Akatsuki: ");
        for (String nama : anggota) {
            System.out.println("- " + nama);
        }
        System.out.println("Tujuan: " + tujuan);
    }
}

class Itachi extends Karakter {
    public Itachi(String nama, String elemen, String kekuatan) {
        super(nama, elemen, kekuatan);
    }

    public void sharingan() {
        System.out.println("Mengaktifkan kekkei genkai Sharingan.");
    }
}

class Deidara extends Karakter {
    public Deidara(String nama, String elemen, String kekuatan) {
        super(nama, elemen, kekuatan);
    }

    public void clayExplosion() {
        System.out.println("Menggunakan kekuatan ledakan tanah liat.");
    }
}

class Kisame extends Karakter {
    public Kisame(String nama, String elemen, String kekuatan) {
        super(nama, elemen, kekuatan);
    }

    public void clayExplosion() {
        System.out.println("memiliki penampilan khusus yang menyerupai ikan hiu.");
    }
}


public class PBOLat60 {
    public static void main(String[] args) {
        String[] anggotaAkatsuki = {"Itachi", "Deidara", "Kisame", "Hidan", "Kakuzu", "Pain", "Konan", "Sasori", "Orochimaru", "Tobi", "Zetsu"};
        Akatsuki akatsuki = new Akatsuki(anggotaAkatsuki, "Mengumpulkan Bijuu untuk tujuan tertentu.");

        Itachi itachi = new Itachi("Itachi Uchiha", "Api", "Tsukuyomi, Amaterasu, Susano'o");
        Deidara deidara = new Deidara("Deidara", "Tanah Liat", "Kibaku Nendo");
        Kisame kisame = new Kisame ("Kisame", "Tanah", "chakra");

        akatsuki.tampilInfo();
        System.out.println();

        itachi.tampilInfo();
        itachi.sharingan();
        System.out.println();

        deidara.tampilInfo();
        deidara.clayExplosion();
        System.out.println();

        kisame.tampilInfo();
        kisame.clayExplosion();
    }
}
