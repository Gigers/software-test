package aula;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isIn;
import static org.junit.Assert.assertThat;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

public class Teste {

	@Test
	public void isTest() {
		assertThat(0, is(0));
	}

	@Test
	public void notTest() {
		assertThat(2, not(1));
	}

	// Verifica se é maior que
	// Neste caso, 5 é maior que dois ?
	@Test
	public void greaterThanTest() {
		assertThat(5, greaterThan(2));
	}

	/*
	 * Verifica se o resultado faz 'mtatch' com algum dos valores testados Neste
	 * caso os valores testados são: 0, 1, 2
	 */
	@Test
	public void eitherTest() {
		assertThat((int) (Math.random() * 3), either(is(0)).or(is(1)).or(is(2)));
	}

	// Verifica se tem a string
	@Test
	public void containsStringTest() {
		assertThat("A casa é bela", containsString("é"));
	}

	// O teste verifica se qualquer um dos matchers é verdadeiro
	@Test
	public void anyOfTest1() {
		assertThat("A casa é bela", anyOf(containsString("é"), containsString("ã")));
	}

	/*
	 * Teste teste valida quando o input é ingual a qualquer um dos valores testados
	 * Neste caso os valores testedados são: 0, 1, 2
	 */
	@Test
	public void anyOfTest2() {
		assertThat((int) (Math.random() * 3), anyOf(equalTo(0), equalTo(1), equalTo(2)));
	}

	/*
	 * O allOff é o contrário do anyOf, ele requer que todos os valores testados
	 * sejam verdade ou seja, neste caso ele requer que a string tenha 'é' e 'ã'
	 * Porém há um not, e este irá fazer a lógica reversa, ou seja, quando true ele
	 * retornará falso e isso vale para o inverso
	 */
	@Test
	public void allOfTest() {
		assertThat("A casa é bela", not(allOf(containsString("é"), containsString("ã"))));
	}

	// Verifica se o valor é uma instancia de Number
	@Test
	public void instanceOfTest() {
		assertThat(12.5, instanceOf(java.lang.Number.class));
	}

	// Verifica se a lista tem o tamanho de 3
	@Test
	public void hasSizeTest() {
		java.util.List<Integer> lista = java.util.Arrays.asList(5, 2, 4);
		assertThat(lista, hasSize(3));
	}

	// Verifica se o valor 2 está na lista
	@Test
	public void isInTest() {
		java.util.List<Integer> lista = java.util.Arrays.asList(5, 2, 4);
		assertThat(2, isIn(lista));
	}

	// Verifica se todos os itens da lista são maiores que 1
	@Test
	public void everyItemTest() {
		java.util.List<Integer> lista = java.util.Arrays.asList(5, 2, 4);
		assertThat(lista, everyItem(greaterThan(1)));
	}
	
	// Verifica o segundo caracter
	@Test
	public void segundoCaracterTest() {
		assertThat("abcde", segundoCaracter('b'));
	}
	
	// Verifica o caracter da posição 4
	@Test
	public void anyCaracterTest() {
		assertThat("abcde", anyCaracter('e', 4));
	}

	/*
	 * Abaixo são criados dois matchers, para verificação do segundo caracter de um
	 * string e o outro para verificar o caracter de qualquer posição da string
	 */
	private TypeSafeMatcher<String> segundoCaracter(char comparacao) {
		return new TypeSafeMatcher<String>() {

			// Este describeTo é chamado quando o matchesSafely retorna false
			@Override
			public void describeTo(Description arg0) {
				arg0.appendText("O segundo caractere não é igual a " + comparacao);

			}

			// Criando um matcher
			// Neste caso verifica a segunda letra da string
			// Irá comparar o input com o char de comparacao
			@Override
			protected boolean matchesSafely(String arg0) {
				if (arg0.length() < 2) {
					return false;
				}
				if (arg0.charAt(1) != comparacao) {
					return false;
				}
				return true;
			}

		};
	}

	// Verifica se a string tem um certo char em uma determinada posição
	private TypeSafeMatcher<String> anyCaracter(char comparacao, int index) {
		return new TypeSafeMatcher<String>() {
			
			// Descrição caso haja erro
			@Override
			public void describeTo(Description arg0) {
				arg0.appendText("Os valores comparados não são iguais");

			}

			// Matcher
			@Override
			protected boolean matchesSafely(String arg0) {
				if (arg0.length() < index + 1) {
					return false;
				}
				if (arg0.charAt(index) != comparacao) {
					return false;
				}
				return true;
			}

		};
	}

}
