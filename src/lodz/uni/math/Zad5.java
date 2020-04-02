package lodz.uni.math;

import lodz.uni.math.exceptions.*;

public class Zad5 {

    public Zad5(){}

    public void f(){
        try{
            this.g(2,0);
            this.g(-2,5);
        } catch(DividingByZeroException ex){
            System.out.println(ex.getMessage());
        } catch(ANegativeNumberException ex){
            System.out.println(ex.getMessage());
        }

        try{
            this.g(-2,5);
        } catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }

    public void g(int a, int b) throws DividingByZeroException, ANegativeNumberException {
        if(b == 0) throw new DividingByZeroException();
        if(a < 0 || b < 0) throw new ANegativeNumberException();
    }

}
