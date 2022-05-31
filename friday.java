/* 
ID: aarnav.2
LANG: JAVA
TASK: friday
*/

import java.io.*;

public class friday {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("friday.in"));
        PrintWriter pw = new PrintWriter("friday.out");

        int t = Integer.parseInt(r.readLine());

        int day = 0;
        int month = 1;
        int year = 1900;
        int[] dist = new int[7];

        for (int i = 0; i < 12*t; i++)
        {
            int days = 0;
            switch(month)
            {
                case 1: days = 31; month++; break;
                case 2:
                    if (year % 100 == 0 && year % 400 == 0)
                        days = 29;
                    else if (year % 100 != 0 && year % 4 == 0)
                        days = 29;
                    else
                        days = 28;
                    month++;
                    break;
                case 3: days = 31; month++; break;
                case 4: days = 30; month++; break;
                case 5: days = 31; month++; break;
                case 6: days = 30; month++; break;
                case 7: days = 31; month++; break;
                case 8: days = 31; month++; break;
                case 9: days = 30; month++; break;
                case 10: days = 31; month++; break;
                case 11: days = 30; month++; break;
                default: days = 31; year++; month = 1; break;
            }

            for (int j = 1; j <= days; j++)
            {
                if (j == 13)
                {
                    dist[day]++;
                }

                if (day == 6)
                    day = 0;
                else
                    day++;
            }
        }
        pw.print(dist[5] + " " + dist[6] + " ");

        for (int i = 0; i < dist.length-3; i++)
            pw.print(dist[i] + " ");
        pw.print(dist[4]);
        pw.println();

        pw.close();
        r.close();
    }
}
