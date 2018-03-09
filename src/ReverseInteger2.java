/**
 * Created by smukherjee5 on 3/2/18.
 */
import static java.lang.Math.pow;
public class ReverseInteger2 {


    public static void main(String[] args){
        System.out.println(reverseInteger(14567));

    }


    static int reverseInteger(int x){
        int returnNum=0;

            int y=x;
            while (y>0)

            {
                returnNum = returnNum * 10 + y % 10;
                y = y / 10;

                System.out.println("y is " + y);
                System.out.println(returnNum);
            }
        return returnNum;

    }
}
