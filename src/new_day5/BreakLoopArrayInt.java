package new_day5;

public class BreakLoopArrayInt {
    public static void main(String[] args) {

        int age[] = {18, 22, 25, 26, 36, 39 ,48, 78, 99,};
        for(int a=0; a<age.length; a++){
            if (age[a]== 48){
                break;
            }
            System.out.println(age[a]);
        }



    }
}
