package aula;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ATest {

	@Mock // Definindo o atribudo como Mock
	A a = null;

	@Before
	public void setUp() throws NullPointerException, Exception {
		a = mock(A.class);
	}

	// Exercício 1
	@Test
	public void testOne() throws NullPointerException, Exception {
		when(a.calc(2, 2)).thenReturn(4);

		assertEquals(4, a.calc(2, 2));
	}

	@Test
	public void testTwo() throws NullPointerException, Exception {
		when(a.calc("x", "y")).thenReturn("xy");

		assertEquals("xy", a.calc("x", "y"));
	}

	@Test(expected = NullPointerException.class)
	public void testThree() throws NullPointerException, Exception {
		when(a.calc(null, "y")).thenThrow(new NullPointerException());

		assertEquals(null, a.calc(null, "y"));
	}

	@Test(expected = Exception.class)
	public void testFour() throws NullPointerException, Exception {
		when(a.calc("2", 2)).thenThrow(new Exception());

		assertEquals(null, a.calc("2", 2));
	}

	// Exercício 2
	@Test(expected = Exception.class)
	public void testFive() {
		doThrow(new Exception("Exceção")).when(a).msg(anyString());
	}

	// Exercício 3
	@Test
	public void testSix() {
		when(a.area(2)).thenCallRealMethod();

		a.area(2);

		verify(a, times(1)).pi();
	}

	// Exercício 4
	@Test
	public void testSeven() {
		when(a.pow()).thenCallRealMethod();

		a.pow();

		verify(a, times(2)).pi();
	}

	// Exercício 5
	@Test(expected = NullPointerException.class)
	public void incTest() {
		when(a.inc()).thenReturn(1, 2, 3, 4).thenThrow(new NullPointerException("Além do limite"));
		while (true) {
			System.out.println(a.inc());
		}
	}
}
