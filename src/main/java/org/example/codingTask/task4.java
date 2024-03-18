package org.example.codingTask;

public class task4 {
    public static void main(String[] args) {

        /*
        Create a 2D array of integers.
        Develop a program which will calculate the sum of
        even and odd numbers for that array.
         */
        int[][] numbers={
                {20,55,66,80},
                {70,50,40,10},
                {88,90,44,22}
        };
        int sum=0;
        int sum1=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(numbers[i][j]%2==0){
                    sum+=numbers[i][j];
                }else if(numbers[i][j]%2!=0){
                    sum1+=numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+sum);
        System.out.println("The sum of the odd numbers is "+sum1);

    }
}
