package T1094;


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int[] val = new int[6];
        int cnt = 1;

        int i = 0;
        while(X != 1)
        {
            val[i++] = X % 2;
            if (X % 2 == 1) cnt++;
            X = X / 2;
        }
        System.out.println(cnt);
    }

}
