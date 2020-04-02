package lodz.uni.math;

import lodz.uni.math.exceptions.aNegativeNumberException;
import lodz.uni.math.exceptions.dividingByZeroException;

public class Zad5 {


    public void f(){
        try{
            this.g(2,0);
            this.g(-2,5);
        } catch(dividingByZeroException ex){
            System.out.println(ex.getMessage());
        } catch(aNegativeNumberException ex){
            System.out.println(ex.getMessage());
        }

        try{
            this.g(-2,5);
        } catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }

    public void g(int a, int b) throws dividingByZeroException, aNegativeNumberException {
        if(b == 0) throw new dividingByZeroException();
        if(a < 0 || b < 0) throw new aNegativeNumberException();
    }

}
