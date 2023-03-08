import java.util.Arrays;

public class question4 {
    public static void main(String[] args) {
        int []input={1,2,4,3,6,7,8,9,11};
        /*int sum1=Arrays.stream(input).sum();// to find sum of array
        System.out.println(sum1);*/
        int []input1= Arrays.stream(input).sorted().toArray();
        System.out.println("sorted array"+Arrays.toString(input1));
        for(int i=1;i<input1.length;i++){
         int j= (input1[i-1]+input1[i])%2;
         if (j==0){
            int missingNum= (input1[i-1]+input1[i])/2;
             System.out.println("missing number is "+ missingNum);
         }

        }
    }
}
