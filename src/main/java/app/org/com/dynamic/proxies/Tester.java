package app.org.com.dynamic.proxies;

import java.util.HashMap;
import java.util.Map;

public class Tester {
	
	public int numPairsDivisibleBy60(int[] time) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    int count = 0;
	    for (int t : time) {
	      if (map.containsKey(((60 - t % 60)) % 60)) {
	        count += map.get((60 - t % 60) % 60);
	      }
	      map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
	    }
	    return count;
	  }

	public int[] timeVal = {360, 660, 900, 480, 180, 240, 240, 300, 600, 540, 960, 180, 840, 240, 240, 120, 960, 420, 780, 540, 480, 60, 900, 660, 540, 540, 720, 
	180, 900, 900, 720, 540, 60, 900, 240, 720, 60, 900, 60, 420, 480, 780, 660, 840, 780, 180, 300, 900, 780, 300, 540, 240, 60, 960, 780, 780, 
	780, 600, 120, 480, 720, 360, 60, 660, 420, 840, 840, 300, 780, 540, 420, 120, 600, 240, 240, 360, 60, 660, 360, 840, 240, 900, 540, 240, 480, 
	840, 180, 600, 180, 900, 300, 660, 960, 300, 360, 840, 420, 600, 780, 240, 480, 1};

	public static void main(String[] args) {
		Tester te = new Tester();
	}
}
