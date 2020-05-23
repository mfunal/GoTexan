package GoTexan_Practice_day_05_23_20;

public class QuestionNumber_10 {

    /*
    Given three ints, a b c, return true if b is greater than a, and c is greater than b.
    However, with the exception that if "rule" is true, b does not need to be greater
    than a.

    inOrder(1, 2, 4, false) → true
    inOrder(1, 2, 1, false) → false
    inOrder(1, 1, 2, true) → true
     */

    public static boolean inOrder(int a, int b, int c, boolean exception) {
        boolean result = false;

        if(a < b && b<c && !exception){
            result=true;
        }else if(b<c && exception){
            result=true;
        }else{
            result=false;
        } return result;
    }

    public static void main(String[] args) {
        System.out.println(inOrder(1,1,2,true));
    }


}
