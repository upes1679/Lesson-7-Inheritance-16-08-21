package com.company;

public class Arrays {
    public static void main(String[] args){
        //Array of int
        int[] myNums=new int[5];
        //System.out.println(myNums[5]);
        myNums[3]=5;
        myNums[4]=6;
//        System.out.println(myNums[3]);
        String[] colors={"red","black","white","blue"};
//        System.out.println(colors[2]);

        int[] numbers=new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=i*100;
        }

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        //Multidimensional array
        int[][] arr=new int[10][20];
        arr[0][1]=5;

        System.out.println(calcAvg(new int[] {1,2,3,4,5}));
    }

    public static double calcAvg(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        return  sum/arr.length;
    }
}
