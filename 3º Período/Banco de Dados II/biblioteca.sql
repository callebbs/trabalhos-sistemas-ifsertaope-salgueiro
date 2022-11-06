-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.21 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando dados para a tabela biblioteca.autores: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `autores` DISABLE KEYS */;
INSERT INTO `autores` (`codigo`, `nome`, `nacionalidade`) VALUES
	(22564411, 'Walter Isaacson', 'Americana'),
	(55490076, 'Adélia Prado', 'Brasileira'),
	(77548854, 'Ana Lucia Jankovic Barduchi', 'Brasileira'),
	(85668900, 'Ethevaldo Siqueira', 'Brasileira'),
	(90984133, 'Steven K. Scott', 'Americana');
/*!40000 ALTER TABLE `autores` ENABLE KEYS */;

-- Copiando dados para a tabela biblioteca.editoras: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `editoras` DISABLE KEYS */;
INSERT INTO `editoras` (`codigo`, `nome`, `endereco`, `contato`) VALUES
	(2134000, 'Saraiva', 'São Paulo', '8003434'),
	(2287000, 'Eras', 'Brasilia', '8002432'),
	(3557000, 'Summer', 'Curitiba', '8002198'),
	(6655000, 'Pontos', 'São Paulo', '8005600'),
	(9898000, 'Marks', 'Rio de Janeiro', '8009000');
/*!40000 ALTER TABLE `editoras` ENABLE KEYS */;

-- Copiando dados para a tabela biblioteca.funcionarios: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
INSERT INTO `funcionarios` (`cpf`, `nome`, `endereco`, `telefone`, `salario`, `funcao`) VALUES
	(20321295096, 'João Alberto Smith', 'Itatiba', 22447865, NULL, NULL),
	(23161197700, 'Ana Salles Azir', 'Salto', 22317865, 0.00, 'Recepcionista'),
	(30361290876, 'Ademir José Silva', 'Campinas', 22317865, NULL, NULL),
	(32361298734, 'Luís Henrique Talles', 'Campinas', 21531785, 1800.00, 'Auxiliar'),
	(45403612087, 'Francisco José Almeida', 'Indaiatuba', 25417761, NULL, NULL),
	(61254590871, 'Lucia Vicentim', 'Salto', 21316565, 0.00, 'Bibliotecaria');
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;

-- Copiando dados para a tabela biblioteca.livros: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `livros` DISABLE KEYS */;
INSERT INTO `livros` (`numero`, `titulo`, `genero`, `edicao`, `ano_publicacao`, `cpf_funcionario`, `codigo_editora`, `cpf_usuarioRetirar`, `cpf_usuarioReservar`) VALUES
	(10277843, 'O Pelicano', 'Romance', 12, '1984', NULL, 2134000, NULL, NULL),
	(32176500, 'Salomão - O Homem...', 'Romance', 2, '2011', NULL, 2287000, NULL, NULL),
	(45112239, 'Steve Jobs - a Biografia', 'Biografia', 48, '2011', NULL, 2287000, 19321122213, NULL),
	(67392217, 'Empregabilidade...', 'Administração', 22, '1977', 32361298734, 9898000, NULL, NULL),
	(67554421, 'Bagagem', 'Poesia', 5, '1972', NULL, 6655000, NULL, 19321122213),
	(77680012, 'A Duração do Dia', 'Poesia', 1, '2010', NULL, 2134000, 10122020232, NULL),
	(87659908, 'Tecnologias que Mud...', 'Tecnologia', 2, '2007', NULL, 2134000, 70964411900, NULL);
/*!40000 ALTER TABLE `livros` ENABLE KEYS */;

-- Copiando dados para a tabela biblioteca.livros_autores: ~8 rows (aproximadamente)
/*!40000 ALTER TABLE `livros_autores` DISABLE KEYS */;
INSERT INTO `livros_autores` (`numero_livro`, `codigo_autor`) VALUES
	(32176500, 22564411),
	(45112239, 22564411),
	(10277843, 55490076),
	(67554421, 55490076),
	(77680012, 55490076),
	(67392217, 77548854),
	(87659908, 85668900);
/*!40000 ALTER TABLE `livros_autores` ENABLE KEYS */;

-- Copiando dados para a tabela biblioteca.usuarios: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`cpf`, `nome`, `endereco`, `telefone`) VALUES
	(10122020232, 'Maria de Lourdes Amaral', NULL, 35440089),
	(19321122213, 'José Francisco de Paula', NULL, 27219756),
	(22539910976, 'Ivete Medina Chernell', NULL, 48170352),
	(45399109881, 'Raquel Santos', NULL, 87603451),
	(70964411900, 'Luiza Souza Prado', NULL, 34559087);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
