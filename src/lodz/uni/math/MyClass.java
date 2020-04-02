package lodz.uni.math;

import lodz.uni.math.exceptions.MyException;

public class MyClass {

    public void exceptionTest() throws MyException {
        throw new MyException("Wjątek rzucony przez metodę!");
    }

}
