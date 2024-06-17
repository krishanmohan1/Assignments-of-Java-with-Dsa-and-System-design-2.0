public class Prolem_4 {
    public static void main(String[] args) {

        int nums[]={4,5,67,3,2,6,};
        int index = -1;
        int target = 2;
        for(int i =0;i < nums.length;i++){
            if(nums[i]==target){
                index = i;

            }
        }
        System.out.println(index);
    }
}
