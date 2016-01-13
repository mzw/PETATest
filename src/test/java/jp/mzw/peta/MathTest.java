package jp.mzw.peta;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {
	
	@Test
	public void instantiate() {
		Assert.assertNotNull(new Math());
	}
	
	@Test
	public void sum() {
		int[] inputs = {1, 2, 3, 4, 5};
		Assert.assertEquals(15, Math.sum(inputs));
	}
	
	@Test
	public void ave() {
		int[] inputs = {1, 2, 3, 4, 5};
		Assert.assertEquals(3, Math.ave(inputs), 0);
	}
	
	@Test
	public void aveEmpty() {
		Assert.assertEquals(0, Math.ave(new int[]{}), 0);
	}
	
	@Test
	public void max() {
		int[] inputs = {1, 2, 3, 4, 5};
		Assert.assertEquals(5, Math.max(inputs));
	}
}
