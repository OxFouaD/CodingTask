package org.example.codingTask;

public class task3 {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers={
                {10,30,40,50},
                {22,60,90,65},
                {15,50,80,30}
        };

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[i][j]%20==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();

        }

    }
}
