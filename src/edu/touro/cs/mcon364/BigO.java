package edu.touro.cs.mcon364;

import java.util.Random;

public class BigO {

    public static void main(String[] args) {
        Order_n();
        // password hacking via Brute Force k^n
    }
    public static void order_n_squared(String[] args) {
        // init a 2d array with size 1000 with random numbers 1 thru 10 and get their average
        final int SIZE = 1000;
        int[][] list = new int[SIZE][2 * SIZE];

        for (int i = 0; i < list.length; i++) { //O(n)
            for (int j = 0; j < list[i].length; j++) { //O(n)
                list[i][j] = new Random().nextInt(10) + 1;
            }

        }
    }
        public static void Order_n() {
            // init an array with 100,000 random numbers 1 thru 10 and get their average
            final int SIZE = 100_000;
            int[] list = new int[SIZE];
            Random r = new Random();

            for (int i = 0; i < list.length; i++) { //O(n)
                list[i] = r.nextInt(10) + 1;
            }

            int total = 0;
            for (int x : list) {
                total += x;
            }

            System.out.println((double) total / SIZE); // O(n)
        }
}
