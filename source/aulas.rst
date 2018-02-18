Aulas
=========================================

.. _repositório: https://github.com/Gigers/software-test

Aqui há o descritivo de cada uma das aulas

.. NOTE::
    Os códigos feitos ficarão disponíveis neste `repositório`_


Aula 1
---------------------------------------
Nesta primeira aula foi realizado a apresentação da matéria e do professor, além de que, conceitos básicos começaram a ser discutidos, sendo esses:

* **Test Driven Development** (TDD)
    Forma de desenvolvimento, onde o processo de desenvolver é orientado a diversos casos de teste.

* Testes unitários
    São testes que visam realizar testes de unidade, que no caso de sistemas orientados a objetos, são as classes, testadas de forma isolada (Sem interação com outras classes), onde geralmente é simulado uma entrada e se espera uma determinada saída.
    
    Este é um teste de responsabilidade do programador, que deve realizar os testes após codificar uma nova classe. Isso facilita o teste da classe como um todo, evitando que pequenos erros fiquem dificeis de serem identificados. 


A cadeia de teste aos quais um programa pode ser submetido normalmente segue a ideia de iniciar os testes nas menores partes do sistema até chegar ao todo.


.. TIP::

    Lembre-se, os testes devem ser documentados e reproduzíveis, além de apresentar algumas características, como as vistas abaixo:
        - Simplicidade;
        - Estabilidade;
        - Compreensão.

Como citado, os testes unitários utilizam as menores unidades do projeto para fazer os testes, que como visto, em projetos orientados a objetos são as classes. Porém é necessário percebermos que nem todas as classes precisam ser testadas, por isso, ao iniciar a escrita dos testes unitários é importante saber quais serão as classes testadas, e além disso, saber o que testar.

Uma dica que ajuda a entender **o que testar** é utilizar as condições de contorno, ou de limite, por exemplo::
    Há um método para verificar se uma pessoa é menor de idade, não é necessário testar todas as possibilidades, teste apenas aquelas limites, que neste caso serão as idades 17, 18 e 19.

    Perceba que o teste será realizado, com uma boa abrangência de entradas e saídas.

Além desta dica há algumas outras

.. TIP::
    - Não realize teste de métodos triviais, **get** por exemplo;
    - O **set** deverá ser testado apenas quando faz verificações nos dados;
    - Teste apenas as condições necessários, como visto no exemplo anterior.

.. NOTE::
    Um bom teste é aquele que consegue identificar problemas ainda não identificados, e não necessáriamente o que não tem nenhum erro.


Aula 2
---------------------------------------

