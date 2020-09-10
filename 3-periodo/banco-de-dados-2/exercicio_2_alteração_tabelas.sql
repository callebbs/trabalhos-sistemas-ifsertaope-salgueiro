#atividade 2
#Criar o banco ATIVIDADE2;
CREATE DATABASE atividade2;

#Criar a tabela: "NOTA_FISCAL" - 
#Campos: numero VARCHAR(8), "data" DATE
CREATE TABLE nota_fiscal(
	numero VARCHAR(8),
	data_nf DATE
);

#Com ALTER TABLE, defina a chave primária para a tabela NOTA_FISCAL
#criada (campo numero).
ALTER TABLE nota_fiscal ADD CONSTRAINT pk_nota_fiscal PRIMARY KEY(numero);

#4 Definir o campo "data" para não aceitar valores nulos
ALTER TABLE nota_fiscal MODIFY data_nf DATE NOT NULL;

#5 Criar o campo total_nota_fiscal NUMERIC(6,2)
ALTER TABLE nota_fiscal 
	ADD COLUMN total_nota_fiscal NUMERIC(6,2)
	
#6 Alterar o campo total_nota_fiscal para que não possa ser nulo
ALTER TABLE nota_fiscal MODIFY COLUMN total_nota_fiscal NUMERIC(6,2) NOT NULL;

#7 Atribuir o valor padrão zero ao campo total_nota_fiscal de NOTA_FISCAL
ALTER TABLE nota_fiscal ALTER total_nota_fiscal SET DEFAULT 0;
ALTER TABLE nota_fiscal MODIFY COLUMN total_nota_fiscal NUMERIC(6,2) NOT NULL DEFAULT 0;

#8 Atribuir a data corrente ao campo data da NOTA_FISCAL.
ALTER TABLE nota_fiscal MODIFY COLUMN data_nf TIMESTAMP NOT NULL DEFAULT NOW();

#9 Criar a tabela ITENS_NOTA_FISCAL – campos: "numero" NUMERIC(12,0),
# “codigo_produto" INTEGER, "numero_nota_fiscal" VARCHAR(8),
# "quantidade" NUMERIC(8,2), "valor_item" NUMERIC(8,2), "total_item"
# NUMERIC(8,2).

CREATE TABLE itens_nota_fiscal(
	numero NUMERIC(12,0),
	codigo_produto INTEGER,
	numero_nota_fiscal VARCHAR(8),
	quantidade NUMERIC(8,2),
	valor_item NUMERIC(8,2),
	total_item NUMERIC(8,2)
);

#10 Excluir o campo numero da tabela ITENS_NOTA_FISCAL.

ALTER TABLE itens_nota_fiscal DROP COLUMN numero;

#11 Exigir o preenchimento de todos os campos de ITENS_NOTA_FISCAL

ALTER TABLE itens_nota_fiscal
	MODIFY COLUMN codigo_produto INTEGER NOT NULL,
	MODIFY COLUMN numero_nota_fiscal VARCHAR(8) NOT NULL,
	MODIFY COLUMN quantidade NUMERIC(8,2) NOT NULL,
	MODIFY COLUMN valor_item NUMERIC(8,2) NOT NULL,
	MODIFY COLUMN total_item NUMERIC(8,2) NOT NULL;

#12 Validar o campo total_item da tabela ITENS_NOTA_FISCAL (TOTAL_ITEM =
# QUANTIDADE * VALOR_ITEM)
CHECK NÃO ESTÁ FUNCIONANDO;

#13 Criar a tabela PRODUTOS – Campos: "codigo" INTEGER NOT NULL, "nome"
# VARCHAR(80) NOT NULL, "nome_fantasia" VARCHAR(20),
# "estoque_minimo" NUMERIC(14,4), "data_cadastro" DATE NOT NULL,
# CONSTRAINT "PRODUTOS_pkey" PRIMARY KEY("codigo").

CREATE TABLE produtos(
	codigo INTEGER NOT NULL,
	nome VARCHAR(80) NOT NULL,
	nome_fantasia VARCHAR(20),
	estoque_minimo NUMERIC(14,4),
	data_cadastro DATE NOT NULL,
	CONSTRAINT pk_produtos PRIMARY KEY(codigo)
);

#14 Inserir novamente a coluna "numero" NUMERIC(12,0) na tabela
#ITENS_NOTA_FISCAL, que deverá ser configurada como chave primária.
ALTER TABLE itens_nota_fiscal ADD COLUMN numero BIGINT(12);

ALTER TABLE itens_nota_fiscal ADD CONSTRAINT pk_itens_nota_fiscal PRIMARY KEY(numero);

#15 Criar as chaves estrangeiras da tabela ITENS_NOTA_FISCAL
#(codigo_produto) e (numero_nota_fiscal).

ALTER TABLE itens_nota_fiscal ADD CONSTRAINT fk_itens_nota_fiscal_codigo FOREIGN KEY(codigo_produto) 
	REFERENCES produtos(codigo);
ALTER TABLE itens_nota_fiscal ADD CONSTRAINT fk_itens_nota_fiscal_numero FOREIGN KEY(numero_nota_fiscal) 
	REFERENCES nota_fiscal(numero);


DESC nota_fiscal;
DESC itens_nota_fiscal;
DESC produtos;