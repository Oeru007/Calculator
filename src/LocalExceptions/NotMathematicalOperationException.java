package LocalExceptions;

public class NotMathematicalOperationException extends Exception {
    public NotMathematicalOperationException(){
        super("Строка не является математической операцией");
    }
}

