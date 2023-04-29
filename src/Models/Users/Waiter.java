package Models.Users;

public class Waiter extends User{
    private String idWaiter;

    public Waiter() {}

    public Waiter(String nama, String email, String password, String idWaiter) {
        super.setNama(nama);
        super.setEmail(email);
        super.setPassword(password);
        this.idWaiter = idWaiter;
    }


}
