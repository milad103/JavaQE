package final_practice1;

public class CountDigits {

    public static void main(String[] args) {

        long num = 1234567897888857458l;
        int count = 0;

        while(num>0){

            num=num/10;
            count ++;
        }
        System.out.println("Number of digits: " +count);
    }
}
