package USACO;

import java.util.*;
import java.io.*;

public class LifeGuard {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[][] pairs = new int[N][2];

        int max = 0;

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(r.readLine());

            pairs[i][0] = Integer.parseInt(st.nextToken());
            pairs[i][1] = Integer.parseInt(st.nextToken());

            max = Math.max(pairs[i][0], max);
            max = Math.max(pairs[i][1], max);
        }

        int count = 0;

        pw.println(count);

        pw.close();
        r.close();
    }
}
