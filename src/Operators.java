import LocalExceptions.InvalidOperandException;

public enum Operators {
    SUM{
        public int action(int a, int b) {return (a+b);}
    },
    MULTI{
        public int action(int a, int b) {return (a*b);}
    },
    DIV{
        public int action(int a, int b) {return (int) Math.round((double)a/(double)b);} //Для корректного округления 0,5=1 и 0,4=0
    },
    SUBST{
        public int action(int a, int b) {return (a-b);}
    };
    public abstract int action(int a, int b);

    public static int taskManager(String[] splitTask, String task) throws InvalidOperandException{
        int operandOne = Integer.parseInt(splitTask[0]);
        int operandTwo = Integer.parseInt(splitTask[1]);
        if (operandOne == 0 || operandOne >10 || operandTwo==0 || operandTwo > 10)
            throw new InvalidOperandException();
        if (task.contains("+"))
            return SUM.action(operandOne, operandTwo);
        else if (task.contains("-"))
            return SUBST.action(operandOne, operandTwo);
        else if (task.contains("*"))
            return MULTI.action(operandOne, operandTwo);
        else
            return DIV.action(operandOne, operandTwo);
    }
}
