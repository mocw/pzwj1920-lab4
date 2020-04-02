package lodz.uni.math;

import lodz.uni.math.exceptions.*;

public class Zad6 {

    public Zad6() {
    }

    public void exceptionsTest(int a) throws TooBigNumberException, TooBigNumberException, OddNumberException{
        //parzyste liczby miedzy 100 a 500
        if(a > 500) throw new TooBigNumberException();
        if(a < 100) throw new TooSmallNumberException();
        if(!(a%2 == 0)) throw new OddNumberException();
    }

}
