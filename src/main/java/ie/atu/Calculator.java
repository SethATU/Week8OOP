package ie.atu;

public class Calculator {

    public int add(int firstNum, int secondNum) {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        int result = firstNum + secondNum;
        return result;
    }

    public int sub(int firstNum, int secondNum) {
        if (firstNum <= Integer.MIN_VALUE || secondNum <= Integer.MIN_VALUE)
            throw new ArithmeticException("Number cannot be less than or equal to Integer.MIN_VALUE");
        int result = firstNum - secondNum;
        return result;
    }

    public int mul(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        if (result/secondNum != firstNum)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        return result;
    }
}
