package com.googleKickStart;

/**
 Dr. Patel has N stacks of plates. Each stack contains K plates. Each plate has a positive beauty value, describing how beautiful it looks.

 Dr. Patel would like to take exactly P plates to use for dinner tonight. If he would like to take a plate in a stack, he must also take all of the plates above it in that stack as well.

 Help Dr. P

 Output

 2

 2 4 5
 10 10 100 30 80 50 10 50

 3 2 3
 80 80 15 50 20 10

 250
 180

 N no of plates
 K contains k plates
 P
 */
public class Plates {

    public static void main(String[] args) {

        /**
         Solution :

         In Sample Case #1, Dr. Patel needs to pick P = 5 plates:
         He can pick the top 3 plates from the first stack (10 + 10 + 100 = 120).
         He can pick the top 2 plates from the second stack (80 + 50 = 130) .
         In total, the sum of beauty values is 250.

         In Sample Case #2, Dr. Patel needs to pick P = 3 plates:
         He can pick the top 2 plates from the first stack (80 + 80 = 160).
         He can pick no plates from the second stack.
         He can pick the top plate from the third stack (20).
         In total, the sum of beauty values is 180.

         */
    }
}
