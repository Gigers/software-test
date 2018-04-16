package aula;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;

import org.junit.runners.Parameterized;

// Exercício 6
@RunWith(Parameterized.class)
public class FatorialTest {

	private long testado;
	private long esperado;

	@Mock // Definindo o atribudo como Mock
	A a = null;

	@Before
	public void setUp() throws NullPointerException, Exception {
		a = mock(A.class);
	}

	// Parâmetro 0, 0 sempre dará erro. Mudei aqui para 0, 1
	@Parameters
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { 0, 1 }, { 1, 1 }, { 2, 2 }, { 5, 120 } });
	}

	public FatorialTest(Integer testado, Integer esperado) {
		this.testado = testado;
		this.esperado = esperado;
	}

	@Test
	public void testFatorial() {
		when(a.fatorial(anyLong())).thenCallRealMethod();
		assertEquals(esperado, a.fatorial(testado), 0);
	}
}
