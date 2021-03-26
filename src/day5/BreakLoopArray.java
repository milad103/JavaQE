package day5;

public class BreakLoopArray {

    public static void main(String[] args) {
//jump out of statement
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        for (int i=0; i<=days.length; i++){
            System.out.println(days[i]);
            if (days[i] == "Wednesday"){
                break;
            }

        }
    }
}


