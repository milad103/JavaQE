package mentoring2;

public class ForEachLoopWithCharArray {
    public static void main(String[] args) {
// Char Array will Transform a whole paragraph into a list of letters"chars" i.e. char 'x' 'h'
// rule number 1 declare a string
        String t = "Anyone have any idea how fast the Milford Walmart no waste list moves";



        // create a char of array
        char n []= t.toCharArray();


// declare a new char with new final value
        for(char w:n){
            System.out.println(w);
        }

    }
}
