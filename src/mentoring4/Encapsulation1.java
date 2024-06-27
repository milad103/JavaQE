package mentoring4;

public class Encapsulation1 {


    // step 3: call method in and try to print out
    public static void main(String[] args) {

        Encapsulation1 encap = new Encapsulation1();
        encap.setCreditCardNumber(4521965812358596l);
        encap.setBankCustomer("JamesCrawford");
        encap.setBankCustomer("MangoJames");


    }
    public long getCreditCardNumber() {

        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
        System.out.println(creditCardNumber);
    }




// step1: create 2 private integers
    // step2:  right click and hit generate to choose getter and setter
    private long creditCardNumber;

    public String getBankCustomer() {
        return bankCustomer;
    }

    public void setBankCustomer(String bankCustomer) {
        this.bankCustomer = bankCustomer;
        System.out.println(bankCustomer);
    }

    private String bankCustomer;

}
