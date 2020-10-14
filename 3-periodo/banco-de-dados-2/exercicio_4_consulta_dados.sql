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

#8