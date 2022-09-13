## :thought_balloon: Design Pattern com Quarkus 
---------------------------------------

Este projeto consiste em mostrar implementações reais dos padrões de projetos com Java. Aqui você também encontra todas as explicações sobre cada uma delas.
Usamos como fonte: https://refactoring.guru/pt-br/design-patterns/


### Padrões criacionais:
1- [Prototype](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/prototype): O *Prototype* consiste em um padrão cuja função é replicar um objeto com o mesmo estado para seus clones, geralmente o objeto possui uma função <span style="color:red;">"clone()"</span>. Devemos ficar atentos na proposta do código, porque podemos ter um <b>Deep copy</b> ou <b>Shallow copy</b>. O deep copy é um objeto clonado com uma refencia nova no ponteiro, já o shallow é a mesma referencia.

 - :white_check_mark: Podemos reaproveitar um objeto já criado anteriormente sem necessidade de criar passando os valores no construtor.
 - :white_check_mark: Podemos facilitar a herança de objetos com configurações pré determinadas.
 - :white_check_mark: Você pode produzir objetos complexos mais convenientemente
 
 - :x: Clonar objetos complexos que têm referências circulares pode ser bem complicado.
 
 2- [Builder](https://github.com/LucasJordao/design-pattern/tree/master/src/main/java/br/com/lucas/pattern/builder): O *Builder* consiste em um padrão cuja função é facilitar a criação de objetos com construtores muito grandes e também consegue isolar as regras de négocio referentes aos campos de um objeto.
 
 - :white_check_mark: Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.
 - :white_check_mark: Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.
 - :white_check_mark: Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.
 
 - :x: A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.
