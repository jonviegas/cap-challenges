## :computer: Desafios Capgemini
- - -

### :book: Introdução
O desafio consiste de três questões de lógica de programação. Para a realização do desafio, foi utilizada a linguagem Java.
- - -
### :bookmark_tabs: Questões
- #### Questão 01
    Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

- #### Questão 02
  Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
    - Possui no mínimo 6 caracteres.
    - Contém no mínimo 1 digito.
    - Contém no mínimo 1 letra em minúsculo.
    - Contém no mínimo 1 letra em maiúsculo.
    - Contém no mínimo 1 caractere especial. Os   caracteres especiais são: !@#$%^&*()-+ 
  
  \
    Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

- #### Questão 03
  Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

- - -
### :hammer: Build

 Primeiramente clone o projeto utilizando o seguinte comando:
  ``` Linux
  git clone https://github.com/jonviegas/cap-challenges
  ```
  Em seguida, acesse a pasta do projeto:
  ``` Linux
  cd cap-challenges/
  ```
  Agora, crie o arquivo jar utilizando o gerenciador de projetos maven:
  ``` Linux
  mvn clean package
  ```
  Finalmente, rode a aplicação:
  ``` Linux
  java -jar target/desafios-capgemini-1.0-SNAPSHOT.jar
  ```
- - -
### :arrow_forward: Aplicação
  A aplicação desenvolvida para esse desafio fornece um CLI onde é disponibilizado um menu interativo em que o usuário pode acessar uma das três questões e testar a solução com as entradas que desejar.


