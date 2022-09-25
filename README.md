## :thought_balloon: Design Pattern com Quarkus 
---------------------------------------

Este projeto consiste em mostrar implementações reais dos padrões de projetos com Java. Aqui você também encontra todas as explicações sobre cada uma delas.
Usamos como fonte: https://refactoring.guru/pt-br/design-patterns/


### Padrões criacionais: 
 1- [Builder](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/criacionais/builder): O *Builder* consiste em um padrão cuja função é facilitar a criação de objetos com construtores muito grandes e também consegue isolar as regras de négocio referentes aos campos de um objeto.
 
 - :white_check_mark: Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.
 - :white_check_mark: Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.
 - :white_check_mark: Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.
 
 - :x: A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.

 2- [Factory Method](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/criacionais/factory/method): O *Factory Method* tem como princípio tirar a responsabilidade de criação de um "produto" da classe principal que irá usa-la, então o que ela nos fornece: Nós teremos que criar uma classe criadora abstrata (Factory abstrato), uma classe criadora concreta (Factory), um produto abstrato e um produto concreto.
 Então, num cenário que utilize o factory method que faça sentido temos que encontrar uma solicitação ao factory de criação de um produto, o produto que será criado vai ser de acordo com o factory. Exemplo:
 Desejamos criar uma pessoa do sexo masculino, para isso poderiamos instanciar new Homem(), e se quisessemos criar o oposto fariamos new Mulher(), com o factory isso ficaria dessa forma: PessoaFactory.createPessoa("masculino").
 
 - :white_check_mark: Você evita acoplamentos firmes entre o criador e os produtos concretos.
 - :white_check_mark: Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.
 - :white_check_mark: Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.

 - :x: O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.

 3- [Factory Abstract](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/criacionais/factory/fabstract): O *Factory Abstract* é bem similar ao factory method, a diferença é que o abstract tem como principio criar um conjunto de produtos criado por uma factory. Não entendeu? vamos para o exemplo:
 No factory method tinhamos uma fabrica especifica que criavam produtos especificos, já no factory abstract nós temos uma fábrica que cria um conjunto de objetos, exemplo:
 PizzaFactory -> PizzaCalabresaFactory{
  createSabor() Sabor
  createBorda(): Borda
 },
 
 PizzaMussarelaFactory{
  createSabor() Sabor
  createBorda(): Borda
 }

 - :white_check_mark: Você pode ter certeza que os produtos que você obtém de uma fábrica são compatíveis entre si.
 - :white_check_mark: Você evita um vínculo forte entre produtos concretos e o código cliente.
 - :white_check_mark: Princípio de responsabilidade única. Você pode extrair o código de criação do produto para um lugar, fazendo o código ser de fácil manutenção
 - :white_check_mark:Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.

 - :x: O código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes são introduzidas junto com o padrão.

4- [Prototype](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/criacionais/prototype): O *Prototype* consiste em um padrão cuja função é replicar um objeto com o mesmo estado para seus clones, geralmente o objeto possui uma função <span style="color:red;">"clone()"</span>. Devemos ficar atentos na proposta do código, porque podemos ter um <b>Deep copy</b> ou <b>Shallow copy</b>. O deep copy é um objeto clonado com uma refencia nova no ponteiro, já o shallow é a mesma referencia.

 - :white_check_mark: Podemos reaproveitar um objeto já criado anteriormente sem necessidade de criar passando os valores no construtor.
 - :white_check_mark: Podemos facilitar a herança de objetos com configurações pré determinadas.
 - :white_check_mark: Você pode produzir objetos complexos mais convenientemente

 - :x: Clonar objetos complexos que têm referências circulares pode ser bem complicado.

 5- [Singleton](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/criacionais/singleton): O *Singleton* tem com principio uma função totalmente diferente da *Prototype* comentada anteriormente. Isso porque o singleton define que quando temos um cénario cujo o sistema precisa de apenas uma instância em uso por todos os clientes requisitantes, em hipotese alguma aquela instância pode ser clonada, mas sim reaproveitada.
 Então para isso precisamos ter uma classe com construtor privado e com metodo de instancia statico e uma variavel da instancia statica e privada.

 - :white_check_mark: Você pode ter certeza que uma classe só terá uma única instância.
 - :white_check_mark: Você ganha um ponto de acesso global para aquela instância.
 - :white_check_mark: O objeto singleton é inicializado somente quando for pedido pela primeira vez.

 - :x: Viola o princípio de responsabilidade única. O padrão resolve dois problemas de uma só vez.
 - :x: O padrão Singleton pode mascarar um design ruim, por exemplo, quando os componentes do programa sabem muito sobre cada um.
 - :x: O padrão requer tratamento especial em um ambiente multithreaded para que múltiplas threads não possam criar um objeto singleton várias vezes.
 - :x: Pode ser difícil realizar testes unitários do código cliente do Singleton porque muitos frameworks de teste dependem de herança quando produzem objetos simulados. Já que o construtor da classe singleton é privado e sobrescrever métodos estáticos é impossível na maioria das linguagem, você terá que pensar em uma maneira criativa de simular o singleton. Ou apenas não escreva os testes. Ou não use o padrão Singleton.

### Padrões comportamentais: 
 1- [Observer](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/comportamentais/observer): O *Observer* tem como princípio de função a criação de duas classes uma observadora e uma observada, onde podemos chamá-las de listerner e publisher e aí trazemos a alusão das mensagerias em microsserviços, na qual temos um serviço que fica esperando mensagens de uma outra determinada aplicação.
 Para isso temos que ter uma Classe responsável por criar o esquema de publishers e listeners, essa classe deve conter uma lista privada para adicionar os assinates e métodos como o de adição e remoção dos mesmos, contendo também um método para notificá-los, nesse método pode conter alguma regra onde envie a mensagem apenas para um determinado grupo de assinates.

 - :white_check_mark: Princípio aberto/fechado. Você pode introduzir novas classes assinantes sem ter que mudar o código da publicadora (e vice versa se existe uma interface publicadora).
 - :white_check_mark: Você pode estabelecer relações entre objetos durante a execução.

 - :x: Assinantes são notificados em ordem aleatória