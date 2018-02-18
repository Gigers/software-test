package aula;

public class Operacao {
	public double potencia(int a, int b) {
		return Math.pow(a, b);
	}

	public double divisao(int a, int b) {
		try {
			return a / b;
		} catch (Exception e) {
			return 0;
		}
	}
}
