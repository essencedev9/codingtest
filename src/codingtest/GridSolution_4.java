package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GridSolution_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        
        int count = 0;
        
        while (n >= k) {
        	if (n % k != 0) {
        		count = count + (n % k);
        	}
        	n = n / k;
        	count++;
        }
        
        if (n != 1) {
        	count = count + (n - 1);
        }
        
        System.out.println(count);
	}
}

