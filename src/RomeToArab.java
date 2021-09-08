import LocalExceptions.*;

import java.util.*;

public class RomeToArab {
    private static final Map<String, String> RtoA= new HashMap <>(
            Map.of("I", "1","II", "2", "III", "3",
                    "IV", "4", "V", "5", "VI", "6",
                    "VII", "7", "VIII", "8", "IX", "9", "X", "10"));
    private static final Map<Integer, String> AtoR = new HashMap<>(
            Map.of( 100,"C",  90,"XC",  50,"L",
                     40,"XL",  10,"X",  9,"IX",
                     5,"V",  4,"IV",  1,"I"));

    public static String[] toArab(String romeTask) throws IncorrectRomanNumbersException {
        String[] splitTask = romeTask.split("[+-/*]");
        if (RtoA.containsKey(splitTask[0].toUpperCase()) && RtoA.containsKey(splitTask[1].toUpperCase())) {
            for (int i = 0; i < splitTask.length; i++) {
                splitTask[i] = RtoA.get(splitTask[i].toUpperCase());
            }
        } else
            throw new IncorrectRomanNumbersException();
        return splitTask;
    }

    public static String toRome(int num)throws RomanNumberException {
        int i = 0;
        if (num<=0)
            throw new RomanNumberException();
        String solution = "";
        List<Integer> arabicNum = new ArrayList<>(AtoR.keySet());
        Collections.sort(arabicNum, Collections.reverseOrder());
        while (num > 0 && i < AtoR.size()){
            if (arabicNum.get(i) <= num){
                solution += AtoR.get(arabicNum.get(i));
                num -= arabicNum.get(i);
            } else
                i++;
        }
        return solution;
    }
}
