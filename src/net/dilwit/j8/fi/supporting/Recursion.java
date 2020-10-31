package net.dilwit.j8.fi.supporting;

public class Recursion {

    public static void main(String args[]) {

        System.out.println(calculateFactorialWithForLoop(1));
        System.out.println(calculateFactorialWithForLoop(5));

        System.out.println(calculateFactorialRecursion(1));
        System.out.println(calculateFactorialRecursion(5));

        calculateFibonachiWithForLoop(20);
        calculateFibonachiRecursion(0, 20, 1);
    }

    private static int calculateFactorialWithForLoop(int number) {
        int val = 1;
        for (int i = 1; i <= number; i++) {
            val = val * i;
        }

        return val;
    }

    private static int calculateFactorialRecursion(int number) {

        if (number == 1)
            return number;

        return number * calculateFactorialRecursion(number - 1);
    }

    private static void calculateFibonachiWithForLoop(int number) {
        for (int i = 0; i <= number; i++) {
            if (i == 0 || i == 1 || i == 2)
                System.out.println(i);
            else {
                int x = (i - 1) + i;
                System.out.println(x);
                i = x;
            }

        }
    }

    private static void calculateFibonachiRecursion(int start, int end, int gap) {
		
/*		if (start == 0) System.out.println(0);
	    if (start == 1) System.out.println(1);*/
        System.out.println(start);
        if (start <= end) {
            int newStart = start + gap;
            gap = newStart - gap;
            calculateFibonachiRecursion(newStart, end, gap);
        }

        return;
    }
}
