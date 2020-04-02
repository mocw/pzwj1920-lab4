package lodz.uni.math.exceptions;

public class myException extends Exception {

    public String messege;

    public myException(String message) {
        super(message);
        this.messege = message;
    }

    @Override
    public String getMessage() {
        return "myException exception: " +  super.getMessage();
    }
}
