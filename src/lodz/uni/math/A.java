package lodz.uni.math;

import lodz.uni.math.exceptions.BaseException;
import lodz.uni.math.exceptions.MyException;

public class A {

    public A()  {

    }

//    public A() throws MyException {
//        throw new MyException("Wyjątek klasy bazowej");
//    }

    public void exceptionTest() throws BaseException{
        throw new BaseException();
    }
}
