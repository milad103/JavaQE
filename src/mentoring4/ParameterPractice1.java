package mentoring4;

public class ParameterPractice1 {

    public static void main(String[] args) {

        ParameterPractice1 ref = new ParameterPractice1();
        ref.student("James", 24, 'm');
        ref.student("Luis", 58, 'm');
        ref.student("Jessica", 21, 'f');
        country("USA");
    }


    void student(String name, int age, char gender) {

        System.out.println(name + " is " + age + " years old " + "& Gender is "+ gender);
    }

    static void country(String nationality) {
        System.out.println(" is " + nationality );
    }

}
