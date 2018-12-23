package math.problems;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
         int fibo[] = new int[40];// find out 40 Fibonacci number using java
                for (int i = 0; i < 40; i++) {

                    if (i < 2) {
                        fibo[i] = i;
                    } //end of if condition
                    else {
                        fibo[i] = fibo[i - 2] + fibo[i - 1];
                    }// end of if else condition
                }// end of for loop
                System.out.println(Arrays.toString(fibo));
            }// end of main method
        }// end of class

