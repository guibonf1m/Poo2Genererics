# POO2 Generics - Carrinho de Compras, Pagamentos e Pedidos

Este repositório contém a implementação de exercícios práticos sobre **Generics** em Java, aplicados na disciplina de **Programação Orientada a Objetos 2 (POO2)**. O projeto abrange conceitos fundamentais como **listas genéricas, interfaces genéricas e uso de mapas genéricos**.

## 🚀 Objetivo do Projeto
O objetivo deste projeto é aprofundar o conhecimento em **Generics** por meio de implementações práticas, abordando cenários comuns como:
- **Carrinho de compras genérico**
- **Sistema de pagamento genérico**
- **Gestão de pedidos genérica**
- **Classe genérica para cupons de desconto**

---

## 📌 Exercícios Implementados

### 1️⃣ Carrinho de Compras Genérico
Criação de uma classe `Carrinho<T>` que permite armazenar itens genéricos.

- Métodos principais:
  - `adicionarItem(T item)`: Adiciona um item ao carrinho.
  - `removerItem(T item)`: Remove um item do carrinho.
  - `getQuantidadeTotal()`: Retorna a quantidade total de itens no carrinho.
- **Dica:** Utiliza `List<T>` para armazenar os itens do carrinho.

---

### 2️⃣ Sistema de Pagamento Genérico
Criação de uma interface `Pagamento<T>` para processar pagamentos de diferentes tipos.

- **Implementações:**
  - `PagamentoCartao<T extends Number>`: Processa pagamentos via cartão.
  - `PagamentoPix<T extends Number>`: Processa pagamentos via Pix.
- **Dica:** `T extends Number` garante que o valor do pagamento seja numérico.

---

### 3️⃣ Gestão de Pedidos Genérica
Implementação de uma classe `Pedido<K, V>` para armazenar pedidos de forma genérica.

- **Estrutura:**
  - `K`: Identificador do pedido (pode ser um número ou código alfanumérico).
  - `V`: Lista de itens do pedido.
- **Dica:** Usa `Map<K, List<V>>` para armazenar os pedidos de forma eficiente.

---

### 4️⃣ Classe Genérica para Cupons de Desconto
Criação de uma classe `CupomDesconto<T extends Number>` para aplicar descontos de diferentes tipos.

- **Funcionamento:**
  - `T` pode ser `Integer` (desconto fixo) ou `Double` (percentual).
  - Método `aplicarDesconto(T desconto, double precoOriginal)`: Calcula o preço final após o desconto.

---

## 🔧 Tecnologias Utilizadas
- **Java 17**
- **Paradigma de Programação Orientada a Objetos (POO)**
- **Generics**
- **Coleções em Java (List, Map)**
- **IntelliJ IDEA**
- **Git & GitHub**

## 📥 Como Executar o Projeto
```bash
# Clone este repositório
$ git clone https://github.com/guib0nf1m/Poo2Generics.git

# Acesse a pasta do projeto
$ cd Poo2Generics

# Compile e execute o código no IntelliJ ou via terminal
```

## 📌 Autor
👤 **Guilherme Bonfim**  
📧 [guib0nf1m](https://github.com/guib0nf1m)

Se você achou esse projeto útil, ⭐ **marque com uma estrela no GitHub!** 😊
