package aula;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

import java.util.Collections;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SenaTest {

	private Sena sena;

	// Criando a regra do exercício e
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void setUp() {
		sena = new Sena();
	}

	// Teste que verifica se o tamanho da lista é 6
	@Test
	public void hasSizeTest() throws Exception {
		assertThat(sena.getSena(6), hasSize(6));
	}

	// Verifica se os itens (Todos) da lista estão entre 1 e 60
	@Test
	public void everyItemHaveTest() throws Exception {
		assertThat(sena.getSena(10), everyItem(allOf(greaterThanOrEqualTo(1), lessThanOrEqualTo(60))));
	}

	@Test
	public void sortTest() throws Exception {

		List<Integer> result = sena.getSena(10);
		List<Integer> resultDois = result;

		assertThat(result, sortTheSort(resultDois));
	}

	@Test
	public void frequencyTest() throws Exception {
		// Ficará aqui para visualizar o retorno
		List<Integer> result = sena.getSena(10);
		System.out.println(result);

		assertThat(result, searchDuplicated());
	}

	@Test
	public void nullExceptTest() throws Exception {

		// Com a regra criada, façamos a configuração do expected
		// Aqui estou dizendo que espero uma Exception.class
		thrown.expect(Exception.class);

		sena.getSena(null);

	}

	@Test
	public void testExceptMessageOne() throws Exception {
		// Configuro
		thrown.expect(Exception.class);
		// Verifico se a mensagem contém a string
		thrown.expectMessage(containsString("Mínimo 6"));

		sena.getSena(5);
	}

	/*
	 * No caso do teste com 12, não haverá exceção, pois a exceção ocorre com
	 * valores acima deste, não iguais ou acima (>= 12) Verificar com o professor
	 * sobre.
	 */
	@Test
	public void testExceptMessageTwo() throws Exception {
		// Configuro
		thrown.expect(Exception.class);
		// Verifico se a mensagem contém a string
		thrown.expectMessage(containsString("Máximo 12"));

		sena.getSena(12);
	}

	// Matcher para verificar se os elementos da lista estão ordenados
	/*
	 * Macther do exercício c Este matcher recebe dois parâmetros: - suposicao -
	 * Valor inserido ao chamar o método - Neste caso: sortTheSort(result) -
	 * arrTeste - Valor recebido na comparação do assertThat - Neste caso: result
	 */
	private TypeSafeMatcher<List<Integer>> sortTheSort(List<Integer> suposicao) {
		return new TypeSafeMatcher<List<Integer>>() {

			@Override
			public void describeTo(Description arg0) {
				arg0.appendText("Os itens não estão ordenados");

			}

			@Override
			protected boolean matchesSafely(List<Integer> arrTeste) {
				// Faz o sort da lista de suposicao
				/*
				 * Ou seja, aqui suponho que a lista não está ordenada assim ordeno ela e
				 * comparo
				 */
				Collections.sort(suposicao);

				// Fiquei com dúvida sobre o tipo de dado
				// Perguntar ao professor sobre
				// Pois se eu apenas faço o sort, referência não deixa uma
				// comparação com equals
				for (int index = 0; index < arrTeste.size(); index++) {
					if (suposicao.get(index) != arrTeste.get(index)) {
						return false;
					}
				}
				return true;
			}

		};
	}

	// Macther do exercício d
	// Recebe apenas o valor testado no assertThar
	// - Neste caso result
	private BaseMatcher<List<Integer>> searchDuplicated() {
		return new TypeSafeMatcher<List<Integer>>() {

			@Override
			public void describeTo(Description arg0) {
				arg0.appendText("Há elementos duplicados na lista");
			}

			// O sena utiliza o random, por isso as vezes o método
			// duplica elementos. Falar com o professor sobre isso!
			@Override
			protected boolean matchesSafely(List<Integer> arg0) {
				// Verifica a frequência, caso seja maior que 1
				// retorna falso
				for (Integer value : arg0) {
					int frequency = Collections.frequency(arg0, value);
					if (frequency > 1) {
						return false;
					}
				}
				return true;
			}
		};
	}
}
