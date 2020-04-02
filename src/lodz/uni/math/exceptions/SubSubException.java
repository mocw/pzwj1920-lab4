package lodz.uni.math.exceptions;

public class SubSubException extends SubExeption {

    public SubSubException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Sub-sub exception occured!";
    }
}
