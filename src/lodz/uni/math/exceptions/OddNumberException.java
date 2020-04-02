package lodz.uni.math.exceptions;

public class OddNumberException extends  ArithmeticException{

    public OddNumberException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Liczba jest nieparzysta!";
    }
}
