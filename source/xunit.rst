.. _Wikipédia: https://pt.wikipedia.org/wiki/Asserção


XUnit
=========================================

**xUnit** é o nome genérico para qualquer estrutura de testes unitários automatizados.

JUnit
---------------------------------------

O **JUnit** é um framework livre, escrito para facilitar o processo de desenvolvimento de testes unitários, caixa branca, na linguagem **Java**.

* **Anotações**

O JUnit apresenta algumas anotações que poderão ser utilizadas no código **Java**. Veja algumas anotações presentes no **JUnit**

- **@Test**: Método que será chamado ao executar a classe de teste;

- **@BeforeClass**: Método chamado antes de todos os demais elementos da classe de teste;

- **@AfterClass**: Método chamado após a execução de todos os demais elementos da classe de teste;

- **@Before**: Método chamado antes da execução de um teste
    - É interessante notar que, caso haja 5 métodos de teste, este método será chamado cada uma das vezes antes do teste ser executado;
    
    - É bastante utilizado para instânciar classes ou preencher atributos que serão utilizados pelos testes.

- **@After**: Método chamado após a execução de um teste
    - Bastante utilizado para realizar a limpeza de recursos alocados (Classes, atributos, etc).

- **@Ignore**: Os métodos marcados com o **@Ignore** serão desconsiderados nos testes.
    - Muito utilizado quando algum teste ainda não está pronto.

.. NOTE::
    Algumas informações relevantes:
    
    - Os métodos marcados com estas anotações devem ser públicos;

    - Os método utilizados com as anotações **@BeforeClass** e **AfterClass** devem ser estáticos, fora estes, todos os demais não podem ser estáticos; 

    - Na classe de teste, pode haver métodos que não possuem anotações.

* **Classe Assert**

Classe com diversos métodos estáticos para a realização de asserções.

.. NOTE::
    Em computação, asserção (em inglês: *assertion*) é um predicado que é inserido no programa para verificar uma condição que o desenvolvedor supõe que seja verdadeira em um determinado ponto. `Wikipédia`_



PyUnit (unittest)
---------------------------------------

Assim como o **JUnit** o **PyUnit** ou **unittest** é um framework criada para facilitar o processo de criação de testes unitários, esta porém, para a linguagem **Python**.
