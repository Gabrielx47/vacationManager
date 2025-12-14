## Vacation Manager

O Vacation Manager é uma aplicação Spring Boot desenvolvida para gerenciar as férias de servidores públicos. Permite solicitar férias, aprovar ou reprovar solicitações, acompanhar o status e gerenciar pagamentos relacionados às férias.

## Sumário

- [Modelo de Dados](#modelo-de-dados)
- [Endpoints da API](#endpoints-da-api)
- [Protótipo de Baixa Fidelidade](#prototipo-de-baixa-fidelidade)
- [Instruções para Executar a API com Docker Compose](#instrucoes-para-executar-a-api-com-docker-compose)

## Modelo de Dados

### Modelo Conceitual
   ![Modelo Conceitual](/assets/modelagem_conceitual.png)

### Modelo Lógico
   ![Modelo Lógico](/assets/modelo_logico.png)

O sistema Vacation Manager utiliza as seguintes entidades principais:

### Servidor
- **id**: Identificador único (long)
- **nome**: Nome do servidor (String)
- **ferias**: Coleção de férias associadas (Collection<Ferias>)
- **pagamentos**: Coleção de pagamentos associados (Collection<Pagamento>)

### Ferias
- **id**: Identificador único (long)
- **inicio**: Data de início das férias (LocalDate)
- **fim**: Data de fim das férias (LocalDate)
- **status**: Status da solicitação (Status: APROVADA, REPROVADA, EMANALISE)
- **servidor**: Servidor associado (Servidor)

### Pagamento
- **id**: Identificador único (long)
- **valor**: Valor do pagamento (double)
- **data**: Data do pagamento (LocalDate)
- **servidor**: Servidor associado (Servidor)

### Status
Enumeração com os valores:
- APROVADA
- REPROVADA
- EMANALISE

## Endpoints da API

A API do Vacation Manager oferece os seguintes endpoints:

### Ferias
- **GET** `/ferias/{id}`: Retorna as informações das férias aprovadas para o ID especificado.

### Servidores
- **GET** `/servidores/{id}/ferias`: Retorna a lista de férias associadas ao servidor com o ID especificado.

## Protótipos de Baixa Fidelidade
Abaixo é apresentado os protótipos das telas que ilustram o funcionamento do sistema:
   ![low fidelity prototipe](/assets/low_fidelity_prototype%20-%20vacation_manager.png)
## Instruções para Executar a API com Docker Compose

Para executar a API utilizando Docker Compose, siga os passos abaixo:

1. Certifique-se de que o Docker e o Docker Compose estão instalados no seu sistema.

2. Navegue até o diretório raiz do projeto onde está localizado o arquivo `docker-compose.yml`.

3. Execute o comando para compilar e gerar o arquivo .jar:
   ```
   ./mvnw package
   ```

3. Execute o comando para construir e iniciar os serviços:
   ```
   docker compose up --build
   ```

4. A API estará disponível na porta definida no `docker-compose.yml`: porta 2000, sendo a url base: `http:localhost:2000/`.

5. Para parar os serviços, execute:
   ```
   docker compose down
   ```

