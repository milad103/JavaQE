package mentoring3;


public class ChildClass extends FatherClass {





    void example1() {

        System.out.println("IM A METHOD BUT WITHIN THE Child class");

       }


       void combiningMethod(){

        super.example1();
        this.example1();
        super.fatherClassMethod();
        fatherStaticMethod();
        fatherClassMethod();


       }


    public static void main(String[] args) {

        ChildClass ref = new ChildClass();
        ref.combiningMethod();
    }
}



