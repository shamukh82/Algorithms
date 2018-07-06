import java.util.*;

/**
 * Created by smukherjee5 on 4/13/18.
 */
public class FourSumAddMethodNoWorky {

    public static void main(String[] args){

        int[] arr = new int[]{1,0,-1,0,-2,2};
        //int[] arr = new int[]{-3,-1,0,2,4,5};
        //int[] arr = new int[]{0,0,0,0};
        //int[] arr = new int[]{1, 0, -1, 0, -2, 2};
       //-2,-1,0,0,1,2

        //-3,-2,-2,-1,0,-1,-1,0,1,0
        //int[] arr = new int[]{8,6,2,1,0,-1,-2,-3,-4,-5,-7};


        fourSum(arr,0).forEach(x->{x.forEach(y->System.out.println(y));System.out.println("****");});

        //-2,-1,0,0,1
        //a+b+c+d = target

    }

    private static List<List<Integer>> fourSum(int[] nums,int target){

        List<List<Integer>> returnList = new ArrayList<>();

        if(nums.length < 4){
            return returnList;
        }

        //sort
        //check to see if one zero
        //check to see if more than two zeros
        //get sums of all pairs, populate in map if its less than target
        //get sum of those two sums, add to set

        Arrays.sort(nums);
        Map<Integer,List<List<Integer>>> map = new HashMap<Integer,List<List<Integer>>>();

//        List<List<Integer>> list1= new ArrayList<List<Integer>>();;

        Map<Integer,Integer> countrMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            //populate number of occurences per number in a map
            if(!countrMap.containsKey(nums[i])){
                countrMap.put(nums[i],1);
            } else {
                int countTillNow = countrMap.get(nums[i]);
                countrMap.put(nums[i],countTillNow+1);

            }

            int j=i+1;
            while (j< nums.length){
               List<Integer> list = new ArrayList<Integer>();
               list.add(nums[i]);
               list.add(nums[j]);
               Collections.sort(list);

                if(map.containsKey(nums[i]+nums[j]))

                {
                    //System.out.println("Contains sum:"+(nums[i]+nums[j]));
                    List<List<Integer>> list1 = map.get(nums[i]+nums[j]);

                    //if(!list1.contains(list))
                    //{
                    //System.out.println("Index:"+ i +":" +j);
                    //System.out.println("Adding to Contains sum:"+ nums[i] + nums[j]);
                        list1.add(list);
                    //}
                    map.put((nums[i]+nums[j]),list1);

                }
                else{

                        //System.out.println("Not Contains sum:"+(nums[i]+nums[j]));
                        List<List<Integer>> list1= new ArrayList<List<Integer>>();
                        //System.out.println("Index:"+ i +":" +j);
                        list1.add(list);
                        //System.out.println("Adding to not Contains sum:"+ nums[i] + nums[j]);
                        map.put((nums[i]+nums[j]),list1);

                }

                //System.out.println(nums[i]+":"+nums[j]);
                j++;
            }

        }

        List<Integer> list = new ArrayList<>();

        map.keySet().forEach(
                x-> list.add(x)
        );

        Collections.sort(list);

        for (int i=0;i<list.size();i++){
            int j=i+1;
            while(j<list.size()){
                if ((list.get(i)+list.get(j))==target){



                    //Getting all possible combos
                    //1 2 3 8 9
                    //4 5 6 7


                    List<List<Integer>> list1=null;
                    List<List<Integer>> list2=null;
                    if (map.get(list.get(i)).size() > map.get(list.get(j)).size()){
                        list1 =  map.get(list.get(i));
                        list2 =  map.get(list.get(j));
                    }
                    else{
                        list1 =  map.get(list.get(j));
                        list2 =  map.get(list.get(i));
                    }

                    for(int l=0;l<list1.size();l++){

                        List<Integer> list11 = new ArrayList<>();
                        for(int k=0;k<list2.size();k++){
                            List<Integer> tempList = new ArrayList<>();
                            tempList.addAll(list1.get(l));
                            tempList.addAll(list2.get(k));

                            Map<Integer,Integer> map1 = new HashMap<>();
                            for (int z = 0;z<tempList.size();z++ ) {
                                //System.out.println("tempList:" + tempList.get(z));
                                if (!map1.containsKey(tempList.get(z))) {
                                    map1.put(tempList.get(z), 1);
                                } else {
                                    int cntr = map1.get(tempList.get(z));
                                    int y = tempList.get(z);
                                    map1.put(tempList.get(z), cntr + 1);
                                }}

                            for(int p =0; p< tempList.size();p++){

                                    if (map1.get(tempList.get(p)) != countrMap.get(tempList.get(p))) {
                                        break;
                                    }

                                Collections.sort(tempList);
                                    if (!returnList.contains(tempList)) {
                                    returnList.add(tempList);
                                }
                                }



                          //  returnList.add(tempList);

                        }

                    }

                }
                j++;
            }


        }

        //0->{-2,2},{0,0}
        //0->2,3



       if(map.size()==1 && map.containsKey(0) && target==0) {map.keySet().forEach(x-> {

           List<List<Integer>> l1=  map.get(x);

           for(int i=0;i<l1.size();i++){
               int j=i+1;
               while (j<l1.size()){
                   List l2 = new ArrayList();
                   l2.addAll(l1.get(i));
                   l2.addAll(l1.get(j));

                   if (!returnList.contains(l2)) {
                       returnList.add(l2);
                   }
                   j++;
               }
           }

        });}


        return returnList;


    }

}

