import java.util.HashMap;
import java.util.Map;

public class RomeToArab {
    private static final Map<String, Integer> RtoA= new HashMap <>(
            Map.of("I", 1,"II", 2, "III", 3,
                    "IV", 4, "V", 5, "VI", 6,
                    "VII", 7, "VIII", 8, "IX", 9, "X", 10));
    int arabNum;
    public static int toArab(String romeNum){
        //romeNum.toUpperCase();
        return RtoA.get(romeNum.toUpperCase());
    }
}
