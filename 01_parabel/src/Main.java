import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("Welcome to Project Parable");
        System.out.println("=====================================");
        System.out.println("The formula is:");
        System.out.println("ax²+bx+c");

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter variable \"a\":");

        int varA = scanner.nextInt();

        System.out.println("Please enter variable \"b\":");

        int varB = scanner.nextInt();

        System.out.println("Please enter variable \"c\":");

        int varC = scanner.nextInt();

        int cutPointCount = Main.calcCutPointCount(varA, varB, varC);

        if (cutPointCount < 0){
            System.out.println("There is no cutpoint!");
        }else if (cutPointCount == 0){
            System.out.println("There is one cutpoint!");
        } else {
            System.out.println("There are two cutpoints!");
        }

        // Main.calcCut.... can be changed into calcCut.....
        double cutPointValue1 = calcCutPointValue(varA, varB, varC, 1);

        double cutPointValue2 = calcCutPointValue(varA, varB, varC, 2);

        System.out.println("Your solution is: " + cutPointValue1 + " and " + cutPointValue2);



    }
    // checks, if there are 0, 1 or 2 Cutpoints
    private static int calcCutPointCount(int a, int b, int c){

        int value = (b * b) - (4 * a * c); // Check with Wolfram Alpha if mathematically correct

        return value;

    }
    // calculates the cutpoints, where the parable cuts with the x axis
    // operatorDecider: 1 = "+", else = "-"
    private static double calcCutPointValue(int a, int b, int c, int operatorDecider){

        // TODO: 30.10.2020 test this shit... 
        if (operatorDecider == 1) {

            int partResult1 = (b * b) - (4 * a * c);

            double partResult2 = Math.sqrt(partResult1);

            double result1 = (-b + partResult2) / (2 * a);

            // double result1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a); // Check if mathematically correct, split if needed

            return result1;

        } else {

            int partResult1 = (b * b) - (4 * a * c);

            double partResult2 = Math.sqrt(partResult1);

            double result2 = (-b - partResult2) / (2 * a);

           // double result2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

            return result2;

        }


    }



}

//LGTM