# BancoRCG

## 1. Introdução
BancoRCG é um aplicativo Android desenvolvido em Java que simula um sistema bancário básico. Utilizando a arquitetura MVVM e o banco de dados SQLite (via Room), o app permite aos usuários:

* Gerenciar contas: Criar, editar, excluir e consultar informações detalhadas de contas bancárias.
* Realizar transações: Efetuar depósitos, saques e transferências entre contas.
* Consultar histórico: Visualizar um histórico completo de todas as transações realizadas.
* Buscar contas: Pesquisar contas por número, nome do cliente ou CPF.
* Tecnologias chave: Android, Java, MVVM, Room, LiveData, RecyclerView.

Projeto de conclusão da cadeira de programação Android da pós-graduação CIn/Motorola T26 - 2024.2

## 2. Funcionalidades

* Cadastro e gerenciamento de contas: Criação, edição, exclusão e visualização de contas.
* Realização de transações: Crédito, débito e transferência entre contas.
* Histórico de transações: Visualização detalhada de todas as transações realizadas.
* Busca e filtragem de contas: Busca por número da conta, nome do cliente ou CPF.
* Relatórios: Visualização do saldo total e histórico de transações.
  
## 3. Tecnologias Utilizadas
* Linguagem de programação: Java
* Framework: Android
* Banco de dados: Room (SQLite)
* Outras bibliotecas: LiveData, ViewModel, Coroutines (se utilizadas)

## 4. Arquitetura
* Padrão MVVM: Model: Representa os dados do aplicativo. No BancoRCG, o Model inclui classes como Conta, Transacao e Cliente. Essas classes são mapeadas para o banco de dados usando o Room.
View: É a interface do usuário, composta por Activities e Fragments. A View exibe os dados fornecidos pelo ViewModel e responde às interações do usuário.
ViewModel: Atua como intermediário entre a View e o Model. Ele contém a lógica de negócios, manipula os dados e expõe esses dados para a View através de LiveData.

## 5. Instalação e Configuração
* Para executar este projeto, você precisará:
* Android Studio: Baixe e instale a última versão do Android Studio em https://developer.android.com/studio/.
* SDK do Android: Instale o SDK do Android com as APIs necessárias para o seu projeto.
* Clone o repositório:

```
git clone https://github.com/seu-usuario/BancoRCG.git
```

* Abra o projeto no Android Studio: Abra o diretório do projeto clonado no Android Studio.
* Execute o aplicativo: Conecte um dispositivo físico ou inicie um emulador e execute o aplicativo.


