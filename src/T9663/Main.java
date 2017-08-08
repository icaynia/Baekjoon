package T9663;

import java.util.Scanner;

public class Main {
    static int[][] map;
    static int cnt = 0;
    static int N;

    // queen : 1, attackavailable : 2.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        map = new int[N][N];
        queen(0);

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void queen(int cursor)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {

            }
        }
    }

    public static void isPossible(int cursor)
    {
        for (int i = 0; i <= )
    }
}
