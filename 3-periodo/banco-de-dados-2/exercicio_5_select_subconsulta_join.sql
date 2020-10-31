/*
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