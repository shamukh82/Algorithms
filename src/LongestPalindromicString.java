/**
 * Created by smukherjee5 on 2/16/18.
 */
public class LongestPalindromicString {

    static int palindromeMaxLenghth=0;
    static String palindromeMax="";
    //letsbubbleup

//     00 01 02 03 04 05 06
//     10 11 12 13 14 15 16
//     20 21 22 23 24 25 26
//        20
//        30
//        40
//        50
//        60

//    arr[0] = true
//    arr[0][1] = true
//

    public static String longestPalindrome(String s) {

        int strLen = s.length();
        boolean[][] arr = new boolean[strLen][strLen];




        for(int l=0;l<strLen;l++) {

            for (int i = 0; i < strLen - 1; i++) {

                int j = i + l;

                if (j < strLen)

                {
                    if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || arr[i + 1][j - 1])) {
                        arr[i][j] = true;

                        if (j - i + 1 > palindromeMaxLenghth) {

                            palindromeMaxLenghth = j - i + 1;
                            palindromeMax = s.substring(i, j + 1);
                        }
                    }
                }


            }

        }

        if(palindromeMaxLenghth==0){
            palindromeMaxLenghth=1;
            palindromeMax=s.substring(0,1);
        }
        return palindromeMax;
    }

//    static int getFlag(String s,int i, int j){
//
//        if(i==j) return 1;
//
//        if (s.charAt(i)==s.charAt(j) && getFlag(s,i+1,j-1)==1){
//            if (j-i+1 > palindromeMaxLenghth){
//                palindromeMaxLenghth=j-i+1;
//                palindromeMax= s.substring(i,j);
//                return 1;
//
//            }
//
//        }
//
//        return 0;
//
//
//    }



    public static void main(String[] args){

        String str = "ABBCBBP";
        System.out.println(longestPalindrome(str));


    }

}


//banana
//ananab