package day4;

public class EqualsMethod {

    public static void main(String[] args) {

String arg[] = { "-en"};

        if(args[0].equals("-en")){
            System.out.println("English Option");

        }else if(args[0].equals("-es")){
            System.out.println("Spanish Option");

        } else{
            System.out.println("Unrecognized Option");
        }

    }
}

