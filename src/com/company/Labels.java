package com.company;

public class Labels {
    public static void main(String[] args){

        // label for outer loop- it's like naming the loop
        outer:
        for(int i=0;i<10;i++){
            inner:
            for(int j=0;j<10;j++){
                if(j==1)
                    break outer;//by specifying the label we can break from the outer loop.
                // if we won't specify it we will just break the inner loop
                // we can also use continue with labels

                System.out.println("j = "+j);
            }
            System.out.println("i = "+i);
        }
    }
}
