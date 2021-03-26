package day7;

public class ChildClass extends FatherClass{

    void localChildMethod(){

        fatherStaticMethod();

    }



    void example1() {
        System.out.println("sample example but from child class");
    }


            void combiningMethod() {
            fatherClassMethod1();

            fatherStaticMethod();

            fatherNonStaticClass();
            super.example1();
            this.example1();

            }


            public static void main (String[]args){
        ChildClass tre = new ChildClass();
        tre.combiningMethod();


        }




    }