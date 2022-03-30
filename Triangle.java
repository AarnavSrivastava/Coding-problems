package USACO;

import java.util.*;
import java.io.*;

public class Triangle {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(st.nextToken());

        double[][] cds = new double[n][2];

        for (int i = 0; i < n; i++)
        {
            st = new StringTokenizer(r.readLine());
            for (int j = 0; j < 2; j++)
            {
                cds[i][j] = Double.parseDouble(st.nextToken());
            }
        }

        double ans = 0.0;

        for (int i = 0; i < n; i++)
        {
            double area = 0.0;

            double ax = cds[i][0],bx,cx,ay = cds[i][1],by,cy;

            for (int j = i+1; j < n; j++)
            {
                bx = cds[j][0]; by = cds[j][1];
                for (int k = j+1; k < n; k++)
                {
                    cx = cds[k][0]; cy = cds[k][1];
                    double a = distanceFormula(ax, ay, bx, by);
                    double b = distanceFormula(bx, by, cx, cy);
                    double c = distanceFormula(cx,cy, ax, ay);
                    
                    double p = (a+b+c)/2.0;

                    area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

                    if((ax == bx || ax == cx || cx == bx) && (ay == by || ay == cy || cy == by))
					    ans = Math.max(ans, area);
                }
            }
        }

        ans = Math.floor(ans) * 2.0;

        pw.println((int) ans);

        pw.close();
        r.close();
    }

    static double distanceFormula(double x1, double y1, double x2, double y2) { return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); }
}
