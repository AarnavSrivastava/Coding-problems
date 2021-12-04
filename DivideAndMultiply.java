import java.util.*;
import java.io.*;

public class DivideAndMultiply {
    static long t = 0;
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++)
        {
            st = new StringTokenizer(r.readLine());
            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(r.readLine());
            ArrayList<Long> nums = new ArrayList<Long>();

            long[] sums = new long[n];

            for (int j = 0; j < n; j++)
                nums.add(Long.parseLong(st.nextToken()));
            
            Collections.sort(nums);

            ArrayList<Long> tempNums = new ArrayList<Long>();

            for (long j : nums)
                tempNums.add(j);

            for (int j = 0; j < n; j++)
            {
                t = nums.remove(j);
                for (int x = 0; x < nums.size(); x++)
                    nums.set(x, divideTwo(nums.get(x)));

                nums.add(t);

                long sum = 0;
                for (long x : nums)
                    sum += x;
                
                sums[j] = sum;

                nums.removeAll(nums);
                for (long x : tempNums)
                    nums.add(x);
            }

            long max = Long.MIN_VALUE;

            for (long j : sums)
            {
                if (j > max)
                    max = j;
            }
            pw.println(max);
        }

        pw.close();
        r.close();
    }

    static long divideTwo(long n)
    {
        while (n % 2 == 0)
        {
            n /= 2l;
            t *= 2l;
        }
        return n;
    }
}