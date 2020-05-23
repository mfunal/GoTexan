package GoTexan_Practice_day_05_23_20;

import java.util.Arrays;

public class QuestionNumber_03 {

// Replit Question "Arrays - Front Piece"

// Given an int array of any length, print a new array of its first
// 2 elements. If the array is smaller than length 2, use whatever elements are present.
/*
Example:
input 1, 2, 3
output: [1, 2]
Example:
input 1,
output: [1]
 */
public static void main(String[] args) {
    int[] num = {3,4,4,6,7,8,9};
    int []arr1= new int[2];
    int []arr2= new int[1];
    if(num.length>2){// {3,4,4,6,7,8,9}; result =[3],[4]
        arr1[0]=num[0];
        arr1[1]=num[1];
        System.out.println(Arrays.toString(arr1));

    }else if(num.length<=2){//{3,4}; result =[3].
        arr2[0]=num[0];
        System.out.println(Arrays.toString(arr2));

    }


}


}
