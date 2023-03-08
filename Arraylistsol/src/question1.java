import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        //1.How to rotate an array left and right by a given number K?
        int[] rotate = {1, 2, 3, 4, 5, 6};
            int temp=0;
        temp=rotate[0];
        for (int i = 0; i<rotate.length-1;i++) {
           // for (int j = i; j < rotate.length - 1; j++) {

                rotate[i] = rotate[i+1];
            rotate[rotate.length-1]=temp;

            //}
        }
        System.out.println(Arrays.toString(rotate));


    }
}