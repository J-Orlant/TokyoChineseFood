package Controllers;

import Models.Users.Cashier;
import Views.CashierPage;

public class CashierController {
    private Cashier model;
    private CashierPage view;

    public CashierController(Cashier model, CashierPage view) {
        this.model = model;
        this.view = view;
    }

    public String getCashierNama() {
        return model.getNama();
    }

    public String getCashierEmail() {
        return model.getEmail();
    }

    public Integer getNomorCashier() {
        return model.getNomorPegawai();
    }

    public void showView() {
        view.showView();
    }
}
