package T9663;

import java.util.Scanner;

public class Main {
    static int cnt = 0;
    static int N;
    static int[] cols;

    // queen : 1, attackavailable : 2.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        cols = new int[N];
        queen(0);

        System.out.println(cnt);
    }

    public static void queen(int index)
    {
        if (index == N)
        {
            cnt++;
        }
        else
        {
            for (int i = 0; i < N; i++)
            {
                cols[index] = i;
                if (isPossible(index))
                {
                    queen(index+1);
                }
            }
        }
    }

    public static boolean isPossible(int index)
    {
        for (int i = 0; i < index; i++)
        {
            if (cols[index] == cols[i]) return false;
            if (Math.abs(index-i)== Math.abs(cols[index]-cols[i])) return false;
        }
        return true;
    }
}
