### Exercícios Aula 59 - Kotlin Orientado a Objetos

<hr>

1. Definir e inicializar uma nova lista vazia. Adicionar os seguintes
   elementos à lista vazia: [1,5,5,6,7,8,8,8]. Imprimir o resultado na tela.


2. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes
   elementos ao conjunto vazio: {1,5,5,6,7,8,8,8}. Imprimir o resultado na
   tela. Qual é a diferença entre este exercício e o anterior?

3. Escreva uma aplicação de dicionário com três funções:
   ○ adicionar um termo ao dicionário
   ○ procurar um termo no dicionário
   ○ listar todos os termos existentes em ordem alfabética.

4. Faça um programa onde o usuário deverá adicionar primeiramente
   seu nome, seguido de sua profissão(nome e profissão são variáveis
   diferentes). O usuário deverá inserir um valor com duas casas
   decimais, equivalente ao salário de um habitante em SimCity para
   cada mês do ano. Calcule e mostre o valor que este habitante deve
   pagar de imposto referente a cada mês do seu salário, segundo a
   tabela abaixo.

| RENDA              | TAXA DE IMPOSTO |
|:------------------|:---------------:|
| de 0.00 a 2000.00    |     Isento     |
| de 2001.00 a 3000.00 |    8%     |
| de 3001.00 a 4500.00 |    18%    |
| acima de 4500.00 |    28%   |


Lembre-se: seu sistema deverá disponibilizar um menu para o usuário com
as opções de:
● cadastrar o nome do habitante e sua profissão.
● mostrar informações cadastradas(nome e profissão) de um
habitante.
● mostrar salários cadastrados(12 salários respectivos de cada mês).
● calcular o imposto de cada mês.
● fornecer a opção de sair do sistema

5. Considere um aluno como um conjunto de atributos, entre eles,
   matrícula, nome, data de nascimento e sexo.
   Crie a classe Aluno com os atributos acima e crie a classe Turma que
   permita:
   ○ Cadastrar alunos sem matrícula repetida;
   ○ Listar todos os alunos;
   ○ Listar os alunos com o sobrenome informado;
   ○ Listar o nome do aluno mais idoso;
   ○ Listar a média de idade os alunos;
   ○ Atualizar os dados de um aluno, pesquisando por matrícula;
   ○ Remover os dados de um aluno, pesquisando por matrícula;

6. A SaveTheRoupa S.A. é uma empresa que deseja implementar um
   sistema informatizado de guarda-volumes de nível mundial. O
   sistema permite que uma pessoa guarde seus pertences no
   guarda-volumes e depois os retire de maneira simples, bastando
   apenas apresentar o número de identificação recebido.
   Os pertences são representados no sistema por algo abstrato
   chamado peça, que tem marca e modelo.

● Criar a classe abstrata Peca, que contenha os atributos marca e
modelo, ambas de tipo String e um método abstrato chamado retirada.

● Criar a classe GuardaVolumes, que contenha como atributo um
dicionário e um contador que será utilizado como
identificador. As chaves do dicionário serão Integer e, como
valor, haverá uma lista de peças

○ Criar o método guardarPecas(listaDePeca:
ArrayList<Peca>): Int na Classe GuardaVolumes, que
recebe uma lista de peças adiciona essa lista de peças
em nosso dicionário e retorna o número de identificação,
ou seja, a chave do dicionário onde guardamos as peças,
que neste caso é o nosso contador

○ Criar o método mostrarPecas() na Classe GuardaVolumes,
que imprime na tela todas as peças que estão no
guarda-volumes, junto com o número correspondente

○ Criar o método mostrarPecas(numero: Int) na classe
GuardaVolumes, que imprima as peças que estão
associadas ao número recebido

○ Criar o método devolverPecas(numero: Int) na Classe
GuardaVolumes, que remova a lista de peças que está
associada ao número recebido.

● No arquivo Main, criar um cenário em que alguém guarda duas
peças, recebe o código e depois retira suas peças.

● Observação: o sistema deverá ser dinâmico, ou seja o usuário irá
inserir as informações necessárias.
