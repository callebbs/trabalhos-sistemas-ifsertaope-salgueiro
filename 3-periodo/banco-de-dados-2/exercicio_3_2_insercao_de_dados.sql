CREATE DATABASE biblioteca;

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

################################

#Atividade 03
#Inserção de dados

INSERT INTO funcionarios
VALUES
	(20321295096, 'João Alberto Smith', 'Itatiba', 22447865, 0.00, NULL),
	(23161197700, 'Ana Salles Azir', 'Salto', 22317865, 0.00, 'Recepcionista'),
	(30361290876, 'Ademir José Silva', 'Campinas', 22317865, 0.00, NULL),
	(32361298734, 'Luís Henrique Talles', 'Campinas', 21531785, 0.00, NULL),
	(45403612087, 'Francisco José Almeida', 'Indaiatuba', 25417761, 0.00, NULL),
	(61254590871, 'Lucia Vicentim', 'Salto', 21316565, 0.00, 'Bibliotecaria');
	
INSERT INTO editoras
VALUES
	(2134000, 'Saraiva', 'São Paulo', 8003434),
	(2287000, 'Eras', 'Brasilia', 8002432),
	(3557000, 'Summer', 'Curitiba', 8002198),
	(6655000, 'Pontos', 'São Paulo', 8005600),
	(9898000, 'Marks', 'Rio de Janeiro', 8009000);

INSERT INTO autores
VALUES
	(22564411, 'Walter Isaacson', 'Americana'),
	(55490076, 'Adélia Prado', 'Brasileira'),
	(77548854, 'Ana Lucia Jankovic Barduchi', 'Brasileira'),
	(85668900, 'Ethevaldo Siqueira', 'Brasileira'),
	(90984133, 'Steven K. Scott', 'Americana');
	
INSERT INTO livros_autores
VALUES
	(32176500, 22564411),
	(45112239, 22564411),
	(10277843, 55490076),
	(67554421, 55490076),
	(77680012, 55490076),
	(67392217, 77548854),
	(87659908, 85668900),
	(32176500, 90984133);
	
ALTER TABLE usuarios MODIFY COLUMN endereco VARCHAR(45) NULL;
	
INSERT INTO usuarios
VALUES
	(10122020232, 'Maria de Lourdes Amaral', NULL, 35440089),
	(19321122213, 'José Francisco de Paula', NULL, 27219756),
	(22539910976, 'Ivete Medina Chernell', NULL, 48170352),
	(45399109881, 'Raquel Santos', NULL, 87603451),
	(70964411900, 'Luiza Souza Prado', NULL, 34559087);
	
DESC livros;
SELECT * FROM usuarios;

ALTER TABLE livros DROP COLUMN livroscol;

INSERT INTO livros VALUES
	(10277843, 'O Pelicano', 'Romance', 12, 1984, NULL, 2134000, NULL, NULL),
	(32176500, 'Salomão - O Homem...', 'Romance', 2, 2011, NULL, 2287000, NULL, NULL),
	(45112239, 'Steve Jobs - a Biografia', 'Biografia', 48, 2011, NULL, 2287000, 19321122213, NULL),
	(67392217, 'Empregabilidade...', 'Administração', 22, 1977, 32361298734, 9898000, NULL, NULL),
	(67554421, 'Bagagem', 'Poesia', 5, 1972, NULL, 6655000, NULL, 19321122213),
	(77680012, 'A Duração do Dia', 'Poesia', 1, 2010, NULL, 2134000, 10122020232, NULL),
	(87659908, 'Tecnologias que Mud...', 'Tecnologia', 2, 2007, NULL, 2134000, NULL, 70964411900);
	
	
##PARTE 02 DA ATIVIDADE 03

#01 Atualize o funcionário de cpf 32361298734 para a função Auxiliar e salário 1.800,00;

SELECT * FROM funcionarios WHERE cpf = 32361298734;

UPDATE funcionarios SET salario = 1800, funcao = 'Auxiliar'
WHERE cpf = 32361298734;

#02 Exclua o usuario de cpf 45399109881;

SELECT * FROM funcionarios WHERE cpf = 45399109881;
select * FROM funcionarios;

INSERT INTO funcionarios (cpf, nome, endereco, telefone) VALUES
(45399109881, 'Teste', 'Salgueiro', 38711518);

DELETE FROM funcionarios WHERE cpf = 45399109881;

#03 Exclua o registro da tabela livros_autores, cujo número do livro 
# seja 32176500 e o código do autor seja 90984133;

SELECT * FROM livros_autores WHERE numero_livro = 32176500 AND codigo_autor = 90984133;

DELETE FROM livros_autores WHERE numero_livro = 32176500 AND codigo_autor = 90984133;

#04 Atualize a tabela livros, alterando o CPF_usuarioReservar para nulo 
# e o CPF_usuarioRetirar para 70964411900,
# isso para o registro cujo numero seja 87659908;

SELECT * FROM livros WHERE numero = 87659908;

UPDATE livros SET cpf_usuarioReservar = NULL, cpf_usuarioRetirar = 70964411900
WHERE numero = 87659908;

#05 Incluir dados na tabela Editora com as informações disponíveis no PDF.

SELECT * FROM editoras;

INSERT INTO editoras (codigo, nome, endereco, contato) VALUES
	(9900545, 'Elsevier', 'São Paulo', NULL),
	(4323458, 'Campus', 'Rio de Janeiro', 8009988),
	(9876546, 'Erica', 'Salvador', NULL);

#06 Altere os registro da tabela fucionários, para incluir a função Analista Contábil 
# para os funcionários de cpf 20321295096 e 45403612087

SELECT * FROM funcionarios WHERE cpf = 20321295096 OR cpf = 45403612087;

UPDATE funcionarios SET funcao = 'Analista Contábil' WHERE CPF = 20321295096 OR cpf = 45403612087;

#07 Altere os registros da tabela Funcionários para:
# a) Se o cargo for Analista Contábil, incluir o salário 5.000,00.
# b) Se o cargo estiver nulo, colocar a função Auxiliar administrativo e o Salário 2.000,00.

UPDATE funcionarios SET salario = 5000 WHERE funcao = 'Analista Contábil';

SELECT * FROM funcionarios WHERE funcao = 'Analista Contábil';
SELECT * FROM funcionarios WHERE funcao IS NULL;

SELECT * FROM funcionarios;

UPDATE funcionarios SET funcao = 'Auxiliar Administrativo', salario = 2000 WHERE funcao IS NULL;

#08 Exclua os campos da tabela Editoras cujo endereço seja Salvador

SELECT * FROM editoras WHERE endereco = 'Salvador';

DELETE FROM editoras WHERE endereco = 'Salvador';

SELECT * FROM editoras;

#09 Altere os registro da tabela fucionários para deixar os campos função e salário nulos,
# quando a função for Analista Contábil ou Auxiliar Administrativo.

SELECT * FROM funcionarios;

UPDATE funcionarios SET funcao = NULL, salario = NULL WHERE funcao = 'Analista Contábil';
UPDATE funcionarios SET funcao = NULL, salario = NULL WHERE funcao = 'Auxiliar Administrativo';
SELECT * FROM funcionarios WHERE funcao = 'Analista Contábil' OR funcao = 'Auxiliar Administrativo';

#10 Exclua os registros das edituras Elsevier e Campus

SELECT * FROM editoras WHERE nome = 'Elsevier' OR nome = 'Campus';

DELETE FROM editoras WHERE nome = 'Elsevier' OR nome = 'Campus';