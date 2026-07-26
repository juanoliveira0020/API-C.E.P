# 📍 API de Consulta de CEP

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Spring_Boot-3.1.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/REST_API-02569B?style=for-the-badge" alt="REST API">
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
  <img src="https://img.shields.io/badge/Status-Conclu%C3%ADdo-success?style=for-the-badge" alt="Status">
</p>

<p align="center">
  API REST desenvolvida em Java com Spring Boot para consulta de endereços a partir de um CEP,
  consumindo a API pública do ViaCEP.
</p>

---

## 📑 Sumário

- [Sobre o Projeto](#-sobre-o-projeto)
- [Funcionalidades](#-funcionalidades)
- [Tecnologias Utilizadas](#️-tecnologias-utilizadas)
- [Arquitetura](#️-arquitetura)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Como Executar](#-como-executar)
- [Exemplo de Consulta](#-exemplo-de-consulta)
- [API Consumida](#-api-consumida)
- [Dependências](#-dependências)
- [Melhorias Futuras](#-melhorias-futuras)
- [Autor](#-autor)
- [Licença](#-licença)

---

## 📖 Sobre o Projeto

A **API de Consulta de CEP** é uma aplicação desenvolvida em **Java 17** utilizando **Spring Boot**, responsável por consultar endereços através de um CEP informado.

O projeto consome a API pública do **ViaCEP**, retornando informações completas do endereço em formato JSON por meio de uma API REST.

Este projeto foi desenvolvido como atividade acadêmica para praticar conceitos de desenvolvimento de APIs REST, consumo de serviços externos e organização de aplicações utilizando Spring Boot.

---

## ✨ Funcionalidades

- 📍 Consulta de endereços utilizando CEP
- 🌐 Integração com a API ViaCEP
- 📄 Retorno das informações em formato JSON
- ⚡ Comunicação via HTTP utilizando Spring Web
- 🏗️ Arquitetura organizada em camadas
- 🔄 Consumo de APIs externas

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Função |
|---|---|
| **Java 17** | Linguagem principal do projeto |
| **Spring Boot 3.1.2** | Framework principal da aplicação |
| **Spring Web** | Construção da API REST e consumo de serviços externos |
| **Lombok** | Redução de código repetitivo (getters, setters, construtores) |
| **Maven** | Gerenciamento de dependências e build |
| **IntelliJ IDEA** | Ambiente de desenvolvimento utilizado |
| **ViaCEP API** | Serviço externo consumido para obtenção dos endereços |

---

## 🏛️ Arquitetura

O projeto foi estruturado utilizando a **arquitetura em camadas** do Spring Boot:

| Camada | Classe | Responsabilidade |
|---|---|---|
| **Controller** | `CepController` | Recebe as requisições HTTP e retorna as respostas da API |
| **Service** | `CepService` | Contém a lógica responsável pela comunicação com a API do ViaCEP |
| **Model** | `Endereco` | Representa o objeto de endereço retornado pela consulta |

Essa separação mantém o código organizado, facilita a manutenção e permite testar cada camada de forma isolada.

---

## 📂 Estrutura do Projeto

```text
cep-api/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com.seuprojeto.cepapi/
│       │       ├── controller/
│       │       │   └── CepController.java
│       │       ├── model/
│       │       │   └── Endereco.java
│       │       ├── service/
│       │       │   └── CepService.java
│       │       └── CepApiApplication.java
│       │
│       └── resources/
│           └── application.properties
│
├── pom.xml
└── README.md
```

---

## 🚀 Como Executar

### Pré-requisitos

- Java JDK 17
- Maven
- IntelliJ IDEA (recomendado)

### Passo a passo

**1. Clone o repositório**
```bash
git clone https://github.com/juanoliveira0020/API-C.E.P.git
```

**2. Entre na pasta do projeto**
```bash
cd API-C.E.P
```

**3. Execute a aplicação**

Pelo Maven:
```bash
mvn spring-boot:run
```

Ou execute a classe principal diretamente pela IDE:
```
CepApiApplication.java
```

**4. Acesse a aplicação**

A API estará disponível em:
```
http://localhost:8080
```

---

## 📡 Exemplo de Consulta

**Requisição**
```
GET /cep/01001000
```

**Resposta**
```json
{
    "cep": "01001-000",
    "logradouro": "Praça da Sé",
    "bairro": "Sé",
    "localidade": "São Paulo",
    "uf": "SP",
    "ddd": "11"
}
```

> 💡 As informações retornadas dependem dos dados disponibilizados pela API do ViaCEP. Caso o CEP não exista, o serviço externo pode retornar um objeto indicando erro.

---

## 🔗 API Consumida

O projeto utiliza a API pública **ViaCEP**:

🔗 https://viacep.com.br

---

## 📦 Dependências

- `spring-boot-starter-web`
- `spring-boot-devtools`
- `lombok`
- `spring-boot-starter-test`
- Maven

---

## 🚀 Melhorias Futuras

- [ ] Validação de CEP inválido
- [ ] Tratamento global de exceções
- [ ] Documentação com Swagger/OpenAPI
- [ ] Cache das consultas
- [ ] Dockerização
- [ ] Testes unitários e de integração
- [ ] Monitoramento com Spring Boot Actuator
- [ ] Logs estruturados

---

## 👨‍💻 Autor

**Juan Oliveira**

[![GitHub](https://img.shields.io/badge/GitHub-juanoliveira0020-181717?style=flat&logo=github)](https://github.com/juanoliveira0020)

---

## 📄 Licença

Este projeto foi desenvolvido para fins acadêmicos e de aprendizado.

Sinta-se à vontade para utilizá-lo como referência para estudos sobre Java, Spring Boot, APIs REST e consumo de serviços externos.
