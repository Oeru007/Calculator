package LocalExceptions;

public class MultipleNumberSystemsException extends Exception {
    public MultipleNumberSystemsException(){
        super("Используются одновременно разные системы счисления");
    }
}

