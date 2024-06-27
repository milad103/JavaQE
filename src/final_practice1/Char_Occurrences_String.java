package final_practice1;

public class Char_Occurrences_String {

    public static void main(String[] args){

        String word = "element";
        char letter = 'e';
        int count = 0;

        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)==letter){
                count++;
                System.out.println(count);
            }

        }
    }

}
