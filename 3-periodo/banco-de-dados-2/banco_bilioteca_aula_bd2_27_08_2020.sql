CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE autores(
	codigo INT(11),
	nome VARCHAR(45) NOT NULL,
	nacionalidade VARCHAR(45),
	CONSTRAINT pk_autores PRIMARY KEY(codigo)
);

CREATE TABLE usuarios(
	cpf BIGINT(11),
	nome VARCHAR(45) NOT NULL,
	endereco VARCHAR(45) NOT NULL,
	telefone BIGINT(13),
	CONSTRAINT pk_usuarios PRIMARY KEY(cpf)
);

CREATE TABLE funcionarios(
	cpf BIGINT(11),
	NOME VARCHAR(45) NOT NULL,
	endereco VARCHAR(45) NOT NULL,
	telefone BIGINT(11) NOT NULL,
	salario DECIMAL(10, 2),
	funcao VARCHAR(45),
	CONSTRAINT pk_funcionarios PRIMARY KEY(cpf)
);

CREATE TABLE editoras(
	codigo INT(11) NOT NULL,
	nome VARCHAR(45) NOT NULL,
	endereco VARCHAR(45),
	contato VARCHAR(45),
	CONSTRAINT pk_editoras PRIMARY KEY(codigo)
);

CREATE TABLE livros(
	numero INT(11) NOT NULL,
	titulo VARCHAR(100) NOT NULL,
	genero VARCHAR(45) NOT NULL,
	edicao SMALLINT(4) NOT NULL,
	ano_publicacao YEAR(4) NOT NULL,
	cpf_funcionario BIGINT(11),
	codigo_editora INT(6),
	cpf_usuarioRetirar BIGINT(11),
	cpf_usuarioReservar BIGINT(11),
	livroscol VARCHAR(45),
	CONSTRAINT pk_livros PRIMARY KEY(numero),
	CONSTRAINT fk_liv_func FOREIGN KEY(cpf_funcionario) REFERENCES funcionarios(cpf),
	CONSTRAINT fk_liv_edi FOREIGN KEY(codigo_editora) REFERENCES editoras(codigo),
	CONSTRAINT fk_liv_funret FOREIGN KEY(cpf_usuarioRetirar) REFERENCES usuarios(cpf),
	CONSTRAINT fk_liv_funres FOREIGN KEY(cpf_usuarioReservar) REFERENCES usuarios(cpf)
);

CREATE TABLE livros_autores(
	numero_livro INT(11),
	codigo_autor INT(11),
	CONSTRAINT pk_livros_autores PRIMARY KEY(numero_livro,codigo_autor),
	CONSTRAINT fk_livAut_liv FOREIGN KEY(numero_livro) REFERENCES livros(numero),
	CONSTRAINT fk_livAut_aut FOREIGN KEY(codigo_autor) REFERENCES autores(codigo)
);