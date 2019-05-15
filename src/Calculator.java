public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculate(int firstOperand, int sencondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + sencondOperand;
            case '-':
                return firstOperand - sencondOperand;
            case '*':
                return firstOperand * sencondOperand;
            case '/':
                if (sencondOperand != 0)
                    return firstOperand / sencondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}