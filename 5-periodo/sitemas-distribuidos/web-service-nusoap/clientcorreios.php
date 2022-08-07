<?php
/*
---------------------------------------------------------
:: Webservice SOAP com PHP e NuSOAP para consulta de CEP Correios
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Sistemas Distribuídos
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/

/////////////////////////////////////////////////////////
//SERVIÇO SOAP UTILIZANDO O NUSOAP
/////////////////////////////////////////////////////////

//1. Importo o nuSoap
require "nusoap.php";

//2. Crio o meu objeto do tipo cliente informando o endereço do nosso WSDL
$clientcep = new nusoap_client("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl", 'wsdl');

//4. Atribuo a uma variável o retorno do da função especificada no método Call.
$resultadoCep = $clientcep->call("consultaCEP", array("cep" => "56318080"));


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
	<h2>Busca CEP</h2>
	<?php 
			echo "<hr><h3>CEP ".$resultadoCep["return"]["cep"]."</h3>"; 
			echo "<b>Rua:</b>".$resultadoCep["return"]["end"]; 
			echo "<br><b>Bairro:</b>".$resultadoCep["return"]["bairro"]; 
			echo " <b>Cidade:</b>".$resultadoCep["return"]["cidade"]."/".$resultadoCep["return"]["uf"]; 
			

	?>
 
</div>
