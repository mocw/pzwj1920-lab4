package lodz.uni.math.exceptions;

public class aNegativeNumberException extends ArithmeticException {

    public aNegativeNumberException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Liczba ujemna!";
    }
}
