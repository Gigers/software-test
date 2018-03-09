package aula;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AddTest {

	private int testUm;
	private int testDois;
	private int expected;
	private Operacao op;
	
	public AddTest(int testUm, int testDois, int expected) {
		this.testUm = testUm;
		this.testDois = testDois;
		this.expected = expected;
	}
	
	@Before
	public void setUp() {
		op = new Operacao();
	}

	@Parameters
	public static Collection<Object[]> get() {
		return Arrays.asList(new Object[][] { { 0, 0, 0 }, { -1, -1, -2 }, { -1, 1, 0 } });
	}

	@Test
	public void test() {
		assertEquals(expected, op.add(testUm, testDois));
	}
}
