package lodz.uni.math;

import lodz.uni.math.exceptions.myException;

public class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        Object object = null;
        Zad5 zad5 = new Zad5();

	    try{ //zad1
           throw new Exception("Wyjątek");
        } catch(Exception ex){
	        System.out.println(ex.getMessage());
        }
	    finally {
            System.out.println("Sekcja została wykonana!");
        }

	    try{    //zad2
	        throw new myException("Mój wyjątek");
        }
	    catch(myException ex){
            System.out.println(ex.getMessage());
        }

	    try{ //zad3
            myClass.exceptionTest();
        } catch(myException ex) {
            System.out.println(ex.getMessage());
        }

        try{ //zad4
            object.notify();
        } catch(Exception ex) {
            System.out.println(ex); //java.lang.NullPointerException
        }

        zad5.f();
    }
}
