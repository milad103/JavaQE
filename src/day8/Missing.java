package day8;

public class Missing {
    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5,7,8,9,10};

        for (int i = 1; i<=numbers.length; i++) {
            if (i != numbers[i - 1]) {
                System.out.println(numbers[i]);
                break;
            }

        }
}
}
