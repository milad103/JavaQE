package mentoring4;

public class ParameterPractice1 {

    public static void main(String[] args) {

        ParameterPractice1 ref = new ParameterPractice1();
        ref.student("James", 24);
        ref.student("Luis", 58);
    }


    void student(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

}
