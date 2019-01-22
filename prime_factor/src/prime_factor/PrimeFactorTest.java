package prime_factor;

import static prime_factor.PrimeFactors.generate;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class PrimeFactorTest extends TestCase {
	public void testOne() throws Exception {
		assertEquals(listPrimeFactors(), generate(1));
	}

	public void testTwo() throws Exception {
		assertEquals(listPrimeFactors(2), generate(2));
	}

	public void testThree() throws Exception {
		assertEquals(listPrimeFactors(3), generate(3));
	}

	public void testFour() throws Exception {
		assertEquals(listPrimeFactors(2, 2), generate(4));
	}

	private List<Integer> listPrimeFactors(int... ints) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ints)
			list.add(i);
		return list;
	}
}
