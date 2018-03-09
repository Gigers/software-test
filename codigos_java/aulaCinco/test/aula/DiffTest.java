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
public class DiffTest {

	private Operacao op;
	private int inputUm, inputDois;
	private int expected;

	public DiffTest(int inputUm, int inputDois, int expected) {
		this.inputUm = inputUm;
		this.inputDois = inputDois;
		this.expected = expected;
	}

	@Before
	public void setUp() {
		op = new Operacao();
	}

	@Parameters
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][] { { 3, 2, 1 }, { 3, 1, 2 }, { 5, 1, 4 } });
	}

	@Test
	public void test() {
		assertEquals(expected, op.diff(inputUm, inputDois));
	}

}
