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
public class AreaQuadradoExceptTest {

	// Atributos para guardar os dados recebidos no construtor
	private int entradaUm;
	private int entradaDois;
	private int esperado;
	// ---
	private Operacao op;

	@Before
	public void setUp() {
		op = new Operacao();
	}

	// Retorna os parâmentros utilizados nos testes
	@Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { -1, 0, -1 }, { 0, -1, -1 }, { -1, -1, 1 } });
	}

	public AreaQuadradoExceptTest(int entradaUm, int entradaDois, int esperado) {
		this.entradaUm = entradaUm; // b
		this.entradaDois = entradaDois; // a
		this.esperado = esperado;
	}

	@Test(expected = Exception.class)
	public void testExcept() throws Exception {
		assertEquals(op.areaQuadrado(entradaUm, entradaDois), esperado, 0);
	}
}
