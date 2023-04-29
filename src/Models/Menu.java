package Models;

public class Menu {
    private String namaMakanan;
    private Integer hargaMakanan;
    private Integer quantitas;

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public Integer getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(Integer hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public Integer getQuantitas() {
        return quantitas;
    }

    public void setQuantitas(Integer quantitas) {
        this.quantitas = quantitas;
    }
}
