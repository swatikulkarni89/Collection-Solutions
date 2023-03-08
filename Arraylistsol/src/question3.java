import java.util.HashSet;
import java.util.Set;

public class question3 {
    public static void main(String[] args) {
            isNullSubset();
            if (isNullSubset()==true){
        System.out.println("is having subset whose sum is 0");}
            else
                System.out.println("is not having subset whose sum is 0");
        }
    static boolean isNullSubset() {
        int[] input = {1, 2, 2, -4, 5, 7};

        int sum = 0;
        int i = 0;
        Set<Integer> hs = new HashSet<Integer>();
        for (i = 0; i < input.length; i++) {
            sum += input[i];
            if (input[i] == 0 || sum == 0 || hs.contains(sum))
                return true;
                hs.add(sum);


        }
                return false;
    }

}
