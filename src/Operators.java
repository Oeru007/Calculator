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
}
