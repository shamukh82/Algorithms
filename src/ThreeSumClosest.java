import java.util.Arrays;

/**
 * Created by smukherjee5 on 3/7/18.
 */
public class ThreeSumClosest {

    public static void main(String[] args){

        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4},1));

        //10
        //1,5,2,3,8,-1,0,
        //-1,0,1,2,4,5,8

    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        int result =0;


        for(int i=0;i<nums.length -2;i++){
        int start=i+1;
        int end = nums.length-1;

        while(start < end){

            int sum = nums[i]+nums[start]+ nums[end];
            int diff = Math.abs(target - sum);

            if(diff ==0 ){
                return target;
            }

            if(diff < min){
                min=diff;
                result = sum;
            }

            if (sum <= target){
                start++;
            } else{
                end --;
            }


        }
      }
        return result;
    }

}
