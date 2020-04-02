package lodz.uni.math.exceptions;

public class DividingByZeroException extends ArithmeticException {

    public DividingByZeroException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Dzielenie przez zero!";
    }
}
