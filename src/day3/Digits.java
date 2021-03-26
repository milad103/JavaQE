package day3;

public class Digits {
    public static void main(String[] args){

       int num = 6;
       int t = 1;

       for (t = 0; t < num; t++){
           for(int j = 0; j < num; j++){
            if(j <= t){
                System.out.print(j+1+" ");
            }
           }
           System.out.println();
       }


    }
}
