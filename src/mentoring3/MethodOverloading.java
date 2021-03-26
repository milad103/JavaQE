package mentoring3;

public class MethodOverloading {
    public int addition(int a, int b) {
        return a + b;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    public double addition(double a, double b) {
        return a + b;
    }


    String addition(String MyFirstName, String MyLastName){
        return MyFirstName+MyFirstName;


    }


    boolean addition(boolean a, boolean b){
        return a && b;

    }

    void addition (String a, int b){
        String x= a+b;
        System.out.println(x);
    }

    public static void main(String[] args) {
        MethodOverloading y = new MethodOverloading();
        System.out.println(y.addition(7, 3));
        System.out.println(y.addition(5.5, 9.9));
        System.out.println(y.addition( true, true));
        System.out.println(y.addition( "Milad", "alami"));
        y.addition("Milad", 42);
    }
}
