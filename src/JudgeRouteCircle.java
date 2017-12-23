import java.util.HashMap;
import java.util.Map;

/**
 * Created by smukherjee5 on 12/18/17.
 */



//Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
//
//        The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
//
//        Example 1:
//        Input: "UD"
//        Output: true
//        Example 2:
//        Input: "LL"
//        Output: false

public class JudgeRouteCircle {

    public static void main(String[] args){
       //System.out.println(makesCircle(new char[]{'U','D','L','R'}));
       System.out.println(judgeCircle("DURDLDRRLL"));
    }

    static boolean makesCircle(char[] input) {

        Map<Character,Integer> counter = new HashMap<Character,Integer>();
        if (input.length == 0) {
            return true;
        }

        for (char i : input) {


                if (counter.get(i) != null) {
                    counter.put(i, counter.get(i) + 1);
                }

            else {

                counter.put(i, 1);
            }}

            System.out.println(counter.get('U'));
            System.out.println(counter.get('D'));
            System.out.println(counter.get('L') );
            System.out.println(counter.get('R'));

        if (counter.get('U') == counter.get('D') && counter.get('L') == counter.get('R')) {
                return true;
            }


            return false;
        }



    static boolean judgeCircle(String moves) {
        Map<Character, Integer> counter = new HashMap<Character, Integer>();
        boolean returnVal = true;
        if (moves.isEmpty()) {
            return true;
        }

        for (char i : moves.toCharArray()) {


            if (counter.get(i) != null) {
                counter.put(i, counter.get(i) + 1);
            } else {

                counter.put(i, 1);
            }
        }

        System.out.println(counter.get('U'));
        System.out.println(counter.get('D'));
        System.out.println(counter.get('L'));
        System.out.println(counter.get('R'));


        if(counter.get('D')!=null && counter.get('U')!=null){
            returnVal=(counter.get('D').equals(counter.get('U')));
        }
        if(counter.get('L')!=null && counter.get('R')!=null){
            returnVal=returnVal && (counter.get('L').equals(counter.get('R')));
        }

        System.out.println(counter.get('R')==null);

        if((counter.get('D')!=null && counter.get('U')==null) || (counter.get('D')==null && counter.get('U')!=null)
        ||(counter.get('L')!=null && counter.get('R')==null )||( counter.get('L')==null && counter.get('R')!=null)){
            returnVal =  false;
        }

        return returnVal;
    }
    }
