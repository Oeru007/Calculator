package LocalExceptions;

public class InvalidOperandException extends Exception {
    public InvalidOperandException(){
        super("Некорректный операнд - поддерживаются только целые числа от 1 до 10");
    }
}

