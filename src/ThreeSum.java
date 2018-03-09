import sun.jvm.hotspot.utilities.Assert;

import java.util.*;
/**
 * Created by smukherjee5 on 3/5/18.
 */
public class ThreeSum {

    public static void main(String[] args){

        //int[] arr = new int[]{1,2,-2,-1};
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        //int[] arr = new int[]{-1,-1,2,5,-4};
        //int[] arr = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        //int[] arr = new int[]{-2,-2,0,2,2,4};
        //int[] arr = new int[]{0,0,0,0,0};
        int i=0;
        for (List<Integer> integers : threeSum(arr)) {
            System.out.println("***** Iteration :"+i+" *******");

            for (int triplets: integers){
                System.out.println( triplets);
            }
            i++;
        }

    }


    public static List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> returnList = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

//        int zeroCntr = 0;
//
//        int index = 0;
//        for(int i:nums){
//
//            if (i==0){
//                zeroCntr++;
//            }
//            keys.put(i,index);
//            index++;
//        }

     Set<List<Integer>> set = new HashSet<List<Integer>>();

        for(int i=0;i< nums.length-2;i++){
            int start = i+1;
            int end = nums.length -1;

            while (start < end){
                if((nums[i] + nums[start] + nums[end]) == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    set.add(list);
                    start++;
                    end--;


                }
                   else if((nums[i] + nums[start] + nums[end]) < 0){
                    start++;

                } else if((nums[i]+nums[start] + nums[end])>0){

                    end--;
                }


            }


          }

          returnList.addAll(set);
        return returnList;
      }




//     for(int i =0; i< nums.length-2 && nums[i]<=0;i++){
//            for (int j=i+1;j<nums.length-1;j++){
//                if(nums[i]==nums[i-1]){
//                    continue;
//                }
//                int target = -(nums[j]+ nums[i]);
//
//
//                if(keys.containsKey(target) && keys.get(target)!=i && keys.get(target)!=j){
//
//                    List<Integer> newSet = new ArrayList<Integer>();
//
//                    newSet.add(nums[i]);
//                    newSet.add(nums[j]);
//                    newSet.add(target);
//                    Collections.sort(newSet);
//                    if (!returnList.contains(newSet))
//                        {
//                            returnList.add(newSet);
//                        }
//
//                }
//
//            }
//     }






}
//[[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]