package org.example.codingTask;

public class task6 {
    public static void main(String[] args) {

        /*
        Write a java program to check whether a given number is prime or not?
         */
        int num=35;
        boolean value=false;
        for(int i=2;i<=num/2;i++){
            if(num%1==0){
                value=true;
            }
        }
        if(!value){
            System.out.println(num+" is a prime number.");
        }else{
            System.out.println(num+" is a give number.");
        }

    }
}
