package T14487;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by icaynia on 2017. 7. 15..
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int arr[] = new int[50000];
        int maxIndex = 0, sum = 0;

        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(str[i]);
            if (arr[maxIndex] < arr[i])
            {
                maxIndex = i;
            }
            sum += arr[i];
        }

        sum -= arr[maxIndex];
        System.out.println(sum);
    }
}
