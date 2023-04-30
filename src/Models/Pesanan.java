package Models;

import java.util.ArrayList;

public class Pesanan {
    private Integer noPesanan;
    private String namaPesanan;
    private ArrayList<Menu> menuArrayList;
    private Integer totalHarga;
    private String status;

    public Pesanan(Integer noPesanan, String namaPesanan, String status) {
        this.noPesanan = noPesanan;
        this.namaPesanan = namaPesanan;
        this.status = status;
        this.totalHarga = 0;
        this.menuArrayList = new ArrayList<Menu>();
    }

    public void addMenu(Menu menu, Integer jumlah) {
        totalHarga += menu.getHargaMakanan();
        menuArrayList.add(menu);
        menu.setQuantitas(menu.getQuantitas() - jumlah);
    }

    public Integer getNoPesanan() {
        return noPesanan;
    }

    public void setNoPesanan(Integer noPesanan) {
        this.noPesanan = noPesanan;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }

    public ArrayList<Menu> getMenuArrayList() {
        return menuArrayList;
    }

    public void setMenuArrayList(ArrayList<Menu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }

    public Integer getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(Integer totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
