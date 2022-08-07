<?php
/*
---------------------------------------------------------
:: Webservice SOAP com PHP e NuSOAP
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Sistemas Distribuídos
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/

//Esta é a função que será registrada no nosso webservice

function preco($nome){
  
  //Os dados dos livros estão cadastrados nesse array para que terceiros possam consultá-los
		$livros = Array(
			'Programação' => 89.99,
			'Redes de Computadores' => 126.80,
			'IHC' => 74.99
		);
    
  //Percorremos o array verificando se algum dos livros possui nome igual ao da variável $nome passada por parâmetro na função
		foreach ($livros as $key => $value) {
			if($nome == $key){
				$preco = $value;
			}
		}
  //Retorno o preço do livro
		return $preco;
	}


?>