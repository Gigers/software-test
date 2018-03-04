package aula;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// A classe precisa ser anotada com este @RunWith
@RunWith(Parameterized.class)
public class NossoTest {

	// Atributos para guardar os valores de entrada
	private int entrada;
	private boolean esperado;
	// ---
	private Operacao op;

	@Before
	public void initialize() {
		op = new Operacao();
	}

	// Construtor que consegue receber cada um dos parâmentros presentes
	// no array de parâmentros
	public NossoTest(int entrada, boolean esperado) {
		this.entrada = entrada;
		this.esperado = esperado;
	}
	
	// Método com que retorna o array de parâmentros que deverá ser utilizado
	// durante os testes. São esses que serão passados para o construtor
	@Parameterized.Parameters
	public static Collection parametros() {
		return Arrays.asList(new Object[][] {
			// Entrada, esperado
			{1, false},
			{2, true},
			{5, false},
			{10, true},
			{0, false}
		});
	}
	
	// Realizando o teste
	// Veja que serão realizados 5 testes, que correspondem a cada um dos elementos
	// do array que criamos nos parametros
	@Test
	public void test1() {
		System.out.println("Testando: " + entrada);
		assertEquals(esperado, op.isPar(entrada));
	}
}
