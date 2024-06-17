public class Problem_5 {
    public static void main(String[] args) {
        int [][] nums = {
                {2,34,4,3},{53,2435,54,2},{647,9,0,2}
        };
//        for(int a[] :nums){
//            for(int b: a){
//                System.out.print(b+ " ");
//            }
//            System.out.println();
//        }

        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0; j < nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
