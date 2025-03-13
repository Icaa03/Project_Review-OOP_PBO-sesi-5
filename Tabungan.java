public class Tabungan extends Rekening {
    double bungaTahunan;

    public Tabungan(String namaPemilik, String nomorRekening, double saldo, double bungaTahunan) {
        super(namaPemilik, nomorRekening, saldo);
        this.bungaTahunan = bungaTahunan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    }

    // Menghitung bunga berdasarkan bulan
    public double hitungBunga(int bulan) {
        return saldo * (bungaTahunan / 100) * bulan / 12;
    }
}

