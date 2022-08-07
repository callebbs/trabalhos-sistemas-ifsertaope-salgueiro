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

/////////////////////////////////////////////////////////
//SERVIÇO SOAP UTILIZANDO O NUSOAP
/////////////////////////////////////////////////////////

//FAÇA DOWNLOAD DO NUSOAP E COLOQUE DENTRO DA PASTA DO SEU PROJETO
//DOWNLOAD NUSOAP: https://github.com/f00b4r/nusoap/releases/tag/v0.9.11

//IMPORTE O NUSOAP E O ARQUIVO FUNCTIONS
require "nusoap.php";
require "functions.php";

$server = new nusoap_server();

$server->configureWSDL("consulta", "urn:consulta");
$server->register(
	"preco", //nome da função
	array("nome" => "xsd:string"), //entradas
	array("result" => "xsd:float") //saídas
);
$server->service(file_get_contents("php://input"));
?>