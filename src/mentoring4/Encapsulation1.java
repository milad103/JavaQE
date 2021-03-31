package mentoring4;

public class Encapsulation1 {


    // step 3: call method in and try to print out
    public static void main(String[] args) {

        Encapsulation1 encap = new Encapsulation1();
        encap.setCreditCardNumber(4521965812358596l);


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

}
