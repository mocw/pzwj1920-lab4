package lodz.uni.math;

import lodz.uni.math.exceptions.BaseException;
import lodz.uni.math.exceptions.MyException;
import lodz.uni.math.exceptions.SubExeption;

public class B extends A {

    public B() {
        super();
    }

    @Override
    public void exceptionTest() throws SubExeption {
        throw new SubExeption();
    }
}
