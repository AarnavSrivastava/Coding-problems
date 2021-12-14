import java.util.*;
import java.io.*;

public class DivanChocolateStore {
    public static void main (String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        int testCases = Integer.parseInt(st.nextToken());

        for (int i = 0; i < testCases; i++)
        {
            st = new StringTokenizer(r.readLine());

            int n = Integer.parseInt(st.nextToken());
            int low = Integer.parseInt(st.nextToken());
            int high = Integer.parseInt(st.nextToken());
            int budget = Integer.parseInt(st.nextToken());

            ArrayList<Integer> bars = new ArrayList<Integer>();
            st = new StringTokenizer(r.readLine());
            for (int j = 0; j < n; j++)
            {
                bars.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(bars);
            
            int counter = 0;
            for (int j = 0; j < n; j++)
            {
            	if(budget-bars.get(j) >= 0 && bars.get(j) >= low && bars.get(j) <= high)
            	{
            		budget -= bars.get(j);
            		counter++;
            	}
            }
            
            pw.println(counter);
        }
        
        pw.close();
        r.close();
    }
}
