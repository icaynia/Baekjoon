package T1016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long min = sc.nextLong();
        long max = sc.nextLong();

        long cnt = 0;
        for (long i = min; i <= max; i++)
        {
            if (!isSquareNumber(i)) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }

    public static boolean isSquareNumber(long n)
    {
        double f = Math.sqrt(n);
        if (f == (int)f) {
            return true;
        }
        return false;
    }
}
