package aula;

public class Principal {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println(Operacao.class);

		// Testando cria��o de objeto sem **new**
		Operacao op = Operacao.class.newInstance();
		
		System.out.println(op.add(1, 2));
	}
}
