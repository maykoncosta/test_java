<div align="center">
    <h1>Api de gerenciamento de carros</h1>
    <i>Uma api que é possível consultar marcas, modelos e carros</i>
</div>

<br />

<div align="center">
    <sup>Status</sup>
    <br />
  
[![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)](http://localhost:8080/swagger-ui/index.html#/)
</br>
alterar para /v2/api-docs

</div>
<br/>
<h2> Estrutura, Organização, e decisões da aplicação </h2>

<h3> A estrutura de código é baseada em camadas, onde temos as seguintes camadas: <h3>
 
- Entidade: é a camada responsável por representar a tabela no banco de dados, geralmente é feita com anotações JPA;
- Repositório: é a camada responsável por realizar as operações de CRUD na tabela do banco de dados, é feita com a interface JpaRepository;
- Service: é a camada responsável por regrar as regras de negócio, é onde as validações são feitas e também é onde a lógica para recuperar os dados do banco de dados é implementada;
- Controller: é a camada responsável por expor as APIs REST para serem acessadas pelos clientes, é onde as requisições HTTP são recebidas e as respostas são enviadas;
 
<h3> Decisões </h3>

- A decisão de utilizar o JPA foi para simplificar a realização de operações de CRUD no banco de dados, pois o JPA fornece uma abstração para o banco de dados e permite que o código seja desenvolvido sem precisar se preocupar com detalhes de implementação.

- O uso do Lombok é para reduzir a verbosidade do código, facilitando a manutenção e desenvolvimento.

- O Spring é utilizado como framework de aplicação, para gerenciar as dependências e realizar as configurações da aplicação de forma mais fácil e organizada.

- O Swagger é uma ferramenta que permite documentar e testar APIs de maneira fácil e eficiente. Com ele, é possível visualizar a estrutura da API, ver as informações sobre os endpoints, testar requisições e ver as respostas, sem precisar escrever código.
    
- CORS é uma boa prática para garantir a segurança e privacidade de dados em aplicativos web. É usado para proteger a privacidade e segurança dos dados, evitando que dados sejam acessados indevidamente por domínios não autorizados.
