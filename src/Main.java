import java.util.Scanner;

public class Main {
    public static int priority(char a){
        if(a == '+' || a == '-' || a == '*' || a == '/')
            return 1;
        else return 0;
    }
    public static void main(String[] args) {
        String task = new Scanner(System.in).nextLine();
        String[] splitTask = task.split("[+-/*]");
        int result = 0;
        if (task.contains("+"))
            result = Operators.SUM.action(Integer.parseInt(splitTask[0]), Integer.parseInt(splitTask[1]));
        System.out.println(result);
//        Operators op = Operators.SUM;
//        System.out.println(Operators.SUM.action(2, 3));
//        switch (op){
//            case SUM:
//                System.out.println("++");
//                break;
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.nextLine());
    }
}
