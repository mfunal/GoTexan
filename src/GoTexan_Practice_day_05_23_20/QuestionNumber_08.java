package GoTexan_Practice_day_05_23_20;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionNumber_08 {

    /*
    Given an array list of people' names: "Ayla", "Jahan", Harika", "Ahmet"
    Write a java operation to remove "Ahmet" from the array.
     */

    public static void main(String[] args) {

        String[] list = {"Ayla", "Jahan", "Harika", "Ahmet"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(list));
        list1.remove("Ahmet");
        System.out.println(list1);
        System.out.println("===================");
        removeName(list,"Jahan");// we can use this method for this question

    }

    public static void removeName(String[] arr, String remove) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        list.remove(remove);
        System.out.println(list);

    }
}

