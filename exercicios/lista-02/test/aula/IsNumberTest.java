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
public class IsNumberTest {

	// atributos para armazenar as entradas
	private Object testado;
	private boolean esperado;
	// ---
	private Operacao op;

	@Before
	public void setUp() {
		op = new Operacao();
	}

	@Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { 12, true }, { 12.0, true }, { (char) 12.0, false }, { "12", false },
				{ new Object(), false }, { null, false } });
	}

	public IsNumberTest(Object testado, boolean esperado) {
		this.testado = testado;
		this.esperado = esperado;
	}

	@Test
	public void testIsNumber() throws Exception {
		assertEquals(op.isNumber(testado), esperado);
	}
}
