package T14578;

import java.util.Scanner;

public class Main {
    static int[] blue;
    static int[] red;
    static int N;
    static int cnt = 0;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        red = new int[N];
        blue = new int[N];

        process(0);
        System.out.println(cnt);
    }

    public static void process(int index)
    {
        if (index >= N)
        {
            cnt++;
            return;
        }

        // 빨간색 다음 파란색
        for (int i = 0; i < N; i++)
        {
        }

        // 파란색 다음 빨간색
        for (int i = 0; i < N; i++)
        {

        }

        process(index+1);
    }

    public static boolean isBluePossible(int index, int row)
    {
        return true;
    }

    public static boolean isRedPossible(int index, int row)
    {
        return true;
    }

}
