# API de Gerenciamento de Consultas

## Introdução

Esta API foi desenvolvida como a parte prática da monografia API de Gerenciamento de Consultas.

## Tecnologias usadas

|Tecnologia|Versão|
|:-:|:-:|
|Java|21|
|Spring Boot|3.2.2|

## Configurações básicas

A versão usada para o desenvolvimento desta API é a Amazon Corretto. Para ter acesso ao Java da Amazon, [clique aqui](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html).

A partir da versão 3, a versão mínima do Java é a 17.

## Como baixar

### Via download

Vá no botão `Code` e presione `Download ZIP`. Um arquivo ZIP será gerado. Extraia o conteúdo.

### Via git

Caso o git não esteja instalada, [clique aqui](https://git-scm.com/downloads).

Abra o CMD e digite `git clone https://github.com/LazaroDamasceno/API-Gerenciamento-Consultas.git`.

## Como executar e parar

### Como executar via comando do Maven

Abre o CMD e digite `cd backend; cd api; cd v1`. 

Por fim, digite, caso o sistema operacional seja Windows, `./mvnw clean spring-boot:run`.

### Como parar

Para parar, pressione no CMD `CRTL + C` ou feche o CMD.

## Como inserir ou exibir dados

Foi adicionado a aplicação o Swagger UI. 

Por este motivo, recomanda-se o uso do Swagger após a execução. 

Para tanto, o Swagger UI pode ser acessado em [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html).

## Banco de dados

O banco de dados usado foi o PostregreSQL.

É necessário ir no site [https://www.elephantsql.com/](https://www.elephantsql.com/), criar uma instância e colocar os dados necessários nos lugares no arquivo `application.propeties`.

A url da instância deverá ser copiada a partir do `@`.

## API funcionando

O link do vídeo que contém a API funcionando é [este](https://youtu.be/FJ6vMU-Udco).
