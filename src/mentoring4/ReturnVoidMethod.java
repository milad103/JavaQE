package mentoring4;

public class ReturnVoidMethod {

    public static void main(String[] args) {
        returnExample2();

    }

    static void returnExample2() {
        for (int i = 1; i <10; i++) {
            if (i == 5)
                return;
            System.out.println(i);

        }
    }
}
