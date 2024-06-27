package final_practice1;

public class ReverseStringBuilder {
    public static void main(String[] args) {


        int num = 123456789;

    StringBuilder a = new StringBuilder(String.valueOf(num));

    //a.append(word);

        System.out.println(a.reverse());
}
}