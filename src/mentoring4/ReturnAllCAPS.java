package mentoring4;

public class ReturnAllCAPS {

    public static void main(String[] args) {

        String a = allCaps("why are you yelling at me!!!");
        System.out.println(a);

        String b = allCaps("hello");
        System.out.println(b);

        String c =allCaps("don't interrupt when i'm speaking");
        System.out.println(c);
    }


static String  allCaps(String f) {
    return f.toUpperCase();

}

}










