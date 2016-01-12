package jp.mzw.peta;

public class Math {
	
	public static int sum(int[] values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
	
	public static float ave(int[] values) {
		if(values.length == 0)
			return 0;
		float ave = (float) sum(values) / values.length;
		return ave;
	}
	
}
