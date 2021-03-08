import calculator.Calculations;

public class Main {
    public static void main(String[] args) {

        Calculations calculations = new Calculations();

        int num1 = 25;
        int num2 = 10;

        int resultAdd = calculations.add(num1, num2);
        int resultSub = calculations.sub(num1, num2);
        int resultMul = calculations.mul(num1, num2);
        int resultDiv = calculations.div(num1, num2);
        int resultMax = calculations.max(num1, num2);


        System.out.println(num1 + " + " + num2 + " = " + resultAdd);
        System.out.println(num1 + " - " + num2 + " = " + resultSub);
        System.out.println(num1 + " * " + num2 + " = " + resultMul);
        System.out.println(num1 + " / " + num2 + " = " + resultDiv);
        System.out.println("Maximal number between " + num1 + " and " + num2 +" is " + resultMax);
    }
}
