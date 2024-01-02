class Account {
    //private,public,default data members
    private long acc_no;
    public String name,email;
    float amount;
    //public getter and setter methods
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        System.out.println("Encapsulation");
        System.out.println("*************");
        Account acc = new Account();
        acc.setAcc_no(140901000024531L);
        acc.setName("Siva");
        acc.setEmail("Siva@sirpi.com");
        acc.setAmount(800000f);
        System.out.println("Bank Acc No: "+acc.getAcc_no());
        System.out.println("Bank Acc Holder Name: " + acc.getName());
        System.out.println("Bank Acc Holder EMAIL: " + acc.getEmail());
        System.out.println("Bank Acc Balance: " + acc.getAmount());
    }
}
