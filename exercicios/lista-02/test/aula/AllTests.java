package aula;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ AreaQuadradaTest.class, AreaQuadradoExceptTest.class, IsNumberTest.class, TimerTestOne.class })
public class AllTests {
	// Para o suite test a classe não irá importar e sim as anotações.
}
