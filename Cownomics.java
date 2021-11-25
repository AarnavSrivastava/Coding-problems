package USACO;

import java.util.*;
import java.io.*;

/*
Times:
Case 1: 163 ms
Case 2: 148 ms
Case 3: 165 ms
Case 4: 158 ms
Case 5: 172 ms
Case 6: 206 ms
Case 7: 264 ms
Case 8: 177 ms
Case 9: 158 ms
Case 10: 250 ms
*/

public class Cownomics {
	public static void main(String[] args) throws IOException
    {
        //Setting up the reader/writer
        BufferedReader r = new BufferedReader(new FileReader("cownomics.in"));
        PrintWriter pw = new PrintWriter("cownomics.out");

        StringTokenizer st = new StringTokenizer(r.readLine());

        //Reading integers N and M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //Setting up arrays to read the genomes; str1 = spotty cows, str2 = plain cows
        String[] str1 = new String[N];
        String[] str2 = new String[N];

		//Reading the genomes
        for (int i = 0 ; i < N; i++)
        {
            st = new StringTokenizer(r.readLine());
            str1[i] = st.nextToken();
        }

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(r.readLine());
            str2[i] = st.nextToken();
        }

		//A counter to determine the amount of times a possible candidate appears for the genome strand
        int counter = 0;

		//Iterates through each of the characters of each genome string
        for (int i = 0; i < M; i++)
        {
			//temp is used to determine if all 3 spotty cow genomes are different from all 3 plain cows
            int temp = 0;

			//Iterating through each genome sequence
            for (int j = 0; j < N; j++)
            {
                for (int l = 0; l < N; l++)
                {
					/*
					Temp determines if all 3 spotty cow genomes are different from all 3 plain cow
					genomes, meaning if the genomes are completely different between the spotty cows and
					the plain cows, temp would equal N^2
					*/
                    if (str1[l].charAt(i) != str2[j].charAt(i))
                        temp++;
                }
			}

			//Determining if temp = N^2
            if (temp % (N*N) == 0 && temp != 0)
                counter++;
        }

        pw.println(counter);
        
        pw.close();
        r.close();
    }
}