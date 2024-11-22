package conditionals_and_loops;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        // largest number//
//        System.out.println("input the first number:");
//        int a = input.nextInt();
//        System.out.println("input the second number:");
//        int b = input.nextInt();
//        System.out.println("input the third number:");
//        int c = input.nextInt();
//            // 1st method //
////        int max = a;
////        if (b>max){
////            max = b;
////        }
////        if (c>max) {
////            max = c;
////        }
//            // 2nd method //
////        int max = 0;
////        if( a > b ){
////            max = a;
////        }else{
////            max = b;
////        }
////        if (c > max ){
////            max = c;
////        }
//            // 3rd method //
//        int max = Math.max(c,Math.max(a,b));
//
//        System.out.println(max+" is the largest");

        //alphabet check //
//        String word = " hello ";
//        System.out.println(word.trim().charAt(0)); // '.trim()' is used to cut the words out
//        char ch = input.next().trim().charAt(0); //.charAt() will return that 'char' only
//        System.out.println(ch);
//
//        if (ch>'a'&& ch<'z'){
//            System.out.println("lowercase");
//        }else{
//            System.out.println("uppercase");
//        }

        // fibonacci //
//        System.out.println("fibonacci no:");
//        int n = input.nextInt();
//        int a = 0;
//        int b = 1;
//        int count =2;
//
//        while(count<=n){
//            int temp =b;
//            b = b+a;
//            a = temp;
//            count++;
//        }
//        System.out.println("the "+n+"th fibonacci no is "+b);

        // counting occurrence
//        System.out.println("enter the number:");
//        int num = input.nextInt();
//        System.out.println("enter the digit you want to check");
//        int digit = input.nextInt();
//        int count = 0;
//
//        while (num>0){
//            int rem = num%10;
//            if(rem==digit){
//                count++;
//            }
//            num = num/10;
//        }
//        System.out.println("the given digit "+digit+" occurred:");
//        System.out.println(count+" times");

        // reverse the number //

//        System.out.println("enter the number");
//        int num = input.nextInt();
//        int sum = 0;
//
//        while (num>0){
//            int rem = num%10;
//            sum = sum*10 +rem ;
//            num = num/10;
//        }
//        System.out.println(sum);

        // calculator program//

        System.out.println("calculator program");
        System.out.println("press 'x' to exit the program");
        float ans = 0;
        while (true) {

            System.out.println("enter the operator:");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+') {
                    System.out.println("enter the 1st number:");
                    float num1 = input.nextFloat();
                    System.out.println("enter the second number:");
                    float num2 = input.nextFloat();
                    ans = num1 + num2;

                }
                if (op == '-') {
                    System.out.println("enter the 1st number:");
                    float num1 = input.nextFloat();
                    System.out.println("enter the second number:");
                    float num2 = input.nextFloat();
                    ans = num1 - num2;

                }
                if (op == '*') {
                    System.out.println("enter the 1st number:");
                    float num1 = input.nextFloat();
                    System.out.println("enter the second number:");
                    float num2 = input.nextFloat();
                    ans = num1 * num2;

                }
                if (op == '/') {
                    System.out.println("enter the 1st number:");
                    float num1 = input.nextFloat();
                    System.out.println("enter the second number:");
                    float num2 = input.nextFloat();
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("not possible with zero");
                    }
                }
                if (op == '%') {
                    System.out.println("enter the 1st number:");
                    float num1 = input.nextFloat();
                    System.out.println("enter the second number:");
                    float num2 = input.nextFloat();
                    if (num1 > num2) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("not possible");
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("invalid");
            }
            System.out.println(ans);
        }
    }
}



