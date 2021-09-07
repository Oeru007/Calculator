public enum Operators {
    SUM{
        public int action(int a, int b) {return (a+b);}
    },
    MULTI{
        public int action(int a, int b) {return (a*b);}
    },
    DIV{
        public int action(int a, int b) {return (a/b);}
    },
    SUBST{
        public int action(int a, int b) {return (a-b);}
    };
    public abstract int action(int a, int b);

    public static int taskManager(String task){
        String[] splitTask = task.split("[+-/*]");
        if (task.contains("+"))
            return SUM.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
        else if (task.contains("-"))
            return SUBST.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
        else if (task.contains("*"))
            return MULTI.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
        else
            return DIV.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
    }
    public static int taskManager(String[] splitTask, String task){
        if (task.contains("+"))
            return SUM.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
        else if (task.contains("-"))
            return SUBST.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
        else if (task.contains("*"))
            return MULTI.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
        else
            return DIV.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
    }
}
