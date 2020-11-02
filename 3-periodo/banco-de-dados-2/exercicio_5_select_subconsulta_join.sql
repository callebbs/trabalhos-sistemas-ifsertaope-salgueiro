/*

QUESTÃO 01

De acordo com o esquema:
Funcionarios(idFuncionario, nome, sobrenome, cargo, idade, tempoServico, salario)

a) Liste os nomes e sobrenomes dos empregados que são programadores.

b) Selecione os nomes e sobrenomes dos empregados que tem menos de três anos de serviço.

c) Selecione os nomes e sobrenomes dos empregados cujo nome começa com a letra J.

d) Selecione os nomes e sobrenomes dos empregados que trabalham como Senior.

e) Selecione os nomes e sobrenomes dos empregados que têm salário entre 7.000 e 9.000.

f) Selecione os nomes, sobrenomes e idades dos empregados cujo sobrenome começa com A ou S e
têm idade menor que 30.

g) Selecione os nomes, sobrenomes e cargos dos empregados que não são programadores.

h) Selecione os nome, sobrenomes e idades dos empregados ordenados por idade, de forma
descendente e limitados a apenas quatro registros
*/

#criando a tabelas

CREATE TABLE Funcionarios(
	idFuncionario INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(20) NOT NULL,
	sobrenome VARCHAR(20) NOT NULL,
	cargo VARCHAR(20) NOT NULL,
	idade INT(2) NOT NULL,
	tempoServico INT(2) NOT NULL,
	salario DECIMAL(20,2) NOT NULL
);

#inserindo dados

INSERT INTO Funcionarios (nome, sobrenome, cargo, idade, tempoServico, salario)
	VALUES
		('Jose', 'Soares', 'Programador', 29, 3, 7000),
		('Calleb', 'Bezerra', 'Programador', 31, 3, 7000),
		('Vitoria', 'Mickele', 'Designer', 18, 1, 3000),
		('Alexandre', 'Freire', 'Programador', 19, 3, 7000),
		('Marcelo', 'Santos', 'Senior', 32, 5, 8000),
		('Alvaro', 'Silva', 'Gerente', 40, 10, 10000),
		('Flavia', 'Lucas', 'Advogada', 28, 4, 8000),
		('Iane', 'Larissa', 'Advogada', 22, 4, 8000),
		('Paloma', 'Lucas', 'Social Media', 22, 1, 3000),
		('Jose', 'Martins', 'Analista', 25, 2, 3000),
		('Jeremias', 'Batista', 'Quality Checker', 25, 2, 3000),
		('Felipe', 'Esdras', 'Gerente', 22, 3, 7000),
		('Sabrina', 'Lucas', 'YouTuber', 28, 3, 7000);	
		
#a) Liste os nomes e sobrenomes dos empregados que são programadores.

DELETE FROM funcionarios WHERE sobrenome = 'Soares';

SELECT nome AS Nome, sobrenome AS Sobrenome, cargo AS Cargo 
	FROM funcionarios 
	WHERE cargo = 'Programador'

#b) Selecione os nomes e sobrenomes dos empregados que tem menos de três anos de serviço.

SELECT nome Nome, sobrenome Sobrenome, tempoServico AS 'Tempo de Serviço'
	FROM funcionarios
	WHERE tempoServico < 3;

#c) Selecione os nomes e sobrenomes dos empregados cujo nome começa com a letra J.
SELECT nome Nome, sobrenome Sobrenome
	FROM funcionarios
	WHERE nome LIKE 'J%';
	
#d) Selecione os nomes e sobrenomes dos empregados que trabalham como Senior.
SELECT nome Nome, sobrenome Sobrenome, cargo Cargo
	FROM funcionarios
	WHERE cargo = 'Senior';
	
#e) Selecione os nomes e sobrenomes dos empregados que têm salário entre 7.000 e 9.000.
SELECT nome Nome, sobrenome Sobrenome, salario 'Salário'
	FROM funcionarios
	WHERE salario >= 7000 AND salario <=9000
	ORDER BY salario DESC;
	
#f) Selecione os nomes, sobrenomes e idades dos empregados cujo sobrenome começa com A ou S e
#têm idade menor que 30.

SELECT nome Nome, sobrenome Sobrenome, idade Idade
	FROM funcionarios
	WHERE sobrenome LIKE 'A%' OR sobrenome LIKE 'S%'
	AND idade < 30;

#g) Selecione os nomes, sobrenomes e cargos dos empregados que não são programadores.
SELECT nome Nome, sobrenome Sobrenome, cargo Cargo
	FROM funcionarios
	WHERE NOT cargo = 'Programador'
	ORDER BY cargo ASC;

#h) Selecione os nome, sobrenomes e idades dos empregados ordenados por idade, de forma
#descendente e limitados a apenas quatro registros

SELECT nome Nome, sobrenome Sobrenome, idade Idade 
	FROM funcionarios
	ORDER BY idade DESC
	LIMIT 4;
	
/*
QUESTÃO 02

Considerando a tabela, Elabore as seguintes consultas:

a) Selecione os nomes dos cursos, créditos e valores e mostre com os respectivos nomes:
Nome_Curso, Créditos e Preços.
b) Mostre os créditos dos cursos sem valores repetidos.
c) Selecione os códigos e nomes de cursos com valores entre 300 e 400.
d) Selecione os cursos que tenham Software no seu nome.
e) Selecione o nome e valor dos cursos com valores abaixo de 300 (inclusive).
f) Selecione nome e créditos dos cursos e acrescente 6 créditos.
g) Selecione os cursos de 6 créditos e valores acima de 200.

*/ 

#criando tabelas
CREATE TABLE curso(
	codigo VARCHAR(4) NOT NULL PRIMARY KEY,
	nome VARCHAR(40) NOT NULL,
	creditos INT(4) NOT NULL,
	valor DECIMAL(5,2) NOT NULL
);

#inserindo dados
INSERT INTO curso 
	VALUES
	('10-A', 'Sistemas Operacionais', 6, 200),
	('20-B', 'Redes', 12, 350),
	('10-C', 'Java', 10, 200),
	('30-A', 'Banco de Dados', 10, 300),
	('40-B', 'Computação Gráfica', 6, 250),
	('20-C', 'Orientação a Objetos', 6, 200),
	('11-A', 'Inteligência Artificial', 12, 300),
	('35-C', 'Projeto de Software', 8, 350),
	('56-E', 'Qualidade de Software', 12, 400);
	
#a) Selecione os nomes dos cursos, créditos e valores e mostre com os respectivos nomes:
#   Nome_Curso, Créditos e Preços.

SELECT nome Nome_Curso, creditos Créditos, valor Preço FROM curso;

#b) Mostre os créditos dos cursos sem valores repetidos.

SELECT distinct creditos Créditos FROM curso;

#c) Selecione os códigos e nomes de cursos com valores entre 300 e 400.
SELECT codigo, nome, valor FROM curso WHERE valor BETWEEN 300 AND 400;

#d) Selecione os cursos que tenham Software no seu nome.
SELECT nome FROM curso WHERE nome LIKE '%Software%';

#e) Selecione o nome e valor dos cursos com valores abaixo de 300 (inclusive).
SELECT nome 'Nome do Curso', valor Valor FROM curso WHERE valor <= 300 ORDER BY valor DESC;

#f) Selecione nome e créditos dos cursos e acrescente 6 créditos.
SELECT nome Nome, creditos 'Créditos', (creditos+6) AS 'Novos créditos' FROM curso;

#g) Selecione os cursos de 6 créditos e valores acima de 200.
SELECT nome, creditos, valor FROM curso WHERE creditos = 6 AND valor > 200;