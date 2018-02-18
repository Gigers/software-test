package aula;

import java.util.concurrent.TimeUnit;

public class Operacao {
	public int loopInfinito() {
		try {
			System.out.println("antes");
			// Sleep por 3 segundos
			TimeUnit.SECONDS.sleep(3);
			System.out.println("após");
		} catch (Exception e) {
			System.out.println("Exceção: " + e.getMessage());
		}
		return 1;
	}

	public double divisao(int a, int b) {
		return a / b;
	}
	
	public boolean isPar(int nro) {
		return nro % 2 == 0;
	}
}
