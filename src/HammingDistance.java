/**
 * Created by smukherjee5 on 12/18/17.
 */
public class HammingDistance {
        //, int y
        static int hammingDistance(int x,int y) {
            System.out.println(Integer.toBinaryString(3));
            System.out.println(Integer.toBinaryString(2));
            System.out.println(3^2);

            return Integer.bitCount(x ^ y );
            //^ y
        }

        public static void main(String[] args){

            System.out.println(hammingDistance(3,2));
        }
    }

