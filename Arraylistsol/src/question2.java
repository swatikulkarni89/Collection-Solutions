public class question2 {
    public static void main(String[] args) {
        int[]input={1,2,3,3,2,1,5,5,6,6,7,7,9};
        int i=0;
        int count=0;
        System.out.println(input[0]);
        for(i=0;i<input.length;i++){
            count=0;

            for(int j=0;j<input.length;j++) {
                if(i!=j) {
                    if(input[i] == input[j]) {
                        count++;
                        break;

                    }
                }

            }

                if (count==0){
                    System.out.println(input[i]);
                    break;
                }




        }
    }
}
