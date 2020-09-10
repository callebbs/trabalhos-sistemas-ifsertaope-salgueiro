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

DESC nota_fiscal;