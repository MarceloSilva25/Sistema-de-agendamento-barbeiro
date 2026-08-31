# Sistema de agendamento barbeiro

Projeto desenvolvido em **Java** com o objetivo de praticar e consolidar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, lógica de programação, encapsulamento, validação de dados e organização de responsabilidades.

O sistema está sendo desenvolvido de forma incremental, começando pela modelagem das entidades e evoluindo gradualmente para as regras de negócio relacionadas ao processo de agendamento.

## Objetivo

Desenvolver um sistema capaz de gerenciar agendamentos, relacionando:

* Clientes
* Profissionais
* Serviços
* Agendamentos

O projeto também tem como objetivo simular situações e regras encontradas em sistemas reais, como validação de informações, controle de horários e prevenção de conflitos de agendamento.

## Estrutura planejada

A aplicação será organizada inicialmente nas seguintes classes:

```text
Cliente
Profissional
Servico
Agendamento
GerenciadorDeAgendamentos
```

Cada classe terá responsabilidades específicas, evitando concentrar toda a lógica no método `main`.

### Cliente

Responsável por representar os clientes do sistema.

Atualmente possui:

* Nome
* Telefone

Também possui validação do telefone, permitindo:

* Verificar valores nulos ou vazios
* Aceitar números com formatação
* Remover caracteres de formatação
* Validar a quantidade de dígitos
* Armazenar o telefone sem formatação

Exemplo:

```text
Entrada:
(21) 91234-5678

Armazenamento:
21912345678
```

## Fluxo planejado

O funcionamento do sistema seguirá, inicialmente, uma lógica semelhante a:

```text
Cliente
   │
   ├──────────────┐
   │              │
   ▼              ▼
Serviço      Profissional
   │              │
   └──────┬───────┘
          ▼
     Agendamento
          │
          ▼
Gerenciador de Agendamentos
          │
          ▼
     Regras de negócio
```

O `main` será utilizado como ponto de entrada da aplicação e para coordenar o fluxo, enquanto as responsabilidades específicas serão distribuídas entre as classes.

## Conceitos praticados

Durante o desenvolvimento estão sendo aplicados conceitos como:

* Programação Orientada a Objetos
* Classes e objetos
* Encapsulamento
* Modificadores de acesso
* Construtores
* Getters e Setters
* Métodos
* Validação de dados
* Tratamento de exceções
* Manipulação de `String`
* Organização de responsabilidades
* Regras de negócio

## Status do projeto

**Em desenvolvimento**

O projeto está sendo construído de forma incremental. Novas funcionalidades e regras serão adicionadas conforme o desenvolvimento avançar.

### Próximas etapas

* [ ] Criar classe `Profissional`
* [ ] Criar classe `Servico`
* [ ] Criar classe `Agendamento`
* [ ] Criar `GerenciadorDeAgendamentos`
* [ ] Implementar regras de conflito de horários
* [ ] Implementar criação de agendamentos
* [ ] Implementar cancelamento
* [ ] Implementar alteração de agendamentos
* [ ] Implementar consultas de agendamentos
* [ ] Melhorar tratamento de exceções
* [ ] Criar testes
* [ ] Avaliar integração com banco de dados
* [ ] Evoluir o projeto para uma API REST com Spring Boot

## Tecnologias

* **Java**
* **IntelliJ IDEA**
* **Git**
* **GitHub**

## Sobre o desenvolvimento

Este projeto faz parte da minha jornada de aprendizado em **Java e desenvolvimento Back-End**.

A proposta não é apenas desenvolver uma aplicação funcional, mas utilizar o projeto para compreender na prática como transformar um problema do mundo real em entidades, responsabilidades e regras de negócio.

Cada etapa do projeto está sendo desenvolvida buscando priorizar **entendimento, organização e evolução gradual do código**.

---

**Projeto desenvolvido por Marcelo Silva**
Estudante de Análise e Desenvolvimento de Sistemas | Foco em Java Back-End
