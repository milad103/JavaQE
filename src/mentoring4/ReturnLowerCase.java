package mentoring4;

public class ReturnLowerCase {

    public static void main(String[] args) {

        String z = lowerCase("HELLO MY NAME IS BORAT!");
        System.out.println(z);
    }

    static String lowerCase(String word){
        return word.toLowerCase();

    }
}
