package T1016;

import java.util.Scanner;

/*
error
*/
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        int cnt = 0;
        for (int i = min; i <= max; i++)
        {
            if (!isSquareNumber(i)) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }

    public static boolean isSquareNumber(int n)
    {
        double f = Math.sqrt(n);
        if (f == (int)f) {
            return true;
        }
        else return false;
    }
}
