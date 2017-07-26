package T14653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by icaynia on 2017. 7. 27..
 *
 * 14653번: 너의 이름은
 *
 * https://www.acmicpc.net/problem/14653
 * 
 * 런타임 에러 있습니다.
 */

public class Main
{

    static int n, k, q, i;
    static String str;
    static char[] member;
    static String[] message_p, message_read;
    static int[] message_r;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] val = str.split(" ");


        n = Integer.parseInt(val[0]);
        k = Integer.parseInt(val[1]);
        q = Integer.parseInt(val[2]);

        message_r = new int[k];
        message_p = new String[k];
        member = new char[n];

        for (int i = 0; i < n; i++)
        {
            member[i] = (char)('A' + i);
        }
        message_read = new String[k];

        for (int i = 0; i < k; i++)
        {
            String[] str2 = br.readLine().split(" ");
            message_r[i] = Integer.parseInt(str2[0]);
            message_p[i] = str2[1];

            message_read[i] = "";
        }

        for (int i = 0; i < k; i++)
        {
            regReader(message_p[i], i+1);

        }

        for (int i = 0; i < k-1; i++)
        {

            if (message_r[i] == message_r[i+1])
            {
                message_read[i+1] = message_read[i];
            }
        }

        for (int i = 0; i < n; i++)
        {
            char a = member[i];
            if (!message_read[q].contains(a+""))
            {
                System.out.print(a + " ");
            }
        }
    }

    static void regReader(String person, int messageIndex)
    {
        for (int j = messageIndex-1; j >= 0; j--)
        {
            if (message_r[j] == 0)
            {
                message_read[j] = "";
                for (int tmp = 0; tmp < n; tmp++)
                {
                    message_read[j] += member[tmp];
                }
            }

            if (!message_read[j].contains(person))
                message_read[j] += person;
        }
    }
}
