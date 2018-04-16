package aula;

import org.junit.Before;
import org.junit.Test;

public class TimerTestOne {

	private Operacao op;

	@Before
	public void setUp() {
		op = new Operacao();
	}

	@Test(timeout = 1100)
	public void testTimerOne() throws InterruptedException {
		op.timer(1);
	}

	@Test(timeout = 3100)
	public void testTimerTwo() throws InterruptedException {
		op.timer(3);
	}
}
