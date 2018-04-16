package aula;

public class A {
	public A() {
	}

	public A(Object obj) throws Exception {
		if (!(obj instanceof Number)) {
			throw new Exception("Precisa ser um número!");
		}
	}

	public void f(int nro) {
		while (nro-- > 0)
			;
	}

	// Verificar o que eu posso fazer para realizar o teste deste método
	public void g(int nro) throws Exception {
		if (nro > 10) {
			throw new Exception("Valor maior que 10");
		}
		while (nro-- > 0)
			;
	}

	boolean isImpar(int nro) {
		return nro % 2 == 1 ? true : false;
	}

	protected int maior(int x, int y) {
		return x < y ? y : x;
	}

	private int dobro(int nro) {
		return nro * 2;
	}

	public static int diff(int x, int y) {
		return x - y;
	}

	public int mod(int x, int y) {
		return x % y;
	}

	public class C {
		public int soma(int x, int y) {
			return x + y;
		}
	}

}
