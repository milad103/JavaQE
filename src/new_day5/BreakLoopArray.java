package new_day5;


public class BreakLoopArray {
    public static void main(String[] args) {

        String jour[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for(int w=0; w<=jour.length; w++){
            if(jour[w]=="Thursday"){
                break;
            }
            System.out.println(jour[w]);


        }
        System.out.println("===================================");
        System.out.println(jour.length);

    }
}