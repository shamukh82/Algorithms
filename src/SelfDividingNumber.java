/**
 * Created by smukherjee5 on 12/19/17.
 */
import java.util.ArrayList;
import java.util.*;


public class SelfDividingNumber {
    public static void main(String[] args){
        selfDividingNumbers(2,30).forEach(x -> System.out.println(x) );

        //System.out.println(isSelfDividingNumber(23));


    }

    static boolean isSelfDividingNumber(int num){

       int temp = num;

       while(temp > 0){
           int d= temp%10;
           if(d ==0 || num%d!=0){
               return false;
           }

           temp=temp/10;

       }
       return true;

    }
    static List<Integer> selfDividingNumbers(int left,int right){

        List<Integer> list = new ArrayList<Integer>();
        int runner=left;
        while (runner <= right){
            if(isSelfDividingNumber(runner)){
                list.add(runner);
            }
            runner++;

        }
        return list;

    }
//        int number = left;
//        while (number < 10){
//            list.add(number);
//            number++;
//        }
//
//        number = right;
//
//            outerloop:
//            while(number > 10){
//         //403
//                System.out.println("number:"+number);
//
//                Boolean isASelfDivindingNumber=true;
//
//                int restofdigits=number;
//                int digit =number;
//
//                while(restofdigits >10){
//                digit = number%10;
//                restofdigits =  number/10;
//                System.out.println("number:"+number);
//                System.out.println("digit:"+restofdigits);
//
//                //if you find 0 move on
//                if(restofdigits%10==0){ number--;continue;}
//
//
//                if(number%10!=0 && number%(digit)==0){
//                    isASelfDivindingNumber=isASelfDivindingNumber&&true;
//                    System.out.println("numberloop:"+number);
//                    System.out.println("digitloop:"+digit);
//
//                } else {
//                    System.out.println("numberloop1:"+number);
//                    System.out.println("digitloop1:"+digit);
//
//                    isASelfDivindingNumber=isASelfDivindingNumber&&false;
//                }
//
//            }
//                if(isASelfDivindingNumber){list.add(number);}
//
//                number--;
//
//        }


//    static List<Integer> selfDividingNumbers(int left, int right){
//        List<Integer> list = new ArrayList<Integer>();
//        Set<Integer> set = new HashSet<Integer>();
//
//        if(left > right){ return list;}
//        int pointer = left;
//        String pointerString = String.valueOf(pointer);
//        int numDigits=pointerString.length();
//        int i =1;
//
//        if(pointer <10){
//            list.add(pointer);
//            while(i<numDigits ){
//                int newInt= Integer.parseInt(pointerString+pointerString);
//                if (newInt< right)
//                    { list.add(newInt);
//                        set.add(newInt);
//                    }
//                else{
//                    break;
//                }
//                i++;
//            }
//        }
//
//
//
//        while(pointer <= right){
//         int digitPointer=numDigits;
//
//         //No 0 in the digits
//            while (digitPointer>0){
//
//                int newNumberPerDigit=Integer.parseInt(pointerString.substring(0,digitPointer));
//
//                if(Integer.parseInt(pointerString.substring(0,digitPointer))%10==0){
//                    break;
//                }
//                else{
//                    if(pointer%Integer.parseInt(pointerString.substring(digitPointer-1,digitPointer))==0){
//                        if(!set.contains(pointer)){
//                            list.add(pointer);
//                        }
//                    }
//                }
//            }
//
//            System.out.println(pointer);
//                pointer++;
//
//        }
//
//        return list;
//    }
}
