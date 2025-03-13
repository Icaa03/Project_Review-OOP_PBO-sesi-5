public class Rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;

    // Constructor
    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    // Method setor
    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setoran: " + jumlah);
    }

    public void setor(double jumlah, boolean transfer) {
        if (transfer) {
            saldo += jumlah - 2500; // Biaya administrasi
        } else {
            saldo += jumlah;
        }
    }

    // Method tarik
    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan: " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk penarikan");
        }
    }

    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }  
}
