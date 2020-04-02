package lodz.uni.math.exceptions;

public class BaseException extends Exception {

    public BaseException() {
        super();
    }

    @Override
    public String getMessage() {
        return "basic exception occured!";
    }
}
