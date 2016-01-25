package Algorithms;
import java.util.*;

public class solveMeFirst {
    static int solveMe(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _a;
        _a = in.nextInt();
        int _b;
        _b = in.nextInt();
        int sum;
        sum = solveMe(_a, _b);
        System.out.println(sum);
    }
}