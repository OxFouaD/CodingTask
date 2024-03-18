package org.example.codingTask;

public class task8 {
    public static void main(String[] args) {

        /*
        Maximum and minimum number in the array?
         */
        int[] numbers={20,35,10,55,60};
        int max=numbers[0];
        for(int num:numbers){
            if(max<num){
                max=num;
            }
        }
        int min=numbers[0];
        for(int num:numbers){
            if(min>num){
                min=num;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
