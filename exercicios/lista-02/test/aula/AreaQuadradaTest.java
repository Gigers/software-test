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
public class AreaQuadradaTest {

	// Atributos para armazenar as entradas
	private int entradaUm; // b
	private int entradaDois; // a
	private int esperado;
	// ---
	private Operacao op;

	@Before
	public void setUp() {
		op = new Operacao();
	}

	@Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {
				// Entrada1 (b), entrada2 (a), esperado
				{ 0, 0, 0 }, { 1, 1, 1 }, { 2, 0, 0 }, { 0, 2, 0 } });
	}

	public AreaQuadradaTest(int entradaUm, int entradaDois, int esperado) {
		this.entradaUm = entradaUm; // b
		this.entradaDois = entradaDois; // a
		this.esperado = esperado;
	}

	@Test
	public void testAreaQuadrado() throws Exception {
		assertEquals(op.areaQuadrado(entradaUm, entradaDois), esperado, 0);
	}
}
