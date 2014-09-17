package io.macintosh.scratch.params;

public class MyMath {

	public int sum(int[] vals) {
		int sum = 0;
		for(int val : vals) {
			sum += val;
		}
		return sum;
	}

	public int avg(int[] vals) {
		int avg = 0;
		if(vals.length > 0) {
			avg = sum(vals) / vals.length; // simple; no rounding
		}
		return avg;
	}

}
