package exceptions;

public class NumberException extends NumberFormatException {
    //Costruttore
    public NumberException(String str) {
        super(str + "non è un numero ");
    }
}
