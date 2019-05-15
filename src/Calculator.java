public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculate(int firstOperand, int sencondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + sencondOperand;
            case SUBTRACTION:
                return firstOperand - sencondOperand;
            case MULTIPLICATION:
                return firstOperand * sencondOperand;
            case DIVISION:
                if (sencondOperand != 0)
                    return firstOperand / sencondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}