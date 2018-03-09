/**
 * Created by smukherjee5 on 3/1/18.
 */
public class ATOIStringToInteger {

    public static void main(String[] args){


        //myAtoi("- 0002 45 AF 3");
        //System.out.println("Result:"+myAtoi(""));
        //System.out.println("Result1:"+myAtoi("010"));
        System.out.println("Min Val"+Integer.MIN_VALUE);
        System.out.println("Result:"+myAtoi("2147483648"));
        //System.out.println("Result:"+myAtoi("- 0002 45 AF 3"));
    }

    public static int myAtoi(String str) {
        if(str.length() <1 || str ==null){

            return 0;
        }

        double returnNum =0;

        //white space
        String trimmedStr = str.trim();


        //signed
        char prefixChar = trimmedStr.charAt(0);
        int i=0;

        if(prefixChar == '+' || prefixChar=='-'){

            i++;

        }

        //remove any 0s at the front

        while(i <trimmedStr.length() && trimmedStr.charAt(i)=='0'){

            i++;
        }

        //actual number

        while ( i <trimmedStr.length() && trimmedStr.charAt(i) >= '0' && trimmedStr.charAt(i) <= '9' ){



            returnNum = returnNum*10 + (trimmedStr.charAt(i) - '0');
            i++;

        }

        //assign the sign
        if(trimmedStr.charAt(0)=='-'){

            returnNum = -returnNum;

        }

        //if lower than Integer MIN or greater than Integer MAX return 0

        if(returnNum <= Integer.MIN_VALUE ){

            returnNum = Integer.MIN_VALUE;
        }

        if(returnNum >= Integer.MAX_VALUE){

            returnNum = Integer.MAX_VALUE;

        }



        return (int)returnNum;



    }
}

