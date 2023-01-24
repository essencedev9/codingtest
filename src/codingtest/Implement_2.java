package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implement_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
        int n = Integer.parseInt(input);
       
        int count = 0;
        for(int hour = 0; hour < n + 1; hour++) { 
        	for (int minute = 0; minute < 60; minute++) {
        		for (int second = 0; second < 60 ; second++) {
        			String hourStr = Integer.toString(hour);
        			if(hourStr.indexOf("3") != -1) {
        				count++;
        				continue;
        			}
        			
        			String minuteStr = Integer.toString(minute);
        			if(minuteStr.indexOf("3") != -1) {
        				count++;
        				continue;
        			}
        			
        			String secondStr = Integer.toString(second);
        			if(secondStr.indexOf("3") != -1) {
        				count++;
        				continue;
        			}
        		}
        		
        	}
        	
        }
        
        System.out.println(count);
	}
}
