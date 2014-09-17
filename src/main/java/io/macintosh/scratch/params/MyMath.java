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
		int sum = sum(vals);
		int avg = sum / vals.length; // simple; no rounding
		return avg;
	}

}
