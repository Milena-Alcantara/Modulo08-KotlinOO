### Aula 57 - Kotlin Orientado á Objetos

<hr>

**Exercicios para fixação do conteúdo apresentado**

1. Crie uma hierarquia de classes para uma loja que venda livros, CDs e
   DVDs.
   Sobrescreva o método mostrarDetalhesDoItem para que imprima:
- Para livros: nome, preço e autor;
- Para CDs: nome, preço e número de faixas;
- Para DVDs: nome, preço e duração.

Evite ao máximo repetição de código. Em seguida, crie uma classe Loja
com o método main() que adicione 5 produtos diferentes (a sua escolha) a
um vetor e, por fim, imprima o conteúdo do vetor.

Modifique o código do programa anterior, da seguinte forma:
a) Adicione um atributo que represente o código de barras do
produto (é um valor obrigatório e, portanto, deve ser pedido no construtor);
b) Sobrescreva o método equals() retornando true se dois produtos
possuem o mesmo código de barras;
c) Na classe Loja, implemente um simples procedimento de busca
que, dado um produto e um vetor de produtos, indique em que posição do
vetor se encontra o produto especificado ou imprima que o mesmo não foi
encontrado;
d) No método Loja.main(), após a impressão do vetor (feita na
questão anterior, escolha um dos 5 produtos e crie duas novas instâncias
idênticas a ele: uma com o mesmo código de barras e outra com o código
diferente


2. Implemente uma classe abstrata de nome Forma onde são
   declarados dois métodos abstractos:
- calcularArea(): Float
- calcularPerimetro(): Float

Crie, como subclasse de Forma, uma classe de nome Rectangulo cujas
instâncias são caracterizadas pelos atributos lado e altura ambos do tipo
Float. Implemente na classe Rectangulo os métodos herdados de Forma e
outros que ache necessários.

Crie, como subclasse de Forma, uma classe de nome Circulo cujas
instâncias são caracterizadas pelo atributo raio do tipo Float. Implemente
na classe Circulo os métodos herdados de Forma e outros que ache
necessários.

Crie, como subclasse de Rectangulo, uma classe de nome Quadrado cujas
instâncias são caracterizadas por terem os atributos lado e altura com o
mesmo valor.

Elabore um programa de teste onde é declarado um array, de dimensão 5..
Nesse array devem ser guardadas instâncias de Rectangulo, Circulo e
Quadrado seguindo uma ordem aleatória.
Depois implemente um ciclo que percorra o array invocando,
relativamente a cada um dos objectos guardados, os métodos calcularArea
e calcularPerimetro