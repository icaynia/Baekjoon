package T14659;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] mountainHeight = new int[N];
        int[] sniperMaxKill = new int[N];
        int maxKill = 0;

        for (int i = 0; i < N; i++)
        {
            mountainHeight[i] = sc.nextInt();
            sniperMaxKill[i] = 0;
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = i+1; j < N; j++)
            {
                if (mountainHeight[i] <= mountainHeight[j])
                {
                    break;
                }
                sniperMaxKill[i]++;
            }

            if (maxKill < sniperMaxKill[i])
            {
                maxKill = sniperMaxKill[i];
            }
        }

        System.out.println(maxKill);



    }

}
