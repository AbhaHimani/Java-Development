// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//

// Create getters and setters for each field


// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class Bank {
    public int an;
    public int bal;
    public String cn;
    public String email;
    public int phone_number;
    public void setAn(int an){
        this.an=an;
    }
    public void setBal(int bal){
        this.bal=bal;
    }
    public void setCn(String cn){
        this.cn=cn;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhone_number(int phone_number){
        this.phone_number=phone_number;
    }
    public int getBal(){
        return this.bal;
    }
    public int getPhone_number(){
        return this.phone_number;
    }
    public String getCn(){
        return this.cn;
    }
    public String getEmail(){
        return this.email;
    }

    public int getAn() {
        return this.an;
    }
    public void deposit_funds(int fund){
        int bal= getBal();
        bal= bal+fund;
        setBal(bal);
        System.out.println(bal);
    }
    public void withdraw_funds(int fund){
        int bal= getBal();
        if(bal<fund){
            System.out.println("Transaction not allowed, insufficient balance");
        }
        else{
            bal=bal-fund;
            setBal(bal);
            System.out.println("Transaction successful");
        }

    }


}
