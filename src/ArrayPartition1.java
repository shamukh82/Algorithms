import java.util.Arrays;


/**
 * Created by smukherjee5 on 12/20/17.
 */
public class ArrayPartition1 {
    static  int arrayPairSum(int[] nums) {
        if(nums.length == 2){
            return Math.min(nums[0],nums[1]);
        }

        Arrays.sort(nums);

        int sum=0;
        int i = 0;
        while(i<nums.length-1){
            sum+=nums[i];
            i+=2;
        }

        return sum;

    }

    public static void main(String[] args){


        System.out.println(arrayPairSum(new int[]{1,4,3,2}) );
    }
}

