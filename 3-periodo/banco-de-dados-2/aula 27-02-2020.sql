CREATE TABLE funcionarios(
cpf INT(12) NOT NULL,
nome VARCHAR(50) NOT NULL,
endereco VARCHAR(40) NOT NULL,
telefone INT(20) NOT NULL,
salario FLOAT(5, 2) NOT NULL,
funcao VARCHAR(20) NOT NULL,
CONSTRAINT pk_funcionarios PRIMARY KEY (cpf));

CREATE TABLE editoras(
codigo INT(20) NOT NULL,
nome VARCHAR(255) NOT NULL,
endereco VARCHAR(255) NOT NULL,
contato INT(20) NOT NULL,
CONSTRAINT pk_editoras PRIMARY KEY (codigo));

CREATE TABLE usuarios(
cpf INT(12) NOT NULL,
nome VARCHAR(40) NOT NULL,
endereco VARCHAR(40) NOT NULL,
telefone INT(20) NOT NULL,
CONSTRAINT pk_usuarios PRIMARY KEY(cpf));

CREATE TABLE livros(
numero INT(20) NOT NULL,
titulo VARCHAR(40) NOT NULL,
genero VARCHAR(20) NOT NULL,
edicao VARCHAR(20) NOT NULL,
ano_publicacao DATE NOT NULL,
CPF_funcionario INT,
cod_editora INT(20) NOT NULL,
CPF_usuarioRetirar INT,
CPF_usuarioReservar INT,
CONSTRAINT pk_livros PRIMARY KEY(numero),
CONSTRAINT fk_CPF_funcionario FOREIGN KEY(CPF_funcionario)
REFERENCES funcionarios(cpf),
CONSTRAINT fk_CPF_usuario FOREIGN KEY(CPF_usuarioRetirar)
REFERENCES usuarios(cpf),
CONSTRAINT fk_CPF_usuario2 FOREIGN KEY(CPF_usuarioReservar)
REFERENCES usuarios(cpf),
CONSTRAINT fk_cod_editora FOREIGN KEY(cod_editora)
REFERENCES editoras(codigo));


CREATE TABLE livros_autores(
numero_livro INT,
cod_autor INT,
CONSTRAINT pk_numero_livro PRIMARY KEY(numero_livro,cod_autor),
CONSTRAINT fk_livros_autores FOREIGN KEY(numero_livro)
REFERENCES livros(numero),
CONSTRAINT fk_cod_autor FOREIGN KEY(cod_autor)
REFERENCES autores(codigo));


CREATE TABLE autores(
codigo INT,
nome VARCHAR(40) NOT NULL,
nacionalidade VARCHAR(10) NOT NULL,
CONSTRAINT pk_autores PRIMARY KEY(codigo));



