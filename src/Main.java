import LocalExceptions.IncorrectMathOperationFormat;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        String task = new Scanner(System.in).nextLine();
        String result = "";

        if (task.matches("[0-9]{1,2}[+-/*][0-9]{1,2}")) {
            result = Integer.toString(Operators.taskManager(task));
        } else if (task.matches("[IVXivx]{1,4}[+-/*][IVXivx]{1,4}")) {
            result = RomeToArab.toRome(Operators.taskManager(RomeToArab.toArab(task), task));
        }
        System.out.println(result);
    }
}
