package new_day6;

public class ContinueArrayLoopString {

    public static void main(String[] args) {

        String jours[]={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


                for(int p=0; p< jours.length; p++){
                    if(jours[p]=="Sunday"){
                        continue;
                    }
                    System.out.println(jours[p]);
                }
        System.out.println("*******************************************");
        System.out.println(jours.length);
    }
}
