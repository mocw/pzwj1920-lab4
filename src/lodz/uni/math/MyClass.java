package lodz.uni.math;

import lodz.uni.math.exceptions.myException;

public class MyClass {

    public void exceptionTest() throws myException {
        throw new myException("Wjątek rzucony przez metodę!");
    }

}
