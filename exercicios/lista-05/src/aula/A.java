package aula;

public abstract class A {
	public long fatorial(long n) {
		if (n <= 1) {
			return 1;
		}
		return n * fatorial(n - 1);
	}

	public abstract Object calc(Object x, Object y) throws NullPointerException, Exception;

	public void msg(String txt) {
	}

	public double area(double r) {
		return 2 * pi() * r;
	}

	public double pi() {
		return Math.PI;
	}

	public double pow() {
		return pi() * pi();
	}

	public abstract int inc();
}
