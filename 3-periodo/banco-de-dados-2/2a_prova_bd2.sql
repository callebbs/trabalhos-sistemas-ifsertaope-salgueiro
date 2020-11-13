#1ª QUESTÃO

SELECT * FROM funcionario;

/*1.a) Liste os nomes e cargo dos empregados que são programadores e que tem menos de três anos de serviço. **/

SELECT nome, cargo FROM funcionario WHERE cargo LIKE 'Programador%' and tempoServico < 3;

/*1.b) Selecione os nomes e sobrenomes dos empregados que trabalham como Sênior ou que tem salários entre 7.000 e 8.000.*/

SELECT nome, sobrenome, cargo FROM funcionario WHERE cargo LIKE 'Senior%' OR salario BETWEEN 7000 AND 8000;

/*1.c) Selecione os nomes e tempo de serviço dos empregados cujo sobrenome começa com A ou S e tem tempo de serviço maior que 5. */

SELECT nome, tempoServico FROM funcionario WHERE sobrenome LIKE 'A%' OR 'S%' AND tempoServico > 5;

/*1.d) Selecione os nomes, sobrenomes e cargos dos empregados que não são programadores. */

SELECT nome, sobrenome, cargo from funcionario WHERE cargo NOT LIKE '%Programador%';

#QUESTÃO 02

/*2.a) Retorne o nome do departamento, nome do gerente e o salário do gerente para cada departamento. */

SELECT * FROM departamento;
SELECT * FROM funcionario;

SELECT f.PRIMEIRO_NOME AS 'Nome do Gerente', f.SALARIO AS 'Salário do Gerente', d.NOME_DEPARTAMENTO AS 'Nome do Departamento'
	FROM funcionario f
	INNER JOIN departamento d ON f.CPF = d.CPF_GERENTE;
	

/*2.b) Retorne o nome do funcionário, o nome do supervisor e o salário de cada funcionário que trabalha do departamento "Pesquisa". */

SELECT b.PRIMEIRO_NOME AS 'Funcionário', a.PRIMEIRO_NOME AS 'Supervisor', b.SALARIO AS 'Salário'
	FROM funcionario a
	INNER JOIN funcionario b
	WHERE a.cpf = b.CPF_SUPERVISOR AND b.NUMERO_DEPARTAMENTO = 5;

/*2.c) Retorne o nome do projeto, o nome do departamento que o controla, 
o número de funcionários e o total de horas trabalhadas por semana em cada projeto. */


SELECT DISTINCT p.NOME_PROJETO AS 'Projeto',  d.NOME_DEPARTAMENTO AS 'Departamento', COUNT(tr.CPF_FUNCIONARIO) 'Quantidade de Funcionários', 
 SUM(tr.HORAS) 'Horas Trabalhadas'
	FROM projeto p INNER JOIN trabalha_em tr ON tr.NUMERO_PROJETO = p.NUMERO_PROJETO
	INNER JOIN departamento d ON d.NUMERO_DEPARTAMENTO = p.NUMERO_DEPARTAMENTO
	GROUP BY tr.NUMERO_PROJETO;


/*2.d) Retorne o nome do projeto, o nome do departamento que o controla, 
o número de funcionários e o total de horas trabalhadas por semana no projeto para cada projeto 
com mais de um funcionário trabalhando nele. */


SELECT DISTINCT p.NOME_PROJETO AS 'Projeto',  d.NOME_DEPARTAMENTO AS 'Departamento', COUNT(tr.CPF_FUNCIONARIO) 'Quantidade de Funcionários', 
 SUM(tr.HORAS) 'Horas Trabalhadas'
	FROM projeto p INNER JOIN trabalha_em tr ON tr.NUMERO_PROJETO = p.NUMERO_PROJETO
	INNER JOIN departamento d ON d.NUMERO_DEPARTAMENTO = p.NUMERO_DEPARTAMENTO
	GROUP BY tr.NUMERO_PROJETO
	HAVING COUNT(tr.CPF_FUNCIONARIO) > 1;