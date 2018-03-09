/**
 * Created by smukherjee5 on 2/7/18.
 */

/*
P   A   H   N
A P L S I I G
Y   I   R

00-P 10   20    30-I
01-A 11   21-L  31
02-Y 12-A 22    32
03-P 13   23    33


00P               40A                   80H                         120N
    11A       31P       51L       71S           91I         111I            131G
        22Y               62I                       102R

P     I
A   L
Y A
P

P       H
A     S     I
Y   I           R
P L                 I       G
A                       N


P                               H
    A                       S       I
        Y               I               R
            P       L                       I       G
                A                               N


PAYPALISHIRING
PAHNAPLSIIGYIR
 */
public class ZigZagConversion {

    public static void main(String[] args){

        convert("uxhxdipfzwswybgfylqvjzharvrlyauuzdrcnjk",16);
        //convert("PAYPALISHIRING",5);
        //convert("AB",1);
    }

    public static String convert(String s, int numRows) {

        if(numRows==1){ return s;}

        String returnString = "";

        int strLen = s.length();
        System.out.println("strLen"+strLen);

        Character[][] arr = new Character[strLen][numRows];

        int j=0;
        int i=0;

        while(i<strLen)
        {
            while (j <  numRows && i < strLen){

                System.out.println("i:"+i+"||j:"+j+"||char:");
                System.out.println("||char:"+s.charAt(i));

                arr[i][j]=s.charAt(i);
                i++;
                j++;
            }
            j-=2;

            while (j >  0 && i < strLen -1){

                System.out.println("i:"+i+"||j:"+j+"||char:"+s.charAt(i));
                arr[i][j]=s.charAt(i);
                i++;
                j--;
            }

        }

        StringBuffer returnStrB=new StringBuffer();
        j=0;
        while (j<numRows)
        {
            for(int k =0;k<strLen;k++){

                System.out.println("print k "+k+"|||print j"+ j);
                if(arr[k][j]!=null)

                {
                    System.out.println("print char "+arr[k][j]);
                    returnStrB.append(arr[k][j]);

                }

            }
            j++;
        }



        returnString =returnStrB.toString();

        System.out.println("returnString:"+returnString);

        return returnString;
    }


}
