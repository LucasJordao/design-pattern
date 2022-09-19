## :thought_balloon: Design Pattern com Quarkus 
---------------------------------------

Este projeto consiste em mostrar implementações reais dos padrões de projetos com Java. Aqui você também encontra todas as explicações sobre cada uma delas.
Usamos como fonte: https://refactoring.guru/pt-br/design-patterns/


### Padrões criacionais:
1- [Prototype](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/criacionais/prototype): O *Prototype* consiste em um padrão cuja função é replicar um objeto com o mesmo estado para seus clones, geralmente o objeto possui uma função <span style="color:red;">"clone()"</span>. Devemos ficar atentos na proposta do código, porque podemos ter um <b>Deep copy</b> ou <b>Shallow copy</b>. O deep copy é um objeto clonado com uma refencia nova no ponteiro, já o shallow é a mesma referencia.

 - :white_check_mark: Podemos reaproveitar um objeto já criado anteriormente sem necessidade de criar passando os valores no construtor.
 - :white_check_mark: Podemos facilitar a herança de objetos com configurações pré determinadas.
 - :white_check_mark: Você pode produzir objetos complexos mais convenientemente
 
 - :x: Clonar objetos complexos que têm referências circulares pode ser bem complicado.
 
 2- [Builder](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/criacionais/builder): O *Builder* consiste em um padrão cuja função é facilitar a criação de objetos com construtores muito grandes e também consegue isolar as regras de négocio referentes aos campos de um objeto.
 
 - :white_check_mark: Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.
 - :white_check_mark: Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.
 - :white_check_mark: Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.
 
 - :x: A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.

 3- [Factory Method](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/criacionais/factory): O *Factory Method* tem como princípio tirar a responsabilidade de criação de um "produto" da classe principal que irá usa-la, então o que ela nos fornece: Nós teremos que criar uma classe criadora abstrata (Factory abstrato), uma classe criadora concreta (Factory), um produto abstrato e um produto concreto.
 Então, num cenário que utilize o factory method que faça sentido temos que encontrar uma solicitação ao factory de criação de um produto, o produto que será criado vai ser de acordo com o factory. Exemplo:
 Desejamos criar uma pessoa do sexo masculino, para isso poderiamos instanciar new Homem(), e se quisessemos criar o oposto fariamos new Mulher(), com o factory isso ficaria dessa forma: PessoaFactory.createPessoa("masculino").
 
 - :white_check_mark: Você evita acoplamentos firmes entre o criador e os produtos concretos.
 - :white_check_mark: Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.
 - :white_check_mark: Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.

 - :x: O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.