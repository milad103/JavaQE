package mentoring2;

public class ForLoopArray {
    public static void main(String[] args) {

        String months[]= {"Jan","Feb","Mar","Apr", "May", "jun", "july", "Aug", "Jan","Feb",
                "Mar","Apr", "May", "jun", "july", "Aug"};
        for (int i=0; i<months.length; i++){
            if(months[i]=="jun"){
                continue;
            }
            System.out.println(months[i]);
        }

    }
}
