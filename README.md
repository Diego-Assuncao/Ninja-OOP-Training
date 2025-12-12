# 🥷 Ninja-OOP-Training

Este é um projeto simples em Java criado para treinar e demonstrar os conceitos fundamentais da **Programação Orientada a Objetos (POO)**: **Herança**, **Polimorfismo** e **Interface**. O tema escolhido foi "Ninjas" de diferentes níveis.

## 🎯 Conceitos de POO Aplicados

O projeto exemplifica três pilares cruciais da POO.

### 1. Interface

A interface `Ninja` define um contrato comum que todos os tipos de ninjas devem seguir, garantindo que eles possuam as ações básicas de um ninja.

* **Interface:** `Ninja`
* **Métodos Definidos:**
    * `void mostrarInformacoes()`: Exibe os dados do ninja.
    * `void executarHabilidade()`: Desempenha a habilidade principal do ninja.

### 2. Herança

A classe `NinjaAvancado` **herda** características e comportamentos da classe `NinjaBasico`. Isso permite que o código seja reutilizado e que a classe avançada adicione suas próprias funcionalidades específicas.

* **Classe Base (Superclasse):** `NinjaBasico`
* **Classe Derivada (Subclasse):** `NinjaAvancado`

A classe `NinjaAvancado` chama o construtor da superclasse (`super(nome, idade, habilidade)`) e estende a funcionalidade ao adicionar um atributo `especialidade`.



### 3. Polimorfismo (Sobrescrita de Método)

O **Polimorfismo** é demonstrado pela sobrescrita dos métodos definidos na interface e na superclasse.

Tanto `NinjaBasico` quanto `NinjaAvancado` implementam (`@Override`) os métodos da interface `Ninja`. Além disso, `NinjaAvancado` **sobrescreve** os métodos `mostrarInformacoes()` e `executarHabilidade()` herdados de `NinjaBasico` para incluir sua nova propriedade, a `especialidade`.

* **Exemplo:**
    * O método `mostrarInformacoes()` na classe `NinjaAvancado` primeiro executa a versão da superclasse (`super.mostrarInformacoes()`) e depois adiciona a informação da `especialidade`.
    * Na classe `Main`, embora ambos sejam tratados pela perspectiva de suas classes concretas, o design mostra como diferentes tipos de ninjas respondem de maneira diferente ao mesmo chamado de método (`executarHabilidade()`).

## ⚙️ Estrutura do Código

| Classe/Interface | Conceito Principal | Descrição |
| :--- | :--- | :--- |
| `Ninja` | **Interface** | Contrato básico para todos os ninjas. |
| `NinjaBasico` | **Implementa Interface** | Implementa a interface `Ninja`. Serve como a classe base. |
| `NinjaAvancado` | **Herança & Polimorfismo** | Estende `NinjaBasico` e sobrescreve métodos para adicionar a `especialidade`. |
| `Main` | **Execução** | Cria instâncias de `NinjaAvancado` (Sasuke) e `NinjaBasico` (Naruto) e demonstra a chamada de métodos. |

## 💻 Como Rodar

Basta compilar e executar a classe `Main.java`.

### Saída Esperada:

=====Informações do Ninja===== 

Nome: Sasuke Uchiha 

Idade: 18 

Habilidade do Ninja: Sharingan 

Especialidade: Saltar 

Meu nome é Sasuke Uchiha e a minha habilidade é Sharingan 

Minha especialidade é Saltar

=====Informações do Ninja===== 

Nome: Naruto Uzumaki 

Idade: 17 

Habilidade do Ninja: Manipulação de Chakra 

Meu nome é Naruto Uzumaki e a minha habilidade é Manipulação de Chakra
