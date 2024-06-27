package mentoring4;

public class ParameterPractice2 {

    public static void main(String[] args) {
        // method 2 of declaring arguments
        String name="ALLAH";
        zikr(name,100);
        System.out.println("==========================");
        //method 1 of declaring arguments
        zikr("Alhamdulillah", 33);
        zikr("AllahoAkrbar", 33);
        zikr("SubhanAllah", 33);
        zikr("la ilaha illa ALLAH", 1);
    }


    static void zikr(String name, int number){

        for(int counter=1; counter<=number; counter++ ) {
            System.out.println(name);
        }
    }
}
