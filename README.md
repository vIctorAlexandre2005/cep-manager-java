# 🚀 Backend - Desafio Técnico

## 📌 Sobre o Projeto
Este projeto é a versão backend do desafio técnico desenvolvido para a **Solution TI**, com o objetivo de criar um serviço para gerenciar endereços dos usuários. Ele oferece as funcionalidades de CRUD (Create, Read, Update, Delete) para armazenar, listar, editar e excluir endereços, além de garantir a comunicação com o frontend através de APIs.

🔹 **Tecnologias Utilizadas:**
- [Java](https://www.oracle.com/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- [Spring Data JPA](https://spring.io/projects/spring-data)
- [MySQL](https://www.mysql.com/)
- [Spring Web](https://spring.io/projects/spring-web)

## 🎯 Funcionalidades
✅ Criar novo endereço com dados do usuário (Nome, CPF, CEP, Logradouro, Bairro, Cidade, Estado)<br>
✅ Listar endereços salvos<br>
✅ Atualizar informações de um endereço<br>
✅ Excluir endereço<br>
✅ Integração com o frontend para enviar e receber dados via API<br>
✅ Conexão com o banco de dados (MySQL) para persistência<br>
✅ Validações dos campos para melhor controle do que é salvo<br>

## 📦 Como Rodar o Projeto

### 🔹 Pré-requisitos
Certifique-se de ter instalado:
- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://www.mysql.com/)

### 🚀 Instalação e Execução
```bash
# Clone este repositório
$ git clone https://github.com/seu-usuario/backend-repo.git

# Acesse a pasta do projeto
$ cd backend-repo

# Instale as dependências com Maven
$ mvn clean install

# Inicie o servidor
$ mvn spring-boot:run
```
O servidor estará disponível em http://localhost:8080.

⚙️ Configuração do Banco de Dados
Se você estiver usando MySQL, certifique-se de configurar o banco de dados no arquivo application.properties ou application.yml:
```bash
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.application.name=cepmanager
spring.datasource.url=jdbc:mysql://localhost/cep_manager
spring.datasource.username=your-username
spring.datasource.password=your-password
```

🔄 Integração com o Frontend
Este backend se comunica com o frontend, permitindo que os dados dos endereços sejam gerenciados diretamente na aplicação. O frontend pode ser encontrado em https://github.com/vIctorAlexandre2005/cep-manager-react.

🛠️ Estrutura do Projeto
```bash
/src
 ├── controller/       # Controladores REST para manipulação dos endpoints
 ├── repository/       # Interfaces de repositório para persistência de dados
 ├── entity/           # Entidades JPA
 ├── service/          # Lógica de negócios (CRUD)
 ├── dto/              # Objetos de Transferência de Dados (DTOs)
 ├── exception/        # Tratamento de exceções
 └── Application.java  # Arquivo principal para iniciar o Spring Boot
```

💡 Desenvolvido com ❤️ por Victor Alexandre!
