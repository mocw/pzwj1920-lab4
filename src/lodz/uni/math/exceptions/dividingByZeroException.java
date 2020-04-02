package lodz.uni.math.exceptions;

public class dividingByZeroException extends ArithmeticException {

    public dividingByZeroException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Dzielenie przez zero!";
    }
}
