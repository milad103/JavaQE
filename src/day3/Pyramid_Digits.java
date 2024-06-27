package day3;

public class Pyramid_Digits {
    public static void main(String[] args) {

        int row = 6;
        for (int x = 1; x <= row; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    }

