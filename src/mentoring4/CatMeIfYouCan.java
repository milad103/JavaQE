package mentoring4;

public class CatMeIfYouCan {

    public static void main(String[] args) {

        try{
        String[] numbers = {"zero", "one", "two", "three"};
        System.out.println(numbers[4]);
        }catch(Exception e){

            System.out.println("an exception was found");
        }
    }
}




//or you can be more specific and and use:
//System.out.println("an exception was found: " +e);