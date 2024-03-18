package org.example.codingTask;

public class task1 {
    public static void main(String[] args) {

        /*
        Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.
         */

        int[] temperature={60,65,70,75,80,90,95};
        int highest=temperature[0];
        int lowest=temperature[0];
        for(int n:temperature){
            if(highest<n){
                highest=n;
            }
            if(lowest>n){
                lowest=n;
            }
        }
        System.out.println("The highest temperature for the week "+highest);
        System.out.println("The lowest temperature for the week "+lowest);


    }
}
