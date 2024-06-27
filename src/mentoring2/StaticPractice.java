package mentoring2;

public class StaticPractice {

    static int a = 15;

    static int b = 10;

    int z = 100;


    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        StaticPractice practice = new StaticPractice();

        System.out.println(a+(practice.z));

        System.out.println(practice.z);

StaticPractice reff = new StaticPractice();
reff.nonStaticMethod1();

    }



    void nonStaticMethod1(){

        System.out.println("im non static method");
    }
}
