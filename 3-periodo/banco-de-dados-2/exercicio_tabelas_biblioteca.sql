CREATE TABLE autores(
	codigo INT(11) NOT NULL,
	nome VARCHAR(45) NOT NULL,
	nacionalidade VARCHAR(45),
	CONSTRAINT pk_autores PRIMARY KEY(codigo)
);

CREATE TABLE editoras(
	codigo INT(11) NOT NULL,
	nome VARCHAR(45) NOT NULL,
	endereco VARCHAR(45),
	contato VARCHAR(45),
	CONSTRAINT pk_editoras PRIMARY KEY(codigo)
);

CREATE TABLE funcionarios(
	cpf BIGINT(11) NOT NULL,
	nome VARCHAR(45)  NOT NULL,
	endereco VARCHAR(45) NOT NULL,
	telefone BIGINT(11) NOT NULL,
	salario DECIMAL(10,2),
	funcao VARCHAR(45),
	CONSTRAINT pk_funcionarios PRIMARY KEY(cpf)
);

CREATE TABLE usuarios(
	cpf BIGINT(11) NOT NULL,
	nome VARCHAR(45) NOT NULL,
	endereco VARCHAR(45) NOT NULL,
	telefone BIGINT(11),
	CONSTRAINT pk_usuarios PRIMARY KEY(cpf)
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
	CONSTRAINT fk_livros_func FOREIGN KEY(cpf_funcionario) REFERENCES funcionarios(cpf),
	CONSTRAINT fk_livros_edit FOREIGN KEY(codigo_editora) REFERENCES editoras(codigo),
	CONSTRAINT fk_user_ret FOREIGN KEY(cpf_usuarioRetirar) REFERENCES usuarios(cpf),
	CONSTRAINT fk_user_res FOREIGN KEY(cpf_usuarioReservar) REFERENCES usuarios(cpf)
);

CREATE TABLE livros_autores(
	numero_livro INT(11) NOT NULL,
	codigo_autor INT(11) NOT NULL,
	CONSTRAINT pk_livros_autores PRIMARY KEY(numero_livro, codigo_autor),
	CONSTRAINT fk_livros_autores_numero FOREIGN KEY(numero_livro) REFERENCES livros(numero),
	CONSTRAINT fk_livros_autores_codigo FOREIGN KEY(codigo_autor) REFERENCES autores(codigo)
);