package RandomProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sanjanabadam on 8/22/16.
 */
public class LongestSubArray {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        //final String fileName = System.getenv("OUTPUT_PATH");
      //  BufferedWriter bw = new BufferedWriter(System.in);
        int res;

        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }

        int _k;
        _k = Integer.parseInt(in.nextLine().trim());

        res = maxLength(_a, _k);
        System.out.println(res);
       // bw.write(String.valueOf(res));
       // bw.newLine();

     //       bw.close();
    }

    static int maxLength(int[] a, int k) {
        int longest = 0; // Initialize result
        int n = a.length;
        // Pick a starting point
        for (int i = 0; i < n; i++)
        {

            int currSum = 0;

            for (int j = i; j < n; j++)
            {
                currSum += a[j];

                if (currSum <= k)
                    longest = Math.max(longest, j-i+1);
            }
        }
        return longest;



        }

    }



