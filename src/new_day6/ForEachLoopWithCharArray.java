package new_day6;

public class ForEachLoopWithCharArray {
    public static void main(String[] args) {


        String hello = "hello to my world of java";
        char c[] = hello.toCharArray();

        for (char x:c) {
            System.out.println(x);

        }
    }
}