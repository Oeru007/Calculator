package LocalExceptions;

public class RomanNumberException extends Exception {
    public RomanNumberException(){
        super("В римской системе счисления отсутствуют отрицательные числа и ноль");
    }
}
