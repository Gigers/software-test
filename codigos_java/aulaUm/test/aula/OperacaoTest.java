package aula;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperacaoTest {

	private Operacao operacao;

	/** Método chamado antes de realizar cada um dos testes **/
	@Before
	public void setUp() {
		operacao = new Operacao();
	}

	/** Método chamado após a realização de cada um dos testes **/
	@After
	public void tearDown() {
		operacao = null;
	}

	/**	Teste de potência **/
	@Test
	public void testPower() {
		assertEquals("Teste 1 - Potencia", 8, operacao.potencia(2, 3), 0.0);
		// Erro
		assertEquals("Teste 1.1 - Potencia", 2, operacao.potencia(512, 0), 0.0);
	}

	/**	Teste de divisão **/
	@Test
	public void testDivision() {
		assertEquals("Teste 2 - Divisão", 2, operacao.divisao(4, 2), 0.0);
		assertEquals("Teste 2.1 - Divisão", 0, operacao.divisao(0, 2), 0.0);
	}
}
