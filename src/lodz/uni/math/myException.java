package lodz.uni.math;

public class myException extends Exception {

    public String messege;

    public myException(String message) {
        super(message);
        this.messege = message;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
