package GoTexan_Practice_day_05_23_20;

public class QuestionNumber_05 {

    /*
            1.  Write a program that can print out the unique
            values from a String Array
    Ex:
    if arr -> {"A", "A", "B", "C", "C"}
    output: B

    if arr -> {"A", "B", "B", "C"}
    output: A
            C

    MUST use for each loop
    */
    public static void main(String[] args) {
        String arr[]={"A", "A", "B", "C", "C"};
        String result="";
        for(String each:arr){
        int count=0;

            for(String each1:arr){
                if(each==each1){
                    count++;
                }
            }if(count== 1){
                result=each;
            }
        }
        System.out.println(result);
    }




}
