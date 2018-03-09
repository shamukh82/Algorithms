import java.util.Stack;

/**
 * Created by smukherjee5 on 3/1/18.
 */
public class ReverseInteger {


    public static void main(String[] args){

        System.out.println(reverse(123));
        // System.out.println(Integer.valueOf("8463847412"));
        //System.out.println(reverse(2147483647));
        //System.out.println(reverse(-123));
        //System.out.println(reverse(0));
        System.out.println(reverse(-2147483648));
        System.out.print(Integer.MIN_VALUE);
        //Long.valueOf("8463847412");


    }


    public static int reverse(int x) {

        String numString = String.valueOf(x);
        int strLen = numString.length();

        if(strLen==1){
            return x;
        }

        Stack<Character> stack = new Stack<Character>();

        int i=0;

        if (numString.charAt(0)=='-'){
            i=1;
        }


        while (i < strLen){
            stack.push(numString.charAt(i));
            i++;
        }

        StringBuffer sb = new StringBuffer();

        while (!stack.empty()){

            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
        long absVal = Long.parseLong(sb.toString());

        if(absVal < Integer.MIN_VALUE || absVal > Integer.MAX_VALUE){

            System.out.println("WARNING OVERFLOWED!!!");
            return 0;
        }


        int intVal = Integer.parseInt(sb.toString());
        if (numString.charAt(0)=='-'){return (0-intVal);}

        return intVal;



    }
}
