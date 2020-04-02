package lodz.uni.math.exceptions;

public class MyException extends Exception {

    public String messege;

    public MyException(String message) {
        super(message);
        this.messege = message;
    }

    @Override
    public String getMessage() {
        return "myException exception: " +  super.getMessage();
    }
}
