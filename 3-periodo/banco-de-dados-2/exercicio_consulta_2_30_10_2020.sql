CREATE DATABASE bd2_sistema_bancario;

CREATE TABLE ContasPagarReceber(
	CodigoHistorico INT(10) PRIMARY KEY,
	DataVencimento DATE NOT NULL,
	Documento VARCHAR(10) NOT NULL,
	Valor INT(10) NOT NULL,
	Tipo VARCHAR(4) NOT NULL
);

INSERT INTO ContasPagarReceber VALUES
(1,'2013-03-25','NF.142526',15.50,'CP'),
(2,'2013-03-26','NF.582451',52.70,'CP'),
(3,'2013-03-27','NF.361215',125.80,'CP'),
(4,'2013-03-28','NF.412218',216.90,'CP');

SELECT * FROM contaspagarreceber WHERE valor < 100;

SELECT * FROM contaspagarreceber WHERE valor >= 200;

SELECT * FROM contaspagarreceber WHERE valor >= 100 AND  valor <= 200;

SELECT * FROM contaspagarreceber WHERE valor BETWEEN 100 AND 200;

SELECT * FROM contaspagarreceber WHERE valor > 100 AND  valor < 200;

SELECT * FROM contaspagarreceber WHERE valor > 100 AND DataVencimento BETWEEN '2013-03-01' AND '2013-03-26';