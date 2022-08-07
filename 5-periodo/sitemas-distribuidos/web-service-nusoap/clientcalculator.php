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

//2. Instancio o meu objeto do ctipo nusoap_client passando o endereço do WSDL
$clientcalc = new nusoap_client("http://www.dneonline.com/calculator.asmx?WSDL", 'wsdl');

//3. Crio duas variáveis que serão passadas por parâmetro (Os elementos a serem somados)
$a = 2;
$b = 3;

//4. Atribuo a uma variável o retorno do da função especificada no método Call.
$resultado = $clientcalc->call("Add", array("intA" => "$a", "intB" => "$b"));

//5. Imprimo o resutlado na tela
?>

<div class='caixa'>
	<h2>Calculo de Soma</h2>
	<?php echo "<h1>".$resultado["AddResult"]."</h1>"; ?>
 
</div>