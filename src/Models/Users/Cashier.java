package Models.Users;

public class Cashier extends User {
    private Integer nomorPegawai;

    public Cashier() {}

    public Cashier(String nama, String email, String password, Integer nomorPegawai) {
        super.setNama(nama);
        super.setEmail(email);
        super.setPassword(password);
        this.nomorPegawai = nomorPegawai;
    }

    public void setCashier(Cashier cashier) {
        super.setNama(cashier.getNama());
        super.setEmail(cashier.getEmail());
        this.nomorPegawai = cashier.getNomorPegawai();
    }

    public Integer getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(Integer nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }
}
