# 🚘 Controle de Estoque - Nitro Auto Peças

![Java](https://img.shields.io/badge/Java-21-orange)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Architecture](https://img.shields.io/badge/Architecture-MVC-green)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)

E aí! 👋 Bem-vindo ao repositório do **Nitro Auto Peças**.

Esse projeto é o resultado dos meus estudos focados em **Java** e **Banco de Dados**. A ideia foi simular um sistema real de uma loja de autopeças, onde o dono precisa ter controle total do que entra e sai do estoque, tudo isso rodando direto no terminal.

## 💡 A Ideia do Projeto

Eu queria criar algo que fosse além do básico "Olá Mundo". O objetivo aqui foi conectar o Java com um banco de dados de verdade (MySQL) e estruturar o código de um jeito profissional, usando o padrão **MVC**.

Basicamente, o sistema resolve o problema de "perder a contagem" das peças. Ele permite cadastrar, atualizar preços, conferir quantidades e gerar relatórios rápidos para tomada de decisão.

## ⚙️ O que o sistema faz?

O sistema conta com um menu interativo onde você pode:

* **📦 Cadastrar Produtos:** Adicionar novas peças (ex: Amortecedor, Pastilha de Freio) com preço e fabricante.
* **📝 Atualizar Estoque:** Se o preço subiu ou chegaram mais unidades, você atualiza tudo pelo ID da peça.
* **🔎 Consultar Tudo:** Listar o inventário completo da loja.
* **📊 Relatórios Inteligentes:**
    * Ver qual é a peça **mais cara** e a **mais barata**.
    * Saber qual produto tem **mais estoque** e qual está **acabando**.
* **🗑️ Limpeza:** Remover do sistema peças que saíram de linha.

## 🏗️ Como foi construído (Arquitetura MVC)

Para não deixar o código bagunçado, usei a arquitetura **Model-View-Controller**. Funciona assim:

1.  **Model (O Molde):** É onde defino o que *é* uma peça (seus atributos como nome, valor, etc.).
2.  **View (A Tela):** É a parte que interage com você. Ela mostra os menus e lê o que você digita no teclado.
3.  **Controller (O Gerente):** Ele pega o pedido da View e manda para o Banco de Dados. É o "cérebro" que conecta tudo.
4.  **DAO (A Cozinha):** É a classe que coloca a mão na massa no banco de dados (Salva, Busca, Remove).

## 🗄️ O Banco de Dados (MySQL)

Sem um banco de dados, tudo o que a gente digita some quando desliga o computador. Por isso, usei o **MySQL**.

Ele serve como a memória permanente do sistema. Criei uma tabela chamada `Estoque_Pecas` que funciona como uma planilha organizada, guardando:
* Um **ID** único para cada peça (para não confundir peças com nomes iguais).
* O **Nome** e **Fabricante**.
* O **Valor** (com precisão de centavos).
* A **Quantidade** atual.

## 🚀 Como rodar na sua máquina

Para testar esse projeto, você vai precisar do **Java 21** e do **MySQL** instalados.

1.  Clone este repositório.
2.  Crie um banco de dados no seu MySQL.
3.  Vá até o arquivo `EstoquePecasDAO.java` e coloque o seu usuário e senha do banco.
4.  Execute a classe `Main.java` na sua IDE favorita (IntelliJ, Eclipse, VS Code).

---

### 👨‍💻 Desenvolvedor

Feito com dedicação por **Luis Miguel**.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue)](https://www.linkedin.com/in/luís-miguel-fullstack)
