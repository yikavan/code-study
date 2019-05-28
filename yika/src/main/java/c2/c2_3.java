package c2;

class Account {
    private String id;
    private double deposit;

    Account(String id, double deposit) {
        setId(id);
        setDeposit(deposit);
    }

    void setId(String id) {
        this.id = id;
    }

    void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    void adddeposit(double add) {
        deposit += add;
    }

    void Withdrawal(double want) {
        if (want > deposit) {
            System.out.println("您的存款不足，请给我钱");
        } else {
            deposit -= want;
        }
    }

    String getId() {
        return id;
    }

    double getDeposit() {
        return deposit;
    }

}

public class c2_3 {

    public static void main(String[] args) {
        Account temp = new Account("114514", 1919810);
        System.out.println(temp.getId() +' '+ temp.getDeposit());
        temp.setId("1919810");
        temp.setDeposit(114514);
        System.out.println(temp.getId()+' ' + temp.getDeposit());

    }
}