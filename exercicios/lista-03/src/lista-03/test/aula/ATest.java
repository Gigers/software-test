package aula;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import aula.A.C;

public class ATest {

	private A a;

	@Before
	public void setUp() {
		a = new A();
	}

	// teste
	@Test
	public void testOne() throws Exception {
		a.g(5);
	}

	@Test(expected = Exception.class)
	public void testTwo() throws Exception {
		a.g(15);
	}

	@Test
	public void isImparTest() {
		a.isImpar(1);
	}

	@Test
	public void maiorTest() {
		assertEquals(3, a.maior(2, 3));
	}

	// Utilizando reflexão Java
	@Test
	public void dobroTest() {

		try {
			// Recupero o método, utilizando o getDeclaredMethod, passando o nome e o tipo
			// de seu parâmetro
			Method metodoDobro = A.class.getDeclaredMethod("dobro", int.class);

			// Muda a visibilidade
			metodoDobro.setAccessible(true);

			// Chamo o método passando um objeto do tipo A e o valor a ser introduzido no
			// método
			int r = (int) metodoDobro.invoke(a, 2);

			// Verifica o resultado
			assertEquals(r, 4);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void construtorOne() throws Exception {
		// A test = new A(12.5);

		// assertTrue(test instanceof A);
		// Outra forma de testar (Demonstrada pelo professor)
		assertNotNull(new A(12.5));
	}

	@Test(expected = Exception.class)
	public void construtorTwo() throws Exception {
		// A test = new A("12.5");
		// assertTrue(test instanceof A);
		assertNotNull(new A("12.5"));
	}

	@Test
	public void diffTest() {
		assertEquals(2, A.diff(4, 2));
	}

	@Test
	public void testClasseInterna() {
		C c = a.new C();

		assertEquals(4, c.soma(2, 2));
	}

	// Teste do exerc�cio 9
	@Ignore
	@Test
	public void testTerceiro() {
		System.out.println("Primeiro");
		// Mensagem - Esperado - Valor testado
		assertEquals("11 % 2 == 1", 1, a.mod(11, 2));
		System.out.println("Segundo");
		assertEquals("11 % 4 == 2", 2, a.mod(11, 4));
		System.out.println("Terceiro");
		assertEquals("11 % 3 == 2", 2, a.mod(11, 3));
	}
}
