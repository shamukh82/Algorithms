/**
 * Created by smukherjee5 on 3/5/18.
 */
public class LongestCommonPrefix {

    public static void main(String[] args){


        //System.out.println(longestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"}));
        //System.out.println(longestCommonPrefix(new String[]{"baab","bacb","b","cbc"}));
        System.out.println(longestCommonPrefix(new String[]{"ca","a"}));
    }

    public static String longestCommonPrefix(String[] str){

        if (str.length==0 || str ==null){
            return "";
        }
        String returnString = "";

        int maxLen = Integer.MAX_VALUE;

        for(String word: str){
           if(word.length() < maxLen){
               maxLen = word.length();
               returnString=word;
           }

            }

        int i=0;

        StringBuffer temp = new StringBuffer();

        while(i<maxLen){
            for(int j=0; j< str.length;j++){

                if(i!=maxLen && str[j].charAt(i)==returnString.charAt(i)){

                }  else{

                        if(temp.length()==0){temp.append("");}
                        return temp.toString();

                }

            }
            temp.append(returnString.charAt(i));
            i++;
        }
        returnString=temp.toString();

        return returnString;

    }

}
