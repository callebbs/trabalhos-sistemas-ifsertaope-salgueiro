<?php
    require "nusoap.php";

    $clientcalc = new nusoap_client("http://www.dneonline.com/calculator.asmx?WSDL", 'wsdl');

    $numero1 = $_POST['numero1'];
    $numero2 = $_POST['numero2'];
    $operacao = $_POST['operacao'];
  
    if($operacao == "+"){
        $resultado = $clientcalc->call("Add", array("intA" => "$numero1", "intB" => "$numero2"));
    }else if($operacao == "-"){
        $resultado = $clientcalc->call("Subtract", array("intA" => "$numero1", "intB" => "$numero2"));
    }else if($operacao == "÷"){
        $resultado = $clientcalc->call("Divide", array("intA" => "$numero1", "intB" => "$numero2"));
    }else{
        $resultado = $clientcalc->call("Multiply", array("intA" => "$numero1", "intB" => "$numero2"));
    }
?>
<link href="https://fonts.googleapis.com/css2?family=Anton&family=Bebas+Neue&family=Lato:wght@100&family=Martel+Sans:wght@800&family=Mochiy+Pop+One&family=Montserrat:wght@100&family=Oswald:wght@200&family=Pacifico&display=swap" rel="stylesheet">
<style type="text/css">

	.caixa{
		margin: 0 auto; 
		background: #000000; 
		padding: 50px; 
		width:  300px;
		min-height: 100px;
		height: auto;
		text-align: center;
		border-radius:  10px;
		/* box-shadow: 1px 1px 50px #000; */
		border:  1px solid #000;
		margin-top:  50px;
        font-size: 1.2rem;
        font-family: 'Mochiy Pop One', sans-serif;
	}

    .caixa h1, h2, h3 {
        color: #b3b3b3;
    }

    .caixa hr{
        height: 3px;
        background: #000;
        color: orange;
        background-color: orange;
    }

    .caixa text {
        background-color: #b3b3b3;
    }

    .form{
        margin: 0 auto;
        display: flex;
        flex-direction: column;
    }

    .form input{
        padding: 10px;
        margin: 10px;
        border-radius: 5px;
    }

    .button{
        margin: 5px;
        padding: 10px;
        width: 50px;
        background: orange;
        border-radius: 50%;
        cursor: pointer;
        border:  1px solid #000;
    }

    input[type="text"], textarea {
        background-color : #d1d1d1; 
    }

    body {
            background-color: #A89E9E;
    }

</style>

<div class='caixa'>
    <form class="form" method="POST" action="">
        <h2>Calculadora online</h2>
        <input type="text" placeholder="digite um número" name="numero1">
        <input type="text" placeholder="digite um número" name="numero2">

        <h3>Escolha a operação:</h3>
        <section class="operacoes">
            <input type="submit" value="+" class="button" name="operacao">
            <input type="submit" value="-" class="button" name="operacao">
            <input type="submit" value="÷" class="button" name="operacao">
            <input type="submit" value="x" class="button" name="operacao">
        </section>
    </form>
    <hr>
	<h2 class="result">Resultado:</h2>
	<?php
        //6. Por fim dependendo de qual a operação é escolhida um resultado é mostrado na tela de acordo com a operação.
        if($operacao == "+"){
            echo"<h1>".$resultado["AddResult"]."</h1>"; 
        }else if($operacao == "-"){
            echo"<h1>".$resultado["SubtractResult"]."</h1>"; 
        }else if($operacao == "÷"){
            echo"<h1>".$resultado["DivideResult"]."</h1>";
        }else if($operacao == "x"){
            echo"<h1>".$resultado["MultiplyResult"]."</h1>";
        }
    ?>
</div>