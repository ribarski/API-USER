RoadMap - JAVA
Este repositório contém um roadmap para desenvolvimento em Java, abordando desde conceitos fundamentais da Programação Orientada a Objetos (POO), até práticas de desenvolvimento como SOLID, Clean Code, Design Patterns, Spring, e mais.

Pilares da Programação Orientada a Objetos (POO)
1. Encapsulamento
Objetivo: Proteger a implementação interna e garantir que apenas a interface externa seja acessível.
Benefícios:
Ocultar detalhes de implementação.
Manter um padrão de acesso controlado e seguro.
2. Herança
Objetivo: Estender uma classe base (classe pai) para herdar seus métodos e atributos.
Restrições:
Uma classe filha pode estender apenas uma classe pai.
3. Polimorfismo
Objetivo: Permitir que um mesmo nome de método tenha comportamentos diferentes.

Tipos:

Sobrecarga de Métodos: Métodos com o mesmo nome, mas assinaturas diferentes dentro da mesma classe.
Sobreposição de Métodos: Métodos com a mesma assinatura, mas implementações diferentes em classes derivadas.
4. Modificadores de Acesso
public: Acessível de qualquer lugar.
private: Acessível apenas dentro da própria classe.
protected: Acessível dentro da classe, em subclasses (mesmo em pacotes diferentes) e no mesmo pacote.
Classes Abstratas
Objetivo: Criar classes que não podem ser instanciadas diretamente, mas podem servir como base para outras classes.
Características:
Métodos abstratos (sem implementação) e concretos (com implementação).
Atributos e construtores.
Vantagens: Reutilização de código e estruturação adequada.
Tipos Primitivos vs Não Primitivos (Wrappers)
Tipos Primitivos:
Representam valores simples (como int, boolean).
Não possuem métodos associados.
Tipos Não Primitivos:
São objetos e, portanto, possuem métodos.
Maior sobrecarga de memória e desempenho.
Usados principalmente em coleções e operações que exigem funcionalidades adicionais.
Princípios SOLID
1. S - Princípio da Responsabilidade Única
Objetivo: Cada classe deve ter uma única responsabilidade.
Benefícios: Menor acoplamento e maior coesão.
2. O - Princípio Aberto-Fechado
Objetivo: Entidades devem estar abertas para extensão, mas fechadas para modificação.
Benefícios: Maior flexibilidade e menor risco de quebrar funcionalidades existentes.
3. L - Princípio da Substituição de Liskov
Objetivo: Classes derivadas devem ser substituíveis por suas classes base sem afetar a funcionalidade.
4. I - Princípio da Segregação de Interface
Objetivo: Criar interfaces específicas em vez de interfaces genéricas.
5. D - Princípio da Inversão de Dependência
Objetivo: Depender de abstrações e não de implementações concretas.
Spring Framework
Principais Anotações:
@Entity: Define que a classe é uma entidade JPA.
@Table(name = ""): Especifica o nome da tabela no banco de dados.
@Autowired: Injeta dependências automaticamente.
@RestController: Define um controlador REST.
@RequestMapping, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Mapeia as requisições HTTP para métodos do controlador.
@Valid: Valida dados no corpo da requisição.
@ExceptionHandler: Captura e trata exceções.
Status HTTP:
200 OK: Requisição bem-sucedida.
201 Created: Recurso criado com sucesso.
400 Bad Request: Requisição inválida.
404 Not Found: Recurso não encontrado.
500 Internal Server Error: Erro interno do servidor.
Clean Code
Objetivo: Escrever código legível, simples, eficiente e sem duplicações.
Benefícios: Maior facilidade na manutenção, maior produtividade e melhor compreensão por outros desenvolvedores.
API Gateway
Objetivo: Gerenciar sistemas com múltiplos microsserviços, oferecendo um único ponto de entrada para o sistema.
Benefícios:
Facilita a comunicação entre serviços.
Permite a autenticação/autorização centralizada.
Exemplo: AWS Gateway, Oracle Gateway.
Design Patterns
1. Factory Pattern
Objetivo: Criar objetos sem expor a lógica de criação.
Benefícios: Reduz acoplamento e facilita a manutenção.
2. Builder Pattern
Objetivo: Evitar métodos complexos ao construir objetos, utilizando um construtor fluente.
Webhooks
Objetivo: Arquitetura orientada a eventos, onde a API notifica outra API quando uma ação é concluída.
Exemplo: Comunicação entre APIs usando GET para consulta e POST para resposta assíncrona.
Tecnologias e Ferramentas
Spring Framework
Java
PostgreSQL
Redis
Angular
Docker & Kubernetes
AWS (SNS, Lambda, API Gateway)
