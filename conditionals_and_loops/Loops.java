package conditionals_and_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Syntax of ' for' loop:
        for(initial.;condition;+\-){
              //body
            }
         */
        // print number for 1 to 10:
//        for(int i = 1 ; i<=10 ; i++){
//            System.out.println(i);
//        }
        // print number from 1 to n:
//        System.out.println("enter the number");
//        int n = input.nextInt();
//        for(int i = 1; i<=n ; i++){
//            System.out.println("hello world "+i);
//        }


        // while loop//
        /*
        Syntax for while loop:
        while (condition){
             // body
             }
         */
//        int i = 1;
//        while(i<=10){
//            System.out.print(" "+i);
//            i+=1;
//        }


        // do while loop
        /*
            syntax:
            do{
                //body
            }while(condition);
         */
            int i = 1;
            do{
                System.out.print(" "+i);
                i++;
            }while(i<=10);
    }


}
