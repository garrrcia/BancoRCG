# BancoRCG

## 1. Introdução
* Título: BancoRCG: Um sistema bancário simples para gerenciamento de contas.
* Descrição: Breve descrição do projeto, destacando as principais funcionalidades (criar contas, realizar transações, consultar saldos, etc.).
* Objetivo: Projeto de conclusão da cadeira de programação Android da pós-graduação CIn/Motorola T26 - 2024.2
* A aplicação Banco está parcialmente implementada no momento. Existem vários métodos e trechos de códigos com anotações lembrando que faltam implementar alguns detalhes da aplicação.

## 2. Tecnologias Utilizadas
* Linguagem de programação: Java
* Framework: Android
* Banco de dados: Room (SQLite)
* Outras bibliotecas: LiveData, ViewModel, Coroutines (se utilizadas)

## 3. Arquitetura
* Padrão MVVM: Model: Representa os dados do aplicativo. No BancoRCG, o Model inclui classes como Conta, Transacao e Cliente. Essas classes são mapeadas para o banco de dados usando o Room.
View: É a interface do usuário, composta por Activities e Fragments. A View exibe os dados fornecidos pelo ViewModel e responde às interações do usuário.
ViewModel: Atua como intermediário entre a View e o Model. Ele contém a lógica de negócios, manipula os dados e expõe esses dados para a View através de LiveData.

1. Model (Camada de Dados):

** Entidades: As classes Conta, Transacao e Cliente representam as entidades do banco de dados.
** DAO (Data Access Object): A interface DAO, definida no Room, define os métodos para interagir com o banco de dados, como inserir, atualizar, excluir e buscar dados.
** Room: O Room é o ORM (Object Relational Mapper) do Android que simplifica a interação com o banco de dados SQLite. Ele mapeia as entidades Java para tabelas no banco de dados e gera automaticamente o código SQL necessário.

2. ViewModel:

LiveData: O ViewModel expõe os dados para a View através de LiveData. LiveData é um objeto observável que notifica as Views automaticamente quando os dados mudam.
Repositório: O ViewModel geralmente delega as operações de banco de dados para um repositório. O repositório encapsula a lógica de acesso ao banco de dados e pode fornecer uma camada de abstração para diferentes fontes de dados (por exemplo, banco de dados local, servidor remoto).
** Lógica de negócio: O ViewModel contém a lógica de negócio, como calcular o saldo total de uma conta, realizar transferências e validar dados.

3. View:

** Activities e Fragments: As Activities e Fragments são responsáveis por criar a interface do usuário e exibir os dados fornecidos pelo ViewModel.
** Data Binding: O Data Binding pode ser utilizado para conectar os elementos da interface diretamente aos dados do ViewModel, reduzindo a quantidade de código boilerplate.
** RecyclerView: É usado para exibir listas de contas e transações de forma eficiente.

* Diagrama de classes: Um diagrama simplificado para visualizar a relação entre as classes principais.
* Fluxograma: Um fluxograma básico para mostrar o fluxo de dados entre as diferentes camadas do aplicativo.

## 4. Instalação e Configuração
* Pré-requisitos: Quais ferramentas e SDKs são necessários para executar o projeto?
* Clonagem do repositório: Instruções para clonar o repositório do GitHub.
* Configuração do ambiente: Quaisquer configurações específicas que o desenvolvedor precise fazer.

* Para executar este projeto, você precisará:

* Android Studio: Baixe e instale a última versão do Android Studio em https://developer.android.com/studio/.
* SDK do Android: Instale o SDK do Android com as APIs necessárias para o seu projeto.
* Clone o repositório:

```
git clone https://github.com/seu-usuario/BancoRCG.git
```

* Abra o projeto no Android Studio: Abra o diretório do projeto clonado no Android Studio.
* Execute o aplicativo: Conecte um dispositivo físico ou inicie um emulador e execute o aplicativo.

## 5. Uso
* Execução do aplicativo: Como executar o aplicativo no emulador ou em um dispositivo físico.
* Funcionalidades principais: Descrição detalhada de cada funcionalidade, com exemplos de como utilizá-las.
* Telas e fluxos: Descrição das principais telas do aplicativo e como elas se conectam.
