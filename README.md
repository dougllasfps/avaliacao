# Bem vindo!

Esta é uma avaliação para desenvolvedores.  Siga as instruções abaixo para realização da prova.

> 1. Clone o projeto, configure seu ambiente rodar nas versões indicadas no pom.
> 2. Após finalizado seu projeto, realize o push em um repositório remoto com link público para que possamos visualizar sua solução.
> 3. Enviar a solução para o email informado durante sua entrevista.

## Requisitos

O objetivo desde projeto é fazer o microserviço rodar sem problemas, ele deve conter o cadastro de alunos com as seguintes operações:

> a. cadastrar novo aluno (não permitir duplicação de CPF; todos os campos são obrigatórios)

> b. buscar aluno por id

> c. deletar aluno

> d. atualizar dados do aluno

> e. pesquisar alunos por nome e/ou cpf (o usuário poderá passar os 2, ou somente um dos 2 parametros)

> f. ativar ou inativar aluno cadastrado

## Configurações

O projeto já encontra-se configurado com todas as dependências (libs) necessárias para realizar a prova, caso precise pode adicionar novas libs, porém saliento que todas as necessárias já estão lá.

## Banco de dados

A aplicação já possui uma configuração de data source para um banco de dados em memória, ou seja, não é necessário configurar conexão de bancos. Entretanto, caso deseje, dentro do tempo estipulado para entrega da prova, utilizar algum outro banco de dados relacional, como PostgreSQL, MySQL, Oracle, etc, você pode fazê-lo, desde que utilize uma stack do docker compose com os parâmetros para subir o banco e conectar a aplicação - isso é totalmente opcional, porém qualquer recurso a mais será considerado como habilidades extras.

## Persistência

Você deverá utilizar o JPA para realizar as operações de persistencia da entidade Aluno.

## API

Você deve fazer a API funcionar e realizar todas as operações, no fim de cada operação os dados deverão estar persistidos no banco ou estarem sendo mostrado nas buscas. Já existe uma estrutura de classes (Domain, Repositorio e Controller) criada já com algum código programado, seu objetivo é, além de fazer tudo funcionar conforme solicitado, fazer os ajustes necessários para ter uma boa API. Refatore sempre que julgar necessário, não tenha medo de alterar tudo se necessário, queremos ver como modela e desenvolve suas API's.

## Habilidades Extras

Serão considerados quaisquer recursos extras que utilize na aplicação: testes unitários, serviços externos, deploy via Dockerfile, etc.


### Tenha uma excelente prova e boa sorte!

