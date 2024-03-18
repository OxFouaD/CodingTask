package org.example.codingTask;

public class task2 {
    public static void main(String[] args) {

        /*
        Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.
         */

        int[] numbers={10,50,30,20,40};
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println(sum);

    }
}
