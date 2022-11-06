/* Aula sobre JavaScript

//Alerta na página
alert("Olá mundo!")

//Enviar mensagem através do console
window.console.log("Eu sou o console.")

console.log(
    document.getElementById("titulo").innerHTML
)

//Pegar elementos por id
document.getElementById("titulo") 

*/

/* Browser Object Model

Utilizando o BOM e seus métodos: 
Neste caso o screen, que tem métodos diversos. 
Abaixo informações sobre largura e altura da tela.

console.log(
    "Largura: " + screen.width
)

console.log(
    "Altura: " + screen.height
)



console.log(
    Largura - screen.width
    > Altura - screen.height
    > Tipo screen.orientation.type
    > Informações do navegador - navigator
    > Inforamções internas do método navigator - navigator.appVersion
    > Informações sobre localizações, seja IP ou dentro das páginas - location.href
    > Pode redirecionar para outras páginas - location.href = "http://www.google.com"
    > Informações sobre histórico de navegação - history

/* Funções
function voltar() {
    history.back()
}

function adiantar() {
    history.forward()
}

alert("Tamanho da tela: " + screen.width)

Pegando elementos DOM pelo id e classe

innerHTML = pega o conteúdo

document.getElementById("largura").innerHTML = screen.width


Pegando elementos por ID
console.log(
    document.getElementById("fruta").innerHTML
)


//Pegando elementos por classe
console.log(
    document.getElementsByClassName("carro")[0].innerHTML,
    document.getElementsByClassName("carro")[1].innerHTML
)


//Pegando elementos pelo nome da tag
console.log(
    document.getElementsByTagName("p")
)


//Query Selector
//Retorna sempre o primeiro elemento que ele encontrar: 
//Pode ser pela tag, id, class

console.log(
    //pelo tag "div"
    //pela classe ".div2"
    //pelo ud "#p2"
    document.querySelector("#p2")
)



//Retorna todas as divs com a mesma classe
console.log(
    document.querySelectorAll(".times")
)


//Pegar as classes de um pai apenas
console.log(
    document.getElementById("futebol-europeu").querySelectorAll(".times")[0].innerHTML,
    document.getElementById("futebol-europeu").querySelectorAll(".times")[1].innerHTML, 
    document.getElementById("futebol-europeu").querySelectorAll(".times")[2].innerHTML
)


// Recebendo novo conteúdo

document.getElementById("p1").innerHTML = "Novo conteúdo"


//Utilizando variáveis

var paragrafo = document.getElementById("p1");
paragrafo.innerHTML = "Novo conteúdo"

// paragrafo.style
//Utuilizando a variável com .style 
//Temos a mesma reprodução que:
//document.getElementById("p1").style

paragrafo.style.color = "red"
paragrafo.style.backgroundColor = "#333"
paragrafo.style.height = "400px"
paragrafo.style.fontSize = "50px"



// Setando atributos e valores aos elementos

var imagem = document.getElementById("imagem")

imagem.src = "html.png"
imagem.alt = "teste de imagem"
imagem.width = "50"



//Inserindo tags e arquivos dentro da tag img
var imagem = document.createElement("img")
imagem.src = "js.png"

var paragrafo = document.createElement("p")
paragrafo.innerHTML = "Olá pessoal!"

console.log(
    imagem, paragrafo
)



//Inserindo e removendo elementos filhos em tags pai
//

var p = document.createElement("p")
p.innerHTML = "Olá pessoal!"

var img = document.createElement("img")
img.src = "html.png"

document.getElementById("conteudo").appendChild(p)
document.getElementById("conteudo").appendChild(img)

document.getElementById("conteudo").removeChild(img)

*/