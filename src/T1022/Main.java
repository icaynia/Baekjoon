package T1022;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by icaynia on 2017. 7. 30..
 *
 * not working : -4 -3 -2 0
 */
public class Main
{
    static int posX = 0, posY = 0;
    static int rotate = 1; // 0: 0, 1: 90, 2:180, 3:270

    static HashMap<Point, Integer> maps = new HashMap<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r1, c1, r2, c2;

        String[] val = br.readLine().split(" ");
        r1 = Integer.parseInt(val[0]);
        c1 = Integer.parseInt(val[1]);
        r2 = Integer.parseInt(val[2]);
        c2 = Integer.parseInt(val[3]);

        int cnt = 1;

        int width = c1*-1 + c2;
        int height = r1*-1 + r2;

        while (cnt < 5000)
        {
            maps.put(new Point(posX, posY), cnt);
            System.out.println("x : " + posX + ", y : " + posY + ", val : " + cnt + ", rotate : " + rotate);
            if (posX == r2 && posY == c1) break;

            cnt++;
            if (isAvailableLeft())
            {
                moveForward();
            }
            else
            {
                rotateLeft();
                moveForward();
            }
        }

        for (int i = r1; i <= r2; i++)
        {
            for (int j = c1; j <= c2; j++)
            {
                int tmp = maps.get(new Point(i, j));
                if (cnt > 1000 && tmp < 1000) System.out.print(" ");
                if (cnt > 100 && tmp < 100) System.out.print(" ");
                if (cnt > 10 && tmp < 10) System.out.print(" ");

                System.out.print(maps.get(new Point(i, j)) + " ");
            }
            System.out.println();
        }
    }

    static boolean isAvailableLeft()
    {
        if (rotate == 0) return isAvailable(posX-1, posY);
        else if (rotate == 1) return isAvailable(posX, posY+1);
        else if (rotate == 2) return isAvailable(posX+1, posY);
        else return isAvailable(posX, posY-1);
    }

    static void rotateLeft()
    {
        rotate -= 1;
        if (rotate == -1)
        {
            rotate = 3;
        }
    }

    static void moveForward()
    {
        if (rotate == 0) posY += 1;
        else if (rotate == 1) posX += 1;
        else if (rotate == 2) posY -= 1;
        else if (rotate == 3) posX -= 1;
    }

    static boolean isAvailable(int x, int y)
    {
        return maps.get(new Point(x, y)) != null;
    }

    static int toAbsoluteValue(int value)
    {
        if (value < 0) return value * -1;
        else return value;
    }
}
