package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class GridSolution_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        int [] minArr = new int[n];
        for (int i=0; i<n ; i++) {
        	int min = 10001;
        	String[] data = br.readLine().split(" ");
        	
        	for(int j=0; j<data.length; j++) {
        		if (Integer.parseInt(data[j]) < min) {
        			min = Integer.parseInt(data[j]);
        			
        		}
        	}
        	minArr[i] = min;
        }
        
        int max = 0;
        for (int i=0; i<minArr.length; i++) {
        	if(minArr[i] > max) {
        		max = minArr[i];
        	}
        }
        
        int result = max;
        System.out.println(result);

	}
}
