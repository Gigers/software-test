package aula;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Primeiro {

	// Executado depois de cada teste
	@After
	public void a() {
		System.out.println("a");
	}

	// Executado antes de cada teste
	@Before
	public void b() {
		System.out.println("b");
	}

	// Executado depois de tudo ser finalizado
	@AfterClass
	public static void c() {
		System.out.println("c");
	}

	// Executado antes de tudo ser iniciado (Até mesmo o contrutor)
	@BeforeClass
	public static void d() {
		System.out.println("d");
	}

	// Teste
	// Será ignorado
	@Ignore
	@Test
	public void e() {
		System.out.println("e");
	}

	// Teste
	@Test
	public void f() {
		System.out.println("f");
	}

	// Teste
	@Test
	public void g() {
		System.out.println("g");
	}
}
