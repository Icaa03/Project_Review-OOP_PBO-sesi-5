public class Giro extends Rekening {
    double limitPenarikan;

    public Giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah <= saldo + limitPenarikan) {
            saldo -= jumlah;
        } else {
            System.out.println("Penarikan melebihi limit.");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Limit Penarikan: Rp " + limitPenarikan);
    }
}
