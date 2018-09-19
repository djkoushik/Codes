package Project.ATM;

public class UserAccount extends Withdraw {
    private double account_Balance;
    private String user_Name;
    private long account_number;

    UserAccount(double account_Balance, String user_Name, long account_number) {
        this.account_Balance = account_Balance;
        this.user_Name = user_Name;
        this.account_number = account_number;
    }

    public double getAccount_Balance() {
        return account_Balance;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_Balance(double account_Balance) {
        this.account_Balance = account_Balance;
    }


    public static void main(String argv[])
    {
        UserAccount u1 = new UserAccount(100000, "Hero Humada",56685941);
        u1.Amount(28700);
    }

    public void Amount(double amount) {
        withdraw(amount, this.account_Balance);
    }
}