import java.util.*;
import java.io.*;

public class LifeOfAFlower {
    public static void main (String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());

        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++)
        {
            st = new StringTokenizer(r.readLine());

            int n = Integer.parseInt(st.nextToken());
            int[] data = new int[n];
            int height = 1;
            int counter = 0;
            int counter2 = 0;
            boolean dead = false;
            
            st = new StringTokenizer(r.readLine());
            for (int j = 0; j < n; j++)
                data[j] = Integer.parseInt(st.nextToken());
            
            for (int j = 0; j < data.length; j++)
            {
                if (data[j] == 1 && counter2 >= 1)
                {
                    height += 5;
                    counter2++;
                    counter = 0;
                }
                else if (data[j] == 1 && counter2 != 1)
                {
                    height++;
                    counter2++;
                    counter = 0;
                }
                else
                {
                    counter++;
                    counter2 = 0;
                }
                
                if (counter == 2)
                    dead = true;
            }

            if (!dead)
                pw.println(height);
            else
                pw.println(-1);
        }
        pw.close();
        r.close();
    }
}