package day5;

public class ContinueLoopArray {
    public static void main(String[] args){



        String months[] = {"Jan", "Feb", "Mar", "April", "May"};

        for(int i=0; i<months.length; i++){
            if (months[i] == "Feb") {

                continue;
            }
            System.out.println(months[i]);
        }

    }
}
