package lodz.uni.math;

public class Main {

    public static void main(String[] args) {
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
    }
}
