package prime_factor;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class PrimeFactorTest extends TestCase {
	public void testOne() throws Exception {
		assertEquals(listPrimeFactors(), PrimeFactors.generate(1));
	}

	private List<Integer> listPrimeFactors() {
		return new ArrayList<Integer>();
	}
}
