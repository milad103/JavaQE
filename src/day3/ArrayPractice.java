package day3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int a = 5;
        int id[] = {10000, 95, 1, 69, 500, 5};
        Arrays.sort(id);
        //Arrays.sort(id, 0, 3);
        System.out.println(Arrays.toString(id));


        String name = "James";
        //String names[] = {"King", "James", "Bob", "Sam"};


        String students[] = new String[4];
        students[0] = "King";
        students[1] = "James";
        students[2] = "Bob";
        students[3] = "Sam";
        // for loop
        for (int i = 0; i < students.length; i++) {
            Arrays.sort(students);
           //System.out.println(students[i]);
            //forEach Loop
            //for (String e : students) {
            // System.out.println(e);
            System.out.println(Arrays.toString(students));
        }

    }
}

