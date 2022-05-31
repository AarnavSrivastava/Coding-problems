import java.io.*;
import java.util.*;

public class Speeding {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter("speeding.out");

        StringTokenizer st = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] road = new int[n][2];
        int[][] bess = new int[m][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            road[i][0] = Integer.parseInt(st.nextToken());
            road[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(r.readLine());
            bess[i][0] = Integer.parseInt(st.nextToken());
            bess[i][1] = Integer.parseInt(st.nextToken());
        }

        int roadInd = 0;
        int cowInd = 0;

        int roadSeg = road[roadInd][0];
        int cowSeg = bess[cowInd][0];

        int max = 0;

        for (int i = 0; i < 100; i++)
        {
            if (i == roadSeg)
            {
                roadInd++;
                roadSeg += road[roadInd][0];
            }

            if (i == cowSeg)
            {
                cowInd++;
                cowSeg += bess[cowInd][0];
            }

            max = Math.max(max, bess[cowInd][1] - road[roadInd][1]);
        }

        pw.println(max);

        pw.close();
        r.close();
    }
}
