package T2011;

import java.util.Scanner;

public class Main {

    static String str;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        System.out.println(getComb(0));


    }

    public static int getComb(int p)
    {
        int cnt = 0;
        System.out.println(str.charAt(p));
        getComb(p+1);

        System.out.println(str.charAt(p) + "" +str.charAt(p+1));

        System.out.println("----");
        return cnt;
    }
}
