# Teste de conhecimento para perfil Engenheiro de Software
----------
## OBJETIVO
- Expor uma API Rest;
- Expor uma tabela Front-End em Angular, consumindo o endpoint http://localhost:8080/im-day
----------

## INSTRUÇÕES

### BANCO DE DADOS
- Me ocorreu diversos problemas com o banco de dados, onde os scripts não inserem no banco através do arquivo data.sql ao executar o servidor ;
- Por isso, a primeira que deverá ser feito é levantar o banco através do comando `docker-compose up`; através da requisição http://localhost:8081 será mostrada um gerenciador de banco onde pedirá o **Utilizador: root** e **Palavra-Passe: root**, porém fica a teu critério utilizar o gerenciador.
- Deverá criar o banco através do comando `CREATE DATABASE test;`. Após isso, poderá rodar o servidor backend;

#### SCRIPTS
- se for utilizar em gerenciadores de banco(DBeaver, Mysql Workbench...)

`INSERT INTO resolution(nome, data) VALUES ("João", "20-09");\n`
`INSERT INTO resolution(nome, data) VALUES ("Maria", "21-09");\n`
`INSERT INTO resolution(nome, data) VALUES ("Zeca", "22-09");\n`
`INSERT INTO resolution(nome, data) VALUES ("Mario", "23-09");\n`
`INSERT INTO resolution(nome, data) VALUES ("Gustavo", "24-09");\n`
`INSERT INTO resolution(nome, data) VALUES ("Camila", "27-09");\n`
`INSERT INTO resolution(nome, data) VALUES ("Pedro", "28-09");\n`
`INSERT INTO resolution(nome, data) VALUES ("Juliana", "29-09");\n`
`INSERT INTO resolution(nome, data) VALUES ("Gisele", "30-09");\n`

- se for testar em softwares de testes API(Postman,Insomnia)...

`{"data": "20-09", "nome": "João"},`
`{"data": "21-09","nome": "Maria"},`
`{"data": "22-09", "nome": "Zeca"},`
`{"data": "23-09","nome": "Mario"},`
`{"data": "24-09","nome": "Gustavo"},`
`{"data": "27-09",nome": "Camila"},`
`{"data": "28-09","nome": "Pedro"},`
`{"data": "29-09","nome": "Juliana"},`
`{"data": "30-09",nome": "Gisele"}`

----------
### BACKEND - Spring Boot
- Após a criação do banco, poderá executar o servidor; através do link http://localhost:8080/swagger-ui.html, mostrará a documentação da API;

----------
### FRONTEND - Angular
- Primeiro passo é verificar se o Node.js está instalado na sua máquina e possui ela nas variáveis de ambiente.
- Entrar dentro da pasta *./resolution-front* e executar o comando `npm install node` através do terminal. Dessa forma, irá ser instalado o pacote *node-modules*, necessário para que o Angular funcione e compile; este pacote está contido no arquivo *.gitignore* por causa de sua vasta extensão de arquivos.
