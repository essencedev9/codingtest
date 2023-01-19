package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class GridSolution_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] data = br.readLine().split(" ");
        
        int result = 0;
        int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
       
        Arrays.sort(data,Collections.reverseOrder());
        
        int first = Integer.parseInt(data[0]);
        int second = Integer.parseInt(data[1]);
                
        int twoCount = m / (k + 1);
        int oneCount = m - twoCount;
        
        result = oneCount * first + twoCount * second;
        
        System.out.println(result);
	}
}
