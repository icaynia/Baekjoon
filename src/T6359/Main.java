package T6359;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();

        for (int cas=0; cas < V; cas++)
        {
            int n = sc.nextInt();
            boolean[] door = new boolean[n+1]; // true가 잠겨진 것
            int cnt = 0;

            // i가 1인 경우는 제외(모두 열려있는 것부터 시작)
            int i = 2;
            while(i <= n)
            {
                int j = 1;
                while(i*j <= n)
                {
                    if (door[i*j]) door[i*j] = false;
                    else door[i*j] = true;
                    j++;
                }
                i++;
            }

            for (i = 1; i <= n; i++)
            {
                if (!door[i]) cnt++;
            }

            System.out.println(cnt);
        }
    }
}
