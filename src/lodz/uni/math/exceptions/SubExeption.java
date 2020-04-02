package lodz.uni.math.exceptions;

public class SubExeption extends BaseException {

    public SubExeption(){
        super();
    }

    @Override
    public String getMessage() {
        return "sub exception occured!";
    }
}
