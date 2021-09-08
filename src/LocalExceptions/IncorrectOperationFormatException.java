package LocalExceptions;

public class IncorrectOperationFormatException extends Exception {
    public IncorrectOperationFormatException(){
        super("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
    }
}
