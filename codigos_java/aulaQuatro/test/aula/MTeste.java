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
public class MTeste {

	private A a;

	private int ent;
	private boolean esperado;

	@Parameters
	public static Collection<Object[]> params() {
		Object matrix[][] = { { -10, true }, { -9, true }, { 0, true }, { 9, true }, { 11, false } };
		return Arrays.asList(matrix);
	}

	@Before
	public void setUp() {
		a = new A();
	}

	public MTeste(int ent, boolean esperado) {
		this.ent = ent;
		this.esperado = esperado;
	}

	@Test
	public void y() {
		assertEquals(esperado, a.m(ent));
	}
}
