### Aula 56 - Kotlin Orientado á Objetos

<hr>

**Exercícios voltados a fixação do conteúdo aprendido:** _Classes_, _Objetos_, _Herança_, _Override_ e 
_Overload_

**ENUNCIADOS**

1. Construa um sistema para supermercados onde o cliente possa
   registrar 3 ou mais tipos de produtos diferentes onde, cada produto
   tenha nome, código de barras e data de validade. Crie alguns objetos
   exemplo e mostre os produtos cadastrados.


2. Elabore um sistema para biblioteca no qual a pessoa bibliotecária
   possa registrar pelo menos 3 tipos diferentes de gêneros de livros, o
   nome do livro e a pessoa autora do livro. Crie alguns livros exemplo e
   mostre em tela as informações de cada livro criado.


3. Elabore um programa de controle de times para o estado onde você
   mora, esse programa deve permitir o registro do nome do time,
   quantas pessoas jogadores o time tem, quantas vitórias o time teve
   até o momento esse ano (2022) e qual o esporte que o time joga. Crie
   alguns objetos exemplo e mostre em tela as informações de cada
   time criado.


4. Crie um sistema de controle de Recursos Humanos (RH) no qual a
   pessoa usuária possa registrar 3 ou mais perfis de funcionários onde
   cada funcionário tem nome completo, setor, salário e data de admissão.
   Crie alguns objetos exemplo e mostre em tela as informações de cada
   funcionário criado.


5. Construa um sistema para petshop onde o cliente pode registrar o
   nome, raça e responsável de cachorro, gato e passarinho.
   Cada animal deve ter os métodos para se movimentar, comer e
   dormir.
   Para o cachorro, considere o seguinte:
- Quando o cachorro se movimentar, deve aparecer a
  mensagem: “Andando em 4 patas”.
- Quando o cachorro comer, deve aparecer a mensagem: “Comendo bife”.
- Quando o cachorro dormir, deve aparecer a mensagem:
  “Dormindo na cama da Jéssica”.
  Para o gato, considere o seguinte:
- Quando o gato se movimentar, deve aparecer a mensagem:
  “Andando e saltando em 4 patas”.
- Quando o gato comer, deve aparecer a mensagem: “Comendo
  whiskas sachê”.
- Quando o gato dormir, deve aparecer a mensagem:
  “Dormindo na caixa”.
  Para o peixe, considere o seguinte:
- Quando o peixe se movimentar, deve aparecer a mensagem:
  “Nadando”
- Quando o peixe comer, deve aparecer a mensagem:
  “Comendo ração molhada”
- Quando o peixe dormir, deve aparecer a mensagem:
  “Dormindo de olho aberto”.

  Crie dois objetos para cada tipo de animal, chame cada um dos métodos
  para cada objeto criado e mostre em tela cada um dos resultados obtidos.

6. Crie um sistema bancário de criação de contas, onde a pessoa possa
   criar uma conta salário ou uma conta poupança ou conta corrente.
   Cada conta deve ter os métodos depósito, saque e saldo.

● Para a conta salário, considere o seguinte:
- O saldo deve começar no valor de um salário mínimo brasileiro
  (valor vigente do ano de 2022).
- A pessoa não pode fazer um saque que deixe o saldo menor
  do que R$0,00. Por exemplo: a pessoa tem um saldo de
  R$500.00 e tenta sacar R$ 550,00, o sistema deve apresentar
- “Saldo insuficiente”.
- Se a pessoa atender as condições de fazer o saque, o
  saldo deve ser atualizado conforme a operação e o
  novo saldo deve ser mostrado em tela.
- Para depósito, o sistema deve perguntar se quem está a fazer
  o depósito é a pessoa EMPREGADORA.
- Se sim, pode realizar o depósito, o saldo deve ser
  atualizado de acordo com a operação e o novo saldo
  deve ser mostrado em tela.
- Caso contrário, deve apresentar a seguinte mensagem
  em tela “Conta Salário só pode receber depósito do
  empregador”.

● Para a conta poupança, considere o seguinte:
- O saldo deve começar sempre zerado, ou seja, em R$ 0,00.
- A pessoa não pode fazer um saque que deixe o saldo menor
  do que R$0,00. Por exemplo: a pessoa tem um saldo de
  R$500.00 e tenta sacar R$ 550,00, o sistema deve apresentar
  “Saldo insuficiente”.
- Para depósito, o sistema deve perguntar se quem está fazendo
  o depósito é a pessoa USUÁRIA ou a E.
- Se sim, pode realizar o depósito e o saldo deve ser
  atualizado de acordo com a operação.
- Caso contrário, deve apresentar a seguinte mensagem
  em tela “Conta Poupança só pode receber depósito do USUÁRIO”.

● Para a conta corrente, considere o seguinte:
- O saldo deve começar de acordo com o valor que a pessoa
  usuária informar.
- A pessoa pode fazer um saque que deixe o saldo menor do
  que R$0,00. Por exemplo: a pessoa tem um saldo de R$500.00
- e tenta sacar R$ 550,00, o sistema deve permitir, o saldo deve
  ser atualizado de acordo com a operação e exibir em tela o
  novo saldo.
- Para depósito, a pessoa não pode fazer um depósito cujo valor
  seja maior que R$5.000,00, se a pessoa tentar fazer essa
  operação, deve aparecer a mensagem: “Operação inválida,
  procure a sua agência.”.
- Caso a pessoa tente fazer um depósito menor do que R$
  5.000,00 o saldo deve ser atualizado de acordo com a
  operação e o novo saldo deve ser mostrado em tela.

Crie dois objetos para cada tipo de conta, faça duas operações de
cada tipo e mostre em tela cada um dos resultados obtidos.
