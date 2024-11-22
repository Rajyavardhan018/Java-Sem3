package conditionals_and_loops;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     /*
     Syntax of if statements:
         if (boolean expression T or F){
               // do this
            }else{
               // do this
               }
      */
        // salary program with multiple conditions//
        System.out.println("enter the amount of salary:");
        float salary = input.nextFloat();
        if (salary>10000||salary<20000){
            System.out.println("your salary is "+(salary+=2000));
        } else if (salary>20000) {
            System.out.println("your salary is "+(salary+=3000));
        }else{
            System.out.println("your salary is "+(salary+=1000));
        }


    }
}
