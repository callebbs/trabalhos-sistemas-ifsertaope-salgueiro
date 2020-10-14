#Atividade 04 - Consulta de Dados Biblioteca

#1 Apresentar uma listagem com todos os dados de todos os autores.
SELECT * FROM autores;

#2 Liste os dados das editoras.
SELECT * FROM editoras;

#3 Apresentar um relatório com os dados dos funcionários.
SELECT * FROM funcionarios;

#4 Listar os dados dos livros.
SELECT * FROM livros;

#5 Listar os usuários.
SELECT * FROM usuarios;

#6 Fazer uma listagem dos títulos e gêneros dos livros,
DESC livros;
SELECT titulo, genero FROM livros;

#7 Apresentar uma listagem de funcionários com seus salários acrescidos de 30%.
SELECT * FROM funcionarios;

SELECT nome, 
		 salario, 
		 (salario * 1.3) AS "Novo salário" 
FROM funcionarios;

#8 Mostrar os funcionários com seus salários acrescidos de R$615,00

SELECT * FROM funcionarios;

SELECT nome,
		 salario,
		 (salario + 615) AS "Salario com Adicional de 615"
FROM funcionarios;

#9 Listar a nacionalidade dos autores.

SELECT * FROM autores;

SELECT nacionalidade FROM autores;

#10 Selecionar a média dos salaários dos funcionários de acordo com o endereço.
#Apesentar somente os grupos com a média maior que 1.000.

SELECT * FROM funcionarios;

SELECT endereco, AVG(salario) FROM funcionarios
GROUP BY endereco HAVING AVG(salario) > 1.000;

#11 Listar o livro publicado mais recentemente

SELECT * FROM livros;

SELECT titulo, ano_publicacao FROM livros
ORDER BY ano_publicacao;

#12 Apresentar a soma dos salários dos funcionários de Campinas.

SELECT * FROM funcionarios;
SELECT endereco, salario, SUM(salario) FROM funcionarios WHERE endereco = "Campinas";

#13 Selecionar os menores salários e suas respectivas cidades

SELECT * FROM funcionarios;
SELECT endereco, MIN(salario) FROM funcionarios;

#14 Listar a quantidade de funcionários que retiraram livros
DESC livros;
SELECT cpf_usuarioRetirar FROM livros GROUP BY funcionarios;