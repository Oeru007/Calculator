import LocalExceptions.*;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws Exception {
        String task = new Scanner(System.in).nextLine();
        String[] splitTask = task.split("[-+/*]");
        String result = "";

        if (task.matches("[0-9]{1,2}[-+/*][0-9]{1,2}")) {
            result = Integer.toString(Operators.taskManager(splitTask, task));
        } else if (task.matches("[IVXivx]{1,4}[-+/*][IVXivx]{1,4}")) {
            result = RomeToArab.toRome(Operators.taskManager(RomeToArab.toArab(task), task));
        } else if (task.matches("[0-9]{1,2}[-+/*][IVXivx]{1,4}")
                || task.matches("[IVXivx]{1,4}[-+/*][0-9]{1,2}")) {
            throw new MultipleNumberSystemsException();
        } else if (splitTask.length < 2){
            throw new NotMathematicalOperationException();
        } else if (splitTask.length >= 3){
            throw new IncorrectOperationFormatException();
        } else if ((!splitTask[0].matches("\\d") && !splitTask[1].matches("\\d"))
                || (!splitTask[0].matches("[IVXivx]") && !splitTask[1].matches("[IVXivx]")))
            throw new InvalidOperandException();
        System.out.print(result);
    }
}
