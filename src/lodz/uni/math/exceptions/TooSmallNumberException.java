package lodz.uni.math.exceptions;

public class TooSmallNumberException extends ArithmeticException {

    public TooSmallNumberException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Liczba jest zbyt mała" ;
    }
}
