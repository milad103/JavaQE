package new_day1;

public class IfElseIf {

    public static void main(String[] args) {
        String Name = "John";
        int age = 24;
        String Occupation = "teacher";

        if (Name =="John" && age == 24){
            System.out.println("His ages is: " +age+ "\n His occupation is:" +Occupation);
        } else if (age == 21){
            System.out.println("He is 21 but not John. His name is " + Name);
        }else{
            System.out.println("Name and age");
        }
    }
}
