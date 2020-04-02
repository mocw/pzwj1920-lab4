package lodz.uni.math;

import lodz.uni.math.exceptions.SubExeption;
import lodz.uni.math.exceptions.SubSubException;

public class C extends B {

    public C() {
        super();
    }

    @Override
    public void exceptionTest() throws SubSubException {
        throw new SubSubException();
    }
}
