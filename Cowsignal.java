import java.util.*;
import java.io.*;

public class Cowsignal {

	public static void main(String[] args) throws IOException {
		/*
		 * Slowest time: 209 ms
		 * Fastest time: 188 ms
		 * The code could likely be improved; email suggestions and questions
		 * at joemama202020202020@gmail.com
		 * */
		//Setting up the reader
		BufferedReader r = new BufferedReader(new FileReader("cowsignal.in"));
		PrintWriter pw = new PrintWriter("cowsignal.out");
		StringTokenizer st = new StringTokenizer(r.readLine());
		

		//Parsing the variable M, N, and K
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		//this array takes in every line of the symbol
		String[] symbol = new String[M];
		
		//reading the symbol
		for (int i = 0; i < symbol.length; i++)
		{
			symbol[i] = r.readLine();
		}
		
		/*printing out the expanded symbol. The individual chars on each line are 
		 * printed a K amount of times, and each line is printed a K amount of times
		*/
		for (int i = 0; i < M; i++)
		{
			for (int l = 0; l < K; l++)
			{
				for (int j = 0; j < N; j++)
				{
					for (int x = 0; x < K; x++)
						pw.print(symbol[i].charAt(j));
				}
				pw.println();
			}
		}
		
		r.close();
		pw.close();
	}
}
