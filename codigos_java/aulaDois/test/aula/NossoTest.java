package aula;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// RunWith Parte do passo 11 da aula
@RunWith(Parameterized.class)
public class NossoTest {

	// PASSO 3 da aula
	// Chamado antes de todos os elementos desta classe
	// Até mesmo do construtor
	// @BeforeClass
	// public static void inicio() {
	// System.out.println("Método inicio");
	// }

	// Chamada depois de todos os elementos desta classe
	// @AfterClass
	// public static void fim() {
	// System.out.println("Método fim");
	// }

	// Chamado antes de cada teste
	// @Before
	// public void antes() {
	// System.out.println("Método antes");
	// }

	// Chamado depois de cada teste
	// @After
	// public void depois() {
	// System.out.println("Método depois");
	// }

	// Teste 1
	// @Test
	// public void test1() {
	// System.out.println("Método test1");
	// }

	// Teste 2 - Está sendo ignorado
	// Perceba que no status no JUnit será exibido um skipped
	// @Ignore
	// @Test
	// public void test2() {
	// System.out.println("Método test2");
	// }

	// Teste 3
	// @Test
	// public void test3() {
	// System.out.println("Método test3");
	// }

	// Passo 4 da aula
	/**
	 * fail(): Métodos utilizados para gerar falhas
	 */
	// @Test
	// public void test1() {
	// System.out.println("Método test1: antes");
	// fail("Faz o test1 falhar");
	// System.out.println("Método test1: após");
	// }
	//
	// @Test
	// public void test2() {
	// System.out.println("Método test2: antes");
	// fail();
	// System.out.println("Método test2: após");
	// }

	// Passo 5 da aula
	/**
	 * assertEquals(): Método utilizado para verificar se determinada afirmação é
	 * verdadeira Permite diversas formas de entrada
	 */

	// @Test
	// public void test1() {
	// /*
	// * Parâmetros: mensagem, valor esperado, operação (Valor de entrada), delta
	// * Não apresenta falha, pois será testado o intervalo:
	// * 3.5 < (2.1 + 2.1) < 4.5
	// */
	// assertEquals("Msg test1", 4, 2.1 + 2.1, 0.5);
	// }
	//
	// @Test
	// public void test2() {
	// /*
	// * Apresenta falha, pois será testado o intervalo:
	// * 4 < (2.1 + 2.1) < 4
	// */
	//
	// assertEquals("Msg test2", 4, 2.1 + 2.1, 0);
	// }
	//
	// @Test
	// public void test3() {
	// /*
	// * Parâmetros: mensagem, valor esperado, operação (Valor de entrada)
	// * Apresenta falha, pois será testado
	// * 4 == (3 + 3)
	// */
	// assertEquals("Msg test3", 4, 3 + 3);
	// }
	//
	// @Test
	// public void test4() {
	// /*
	// * Parâmetros: mensagem, valor esperado (Valor de entrada), delta
	// * Não apresenta falha, pois será testado
	// * 3.5 < (2 + 2) < 4.5
	// */
	// assertEquals(4, 2 + 2, 0.5);
	// }
	//
	// @Test
	// public void test5() {
	// /*
	// * Parâmetros: valor esperado, operação (Valor de entrada)
	// * Apresenta falha, pois será testado:
	// * 4 == (3 + 3) */
	// assertEquals(4, 3 + 3);
	// }

	// Passo 6 da aula
	/**
	 * assertTrue() e assertFalse(): Métodos utilizados para verificar se uma
	 * condição é true ou false
	 */

	// @Test
	// public void test1() {
	// /*
	// * Parâmetros: mensagem, condição
	// * Apresenta falha, pois será testado
	// * (8 < 5) == true*/
	//
	// assertTrue("Msg test1", 8 < 5);
	// }
	//
	// @Test
	// public void test2() {
	// /*
	// * Parâmetros: condição
	// * Não apresenta falhas, pois será testado
	// * (8 != 5) == true */
	//
	// assertTrue(8 != 5);
	// }
	//
	// @Test
	// public void test3() {
	// /*
	// * Parâmetros: mensagem, condição
	// * Não apresenta falha, pois será testado
	// * (8 < 5) == false*/
	//
	// assertFalse("Msg test3", 8 < 5);
	// }
	//
	// @Test
	// public void test4() {
	// /*
	// * Parâmetros: condição
	// * apresenta falha, pois será testado
	// * (8 != 5) == false */
	// assertFalse(8 != 5);
	// }

	// Passo 7 da aula
	/**
	 * assertNull() e assertNotNull() são utilizados para conferir se um objeto é
	 * nulo
	 */

	// @Test
	// public void test1() {
	// Object obj = null;
	// /* Parâmetros: mensagem, condição */
	// assertNull("Msg test1", obj);
	// }
	//
	// @Test
	// public void test2() {
	// Object obj = new Object();
	// /* Parâmetros: confição */
	// assertNull(obj);
	// }
	//
	// @Test
	// public void test3() {
	// Object obj = null;
	// // Parâmetros: mensagem, condição
	// assertNotNull("Msg test3", obj);
	// }
	//
	// @Test
	// public void test4() {
	// Object obj = new Object();
	// // Parâmetros: condição
	// assertNotNull(obj);
	// }

	// Passo 8 da aula
	/**
	 * assertSame() e assertNotSame() são utilizados para verificar se dois objetos
	 * referênciam o mesmo objeto
	 */

	// @Test
	// public void test1() {
	// String a = null, b = null;
	// // Parâmetros: mensagem, objeto, objeto
	// assertSame("Msg test1", a, b);
	// }
	//
	// @Test
	// public void test2() {
	// String a = "oi", b = "oi";
	// // Parâmetros: objeto, objeto
	// assertSame(a, b);
	// }
	//
	// @Test
	// public void test3() {
	// Object a = new Object(), b = new Object();
	// assertSame(a, b);
	// }
	//
	// @Test
	// public void test4() {
	// String a = null, b = null;
	// // Parâmetros: mensagem, objeto, objeto
	// assertNotSame("Msg test4", a, b);
	// }
	//
	// @Test
	// public void test5() {
	// String a = "oi", b = "oi";
	// // Parâmetros: condição
	// assertNotSame(a, b);
	// }
	//
	// @Test
	// public void test6() {
	// Object a = new Object(), b = new Object();
	// assertNotSame(a, b);
	// }

	// Passo 9 da aula
	/**
	 * assertArrayEquals() é utilizado para conferir se dois arrays possuem o mesmo
	 * conteúdo
	 */

	// @Test
	// public void test1() {
	// String[] a = {"um", "dois"}, b = {"três", "quatro"};
	// assertArrayEquals("Msg test1", a, b);
	// }
	//
	// @Test
	// public void test2() {
	// String[] a = {"um", "dois"}, b = {"um", "dois"};
	// assertArrayEquals(a, b);
	// }

	// Passo 10 da aula
	/**
	 * Teste de condições de timeout e exceção
	 * 
	 * @Test(timeout=1000) O teste irá falhar caso ele dure mais de um segundo
	 * @Test(expected=Exception) O teste irá falhar caso ele não lance a exceção
	 *                           esperada ou um subtipo dela
	 */

	// private Operacao op;
	//
	// @Before
	// public void setUp() {
	// // Chamando antes de cada @Test
	// op = new Operacao();
	// }
	//
	// // Espera 1 segundo
	// @Test(timeout = 1000)
	// public void test1() {
	// // Este falha pois dura mais que 1 segundo
	// assertEquals("Msg test1", 1, op.loopInfinito());
	// }
	//
	// // Espera 4 segundos
	// @Test(timeout = 4000)
	// public void test2() {
	// assertEquals("Msg test2", 1, op.loopInfinito());
	// }
	//
	// @Test
	// public void test3() {
	// // Este teste falha porque o método retorna uma exceção
	// // e o teste espera um valor numérico
	// assertEquals(1.25, op.divisao(5, 0), 0);
	// }
	//
	// @Test(expected = ArithmeticException.class)
	// public void test4() {
	// // Este teste não falha porque o método lança ArithmeticException
	// assertEquals(1.25, op.divisao(5, 0), 0);
	// }
	//
	// @Test(expected = Exception.class)
	// public void test5() {
	// // Este teste não falha porque Exception é um super tipo para
	// // ArtithmeticExcception
	// assertEquals(1.25, op.divisao(5, 0), 0);
	// }
	//
	// @Test(expected = Exception.class)
	// public void test6() {
	// // Este teste falha porque NÃO lança Exception
	// assertEquals(1.25, op.divisao(5, 4), 0);
	// }

	// Passo 11 da aula
	private int entrada;
	private boolean esperado;
	private Operacao op;

	@Before
	public void setUp() {
		op = new Operacao();
	}

	/*
	 * Construtor que revebe cada elemento do array retornado pelo método parametros
	 */
	public NossoTest(int entrada, boolean esperado) {
		this.entrada = entrada;
		this.esperado = esperado;
	}

	@Parameterized.Parameters
	public static Collection parametros() {
		return Arrays.asList(new Object[][] { { 1, false }, { 2, true }, { 5, false }, { 10, true }, { 0, false } });
	}

	/*
	 * Este teste será chamado n vezes, sendo que n representa a quantidade de
	 * elementos dentro do array do método marcado com @Parameterized.Parameters
	 */
	@Test
	public void test1() {
		System.out.println("Testando: " + entrada);
		assertEquals(esperado, op.isPar(entrada));
	}

}
