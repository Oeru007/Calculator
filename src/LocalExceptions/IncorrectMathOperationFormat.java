package LocalExceptions;

public class IncorrectMathOperationFormat extends Exception {
    public IncorrectMathOperationFormat(){
        super("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
    }
}
