package new_day2;

public class IfElseIfCreditScore {

    public static void main(String[] args) {

         int creditScore =5555;

         if(creditScore >= 300 && creditScore <= 500){
             System.out.println("Poor credit score");

         }else if (creditScore >= 501 && creditScore <= 749){
             System.out.println("good credit score");

        }else if(creditScore >= 750 && creditScore <= 850){
            System.out.println("excellent credit score");

        }else{
            System.out.println("Enter a valid score number");
            }
        }



    }

