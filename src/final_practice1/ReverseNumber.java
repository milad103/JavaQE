package final_practice1;

public class ReverseNumber {

    public static void main(String [] args){

        int number = 123456789;

        StringBuffer a = new StringBuffer(String.valueOf(number));

        System.out.println(a.reverse());

    }
}
