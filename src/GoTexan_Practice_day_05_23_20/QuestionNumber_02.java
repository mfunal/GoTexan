package GoTexan_Practice_day_05_23_20;

public class QuestionNumber_02 {
    public static void main(String[] args) {

        String Sentence = "There the the non the there two the the two there then the";
//      Please write a code calculates how many "the" int the sentence.

        int count=0;
        String []arr=Sentence.split(" ");
        for(int i=0; i< arr.length;i++){
            if(arr[i].equals("the")) {
                count++;
            }

        }
        System.out.println(count);


    }
}
