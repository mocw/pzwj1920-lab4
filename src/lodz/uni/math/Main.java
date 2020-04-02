package lodz.uni.math;

import lodz.uni.math.exceptions.*;

public class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        Object object = null;
        Zad5 zad5 = new Zad5();
        Zad6 zad6 = new Zad6();
        int[] tab = new int[100];

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

//        zad6 = null;
        try{ //zad7
            zad6.exceptionsTest(173);
        }
        catch(TooBigNumberException | TooSmallNumberException | OddNumberException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Sekcja po nullpointerexception");
        }

        try{ //zad8
            System.out.println(tab[101]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

        int l = 90;

        while(true){ //zad9
            Exception exc = null;
            try{
                zad6.exceptionsTest(++l);
            } catch (TooBigNumberException | TooSmallNumberException | OddNumberException ex){
                exc = ex;
                System.out.println(ex.getMessage());
            }
            if(exc == null){
                break;
            }
        }

        A c = new C();
        try { //zad10
            c.exceptionTest();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
