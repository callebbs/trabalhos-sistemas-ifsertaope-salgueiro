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

//------------------------------------------------------------------------------------------
//OBS: Antes de iniciar, habilite o suporte ao SOAP no arquivo PHP.INI e reinicie o apache.
//------------------------------------------------------------------------------------------
//1. Importo o nuSoap
require "nusoap.php";

//2. Crio o meu objeto do tipo cliente informando o endereço do nosso WSDL do serviço criado anteriormente
$client = new nusoap_client("http://localhost/webservices/servicesoap.php?wsdl", 'wsdl');

//3. Salvo o nome do livro que desejo consultar
$nome_do_livro = "IHC";

//Posso também pegar o nome do livro pela URL
//$nome_do_livro = $_REQUEST['nome'];
//EXEMPLO: http://localhost/webservices/client.php?nome=IHC

//4. Atribuo a uma variável o retorno do da função especificada no método Call.
$preco = $client->call("preco",array('nome' => "$nome_do_livro"));

?>

<!-- APENAS MELHORANDO A APRESENTAÇÃO DO RESULTADO -->
<style type="text/css">
	.caixa{
		margin: 0 auto; 
		background: #f2f2f2; 
		padding: 50px; 
		width:  300px;
		min-height: 100px;
		height: auto;
		text-align: center;
		border-radius:  10px;
		box-shadow: 1px 1px 50px #b3b3b3;
		border:  1px solid #FFF;
		margin-top:  50px;
	}
</style>

<div class='caixa'>
	<h2>Preço do Livro <?php echo $nome_do_livro.":</h2>";
            //Exibindo o preço do livro
	    echo "<h1>$preco</h1>"
	?> 
</div>
