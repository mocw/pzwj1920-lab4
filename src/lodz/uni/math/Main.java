package lodz.uni.math;

import lodz.uni.math.exceptions.MyException;
import lodz.uni.math.exceptions.OddNumberException;
import lodz.uni.math.exceptions.TooBigNumberException;
import lodz.uni.math.exceptions.TooSmallNumberException;

public class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        Object object = null;
        Zad5 zad5 = new Zad5();
        Zad6 zad6 = new Zad6();

	    try{ //zad1
           throw new Exception("Wyjątek");
        } catch(Exception ex){
	        System.out.println(ex.getMessage());
        }
	    finally {
            System.out.println("Sekcja została wykonana!");
        }

	    try{    //zad2
	        throw new MyException("Mój wyjątek");
        }
	    catch(MyException ex){
            System.out.println(ex.getMessage());
        }

	    try{ //zad3
            myClass.exceptionTest();
        } catch(MyException ex) {
            System.out.println(ex.getMessage());
        }

        try{ //zad4
            object.notify();
        } catch(Exception ex) {
            System.out.println(ex); //java.lang.NullPointerException
        }

        zad5.f(); //zad5 i 6

        try{
            zad6.exceptionsTest(173);
        }
        catch(TooBigNumberException | TooSmallNumberException | OddNumberException ex){
            System.out.println(ex.getMessage());
        }
    }
}
