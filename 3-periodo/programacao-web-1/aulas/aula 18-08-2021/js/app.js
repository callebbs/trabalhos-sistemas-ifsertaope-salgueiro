// DOM é utilizado pelo navegador para representar páginas web

//Retorna todos os nós do filho body dentro de um NodeList
//NodeList = Lista Ordenada de Nós

/*
console.log(
    document.body.childNodes
)

var lista = document.body.childNodes

//Retornando o índice com conteúdo

//alert(lista[5].innerHTML)

//Retorna o nome do nó
alert(lista[1].nodeName)




//Sempre irá retornar o 1, 2 ou 8
//1 - É um nó de elemento
//2 - é um nó de atributo
//3 - é um nó de texto
//8 - é um nó de comentário
alert(lista[1].nodeType)

//No exemplo acima retorna 8



//Retorna null para nós de elementos
//Retorna valor do atributo em nós de atributos
//Retorna o conteúdo em caso de nós de texto e comentários
alert(lista[1].nodeValue)

//No exemplo acima retorna Botão


//Acessando o nó 5, juntamente com todos os nós filhos desse índice
alert(lista[5].childNodes[3].childNodes[0].nodeValue)

//Acessando o nó de parágrafo



//Retornando Nós pais
console.log(
    document.getElementById("ilheus").parentNode.parentNode.parentElement.parentNode
)



//Alterando atributos e retornando o atributo alterado dentro de
//dentro de uma tag p

document.getElementById("btn-set").addEventListener("click", function(){
    document.getElementById("title").setAttribute("class", "red")
})

document.getElementById("btn-remove").addEventListener("click", function(){
    document.getElementById("title").removeAttribute("class")
})

document.getElementById("btn-get").addEventListener("click", function(){
    var value = document.getElementById("title").getAttribute("class")
    document.getElementById("class").innerHTML = value
})


//Criando um texto e inserindo na tag

var titulo = document.querySelector("h1")
var texto = document.createTextNode("Um texto qualquer")

titulo.appendChild(texto)

titulo.textContent = "Um novo texto"


//Inserindo elementos antes de outro elemento

var lista = document.getElementsByTagName("ul")[0]
// var itens = document.getElementsByTagName("li")
var itens = lista.children

var novoItem = document.createElement("li")

novoItem.textContent = "Suco de laranja"

//Seleciona o elemento pai

lista.insertBefore(novoItem, itens[2])

//console.log(lista)
//console.log(itens)

//Substituindo elementos

var lista2 = document.getElementsByTagName("ul")[1]
var itens2 = lista2.children

var novoItem2 = document.createElement("li")
novoItem2.textContent = "Margarina"

lista2.replaceChild(novoItem2, itens2[2])

//Margarina entrou no lugar de Nutella

console.log(lista2)



// TIPOS DE DADOS NO JAVASCRIPT - Tipagem Dinâmica

//  STRING

var nome = "Calleb Bezerra"

// NUMBER
// O tipo numérico aceita qualquer número (float, interger)

var idade = 50.50

// BOOLEAN

var solteiro = true //false

// ARRAY

var frutas = ["goiaba", "maçã", "banana"]

//Retorna object e não array. Pois array é um tipo especial de objeto

// OBJECT

var carro = new Object()
carro.fabricacao = "2025"
carro.cor = "preto"

//Informa o tipo da variável
// alert(typeof(carro))

// Retornando o tipo da variável objeto com atributos
// alert(carro.cor)

// FUNCTION

var soma = function(a, b) {
    return a+b
}

// alert(soma(6, 7))
alert(typeof(soma(6,7))) //Retorna number pois o resultado é um número

alert(typeof(soma)) // Retorna function pois está pegando a variável com a função dentro




// Variáveis
// Escopo global, escopo local

// JavaScript é Case Sensitive

// var (escopo global), 
// let (dentro do bloco), 
// const

// var nome - NOME (São diferentes - Case Sensitive)

// Não recomendável utilizar $ e _

// Boas práticas: nome com letras minúsculas, duas palavras camelCase nomeCompleto

//escopo global
//var nome = "Calleb"

//declarando em escopo local
if(true) {
    //nome = "Anakin"
    var nome = "Calleb"
    console.log(nome)
}
//var acaba escapando do escopo.
// utilizar var é uma má prática
//console.log(nome)



// escopo local - utilizar o let
if(true) {
    let nome = "Calleb"
    nome = "Anakin"
    console.log(nome)
}



//escopo global

let nome = "Calleb"

if(true) {
    nome = "Anakin"
    console.log(nome)
}



// const - variável com valor fixo (não alterável)

const nome = "Calleb"

nome = "ricardo"

console.log(nome) // Mensagem de erro



// Arrays
// Estrutura de dados que armazena uma coleção de elementos

let meuArray = ['notebook', 'mouse']
console.log(meuArray)


// Retornando o tamanho do array

let meuArray = ['notebook', 1500.00, {memoria: '16gb', hd: "100gb"}]
console.log(meuArray.length)

// Array utiliza colchetes [] e Objetos utiliza-se chaves {}

console.log(meuArray[0])
console.log(meuArray[1])
console.log(meuArray[2].memoria) //Acessando objeto
console.log(meuArray[2].hd)

let meuArray2 = [
    'notebook',
    '1500',
    {memoria: '16gb', hd: '100gb'},
    ['notebook dell', 'modelo 1000']
]

console.log(meuArray2[0])
console.log(meuArray2[1])
console.log(meuArray2[2]).memoria
console.log(meuArray2[2]).hd
console.log(meuArray2[3][0])



// Objetos

// Coleção de propriedades, e uma propriedade é
// uma associação entre um nome (ou chave) e um valor.
// Um valor de propriedade pode ser uma função,
// que é então considerada um método do objeto.

let pessoa = {
    nome: "Calleb",
    idade: 35,
    feliz: true,
    pets: ["cachorro", "gato"],
    carros: {
        camaro: {
            placa: "123456",
            cor: "preto"
        },
        uno: {
            placa: "654321",
            cor: "vermelho"
        }
    },
    andar: function(km) {
        alert(pessoa.nome + " andou " + km + "km") 
    }

}

// // Reescrevendo atributos
// pessoa.nome = "Skywalker"
// pessoa.pets[1] = "furret"

// console.log(pessoa.nome)
// console.log(pessoa.idade)
// console.log(pessoa.feliz)
// console.log(pessoa.pets[0])
// console.log(pessoa.pets[1])

// Acessando um objeto dentro de objeto
// console.log("Cor Camaro: "+ pessoa.carros.camaro.cor)
// console.log("Placa Uno: " + pessoa.carros.uno.placa)

// Chamando o método do objeto

console.log(pessoa.andar(20))


// Operadores Aritméticos

let x = 11
let y = 5
let resultado = x%y
console.log(resultado)

// + soma
// - subtração
// / divisão
// % resto da divisão
// ** exponenciação
// * multiplicação




let n1 = 8
let n2 = 7
let n3 = 6

let resultado = (n1 + n2 + n3) / 3

console.log(resultado)



// Atribuição

let x = 5
let y = 2

// x = x + y
// x += y
// x **= y

console.log(x)
x++

console.log(x)



// Operadores de Comparação

== comparação de valores
=== comparação de tipos

> maior que
>= maior igual

< menor que
<= menor igual

&& e (and) - tem que atender as duas condições

|| ou (or) - uma das condições tem que ser verdadeira

let x = 5

console.log(x == "5")

// Comparando tipos de dados

console.log(x === "5")

// Diferente
console.log(x != 4)



let media = 5
let frequencia = 80
let idade = 20
// let eleitor = (idade >= 16) ? "Pode votar" : "Não pode votar"

// console.log(media >= 7 && frequencia  >= 80)

// Condição NOT !

let eleitor = !(idade <= 15) ? "Pode votar" : "Não pode votar"

console.log(eleitor)

*/
