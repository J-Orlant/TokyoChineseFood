package Models;

import Models.Menu;
import Models.Pesanan;
import Models.Transaksi;
import Models.Users.Cashier;
import Models.Users.User;
import Models.Users.Waiter;

import java.util.ArrayList;

public class DataBaseRes {
    ArrayList<User> userArrayList = new ArrayList<User>();
    ArrayList<Menu> menuArrayList = new ArrayList<Menu>();
    ArrayList<Pesanan> pesananArrayList = new ArrayList<Pesanan>();
    ArrayList<Transaksi> transaksiArrayList = new ArrayList<Transaksi>();

    public DataBaseRes () {
        initializeUser();
        initializeMenu();
    }

    private void initializeUser() {
        this.userArrayList.add(new Cashier("Yoges", "Yoges@gmail.com", "12345", 1));
        this.userArrayList.add(new Waiter("Evan", "Evan@gmail.com", "12345", "W123"));
    }

    private void initializeMenu() {
        this.menuArrayList.add(new Menu("Ayam", 20000, 2));
        this.menuArrayList.add(new Menu("Bakso", 10000, 20));
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public ArrayList<Menu> getMenuArrayList() {
        return menuArrayList;
    }

    public void setMenuArrayList(ArrayList<Menu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }

    public ArrayList<Pesanan> getPesananArrayList() {
        return pesananArrayList;
    }

    public void setPesananArrayList(ArrayList<Pesanan> pesananArrayList) {
        this.pesananArrayList = pesananArrayList;
    }

    public ArrayList<Transaksi> getTransaksiArrayList() {
        return transaksiArrayList;
    }

    public void setTransaksiArrayList(ArrayList<Transaksi> transaksiArrayList) {
        this.transaksiArrayList = transaksiArrayList;
    }
}
