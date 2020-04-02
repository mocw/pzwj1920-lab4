package lodz.uni.math.exceptions;

public class TooBigNumberException extends ArithmeticException {

    public TooBigNumberException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Liczba jest zbyt duża!";
    }
}
