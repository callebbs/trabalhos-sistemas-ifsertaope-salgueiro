CREATE DATABASE BD2_ProjetoFormula1;

CREATE TABLE PilotosF1(
	codigo INT(11),
	nome VARCHAR(20) NOT NULL,
	pais VARCHAR(20),
	endereco VARCHAR(30),
	idade INT(6),
	equipe INT(10) NOT NULL,
	motor VARCHAR(20),
	PRIMARY KEY(codigo)
);

ALTER TABLE PilotosF1 ADD COLUMN pontos INT(10);
ALTER TABLE PilotosF1 MODIFY COLUMN codigo_Ranking INT(10);


SELECT * FROM bd2_projetoformula1.pilotosf1;