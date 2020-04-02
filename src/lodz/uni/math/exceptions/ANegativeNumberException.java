package lodz.uni.math.exceptions;

public class ANegativeNumberException extends ArithmeticException {

    public ANegativeNumberException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Liczba ujemna!";
    }
}
