import java.io.*;
import java.util.ArrayList;


/*
Times and Test Cases:

1
30.9mb
167ms

2
30.6mb
147ms

3
31.1mb
181ms

4
30.6mb
164ms

5
30.9mb
170ms

6
31.2mb
182ms

7
31.6mb
195ms

8
31.8mb
229ms

9
31.8mb
218ms

10
32.0mb
254ms
*/
public class CircularBarn {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("cbarn.in"));
        PrintWriter pw = new PrintWriter("cbarn.out");

        int N = Integer.parseInt(r.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        //input
        for (int i = 0; i < N; i++)
        {
            arr.add(Integer.parseInt(r.readLine()));
        }

        for (int i = 0; i < N; i++)
        {
            int temp = 0;

            //run through individual values - multiply by j in order to get number of doors
            for (int j = 1; j < N; j++)
                temp += arr.get(j) * j;
            min = Math.min(temp, min);

            //Circle
            arr.add(arr.remove(0));
        }

        pw.println(min);

        pw.close();
        r.close();
    }
}
