package LocalExceptions;

public class IncorrectRomanNumbersException extends Exception {
    public IncorrectRomanNumbersException(){
        super("Некорректные римские числа");
    }
}

