package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Implement_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
       
        String[] planArr = br.readLine().split(" ");
        int x = 1;
        int y = 1;
        int [] dx = {0, 0, -1, 1};
        int [] dy = {-1, 1, 0, 0};
        String [] moveType = {"L", "R", "U", "D"};
        
        
        for (String plan: planArr) {
        	int nx = 0;
        	int ny = 0;
        	int index = 0;
        	for (String move : moveType) {
        		if (plan.equals(move)) {
        			nx = x + dx[index];
        			ny = y + dy[index];
        		}
        		index++;
        	}
        	
        	if (nx < 1 || nx > n || ny < 1 || ny > n) {
        		continue;
        	}
        	
        	x = nx;
        	y = ny;
        }
        
        System.out.println(x + " " + y);
	}
}
