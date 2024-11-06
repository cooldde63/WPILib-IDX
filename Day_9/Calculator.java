public class Calculator {
    int previous;
    int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    int minus(int num1, int num2) {
        int difference = num1 - num2;
        return difference;
    }
    int multiply(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }
    int divide(int num1, int num2) {
        int quotient = num1 / num2;
        return quotient;
    }
    int power(int num1, int num2) {
        int pow = num1;
        for (int i = 1; i < num2; i++){
            pow *= num1;
        }
            return pow;
            previous = pow;
            return pow;
        }
    }