class Account {
    private String bank;
    private String name;
    private long accno;
    private String ifsc;
    private String branch;
    private double balance;
    private int pin;

    public Account(){

    }

    public Account(String bank, String name, long accno, String ifsc, String branch, int pin){
        this.bank = bank;
        this.name = name;
        this.accno = accno;
        this.ifsc = ifsc;
        this.branch = branch;
        this.pin = pin;
    }

    public String getBankName(){
        return bank;
    }
    public String getUserName(){
        return name;
    }
    public long getAccNo(){
        return accno;
    }
    public String getIFSC(){
        return ifsc;
    }
    public String getBranch(){
        return branch;
    }
    public double getBalance(long accno, int pin){
        if(this.accno == accno && this.pin == pin){
            System.out.println("Login Successfull");
            return balance;
        }
        else{
            System.out.println("Invalid Credentials");
            return 0.0;
        }
    }
    public void withdraw(long accno, int pin, double amt){
        if(this.accno == accno && this.pin == pin && amt > 0){
            System.out.println("login sucessfull");
            if(balance - amt >= 200){
                balance -= amt;
                System.out.println(amt + "Rs debited...");
                System.out.println("Your balance is "+ balance);
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }
    public void deposit(long accno, int pin, double amt){
        if(this.accno == accno && this.pin == pin && amt > 0){
            System.out.println("Login Successfull");
            balance += amt;

            System.out.println(amt + " is credited");
            System.out.println("Your balance is "+ balance);
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }
    public void setPin(long accno, int oldPin, int newPin){
        if(this.accno == accno && pin == oldPin){
            pin = newPin;
            System.out.println("Pin Updated");
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }  
}


public class AccountDriver {
    public static void main(String[] args) 
    {
        Account a1 = new Account("ICICI", "Raju", 1234567890, "ICI001", "DECCAN", 123);
        a1.getAccNo();
        a1.getBankName();
        a1.getBranch();
        a1.getIFSC();
        a1.getUserName();

        a1.getBalance(1234567890, 123);
        a1.deposit(1234567890, 123, 1000.0);
        a1.withdraw(1234567890, 123, 500.0);
    }
}
