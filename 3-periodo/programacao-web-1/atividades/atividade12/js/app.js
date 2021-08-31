function cadastrar(nome, sobrenome) {
    let tabela = document.getElementById("tabelaNomes")
    let qtdLinhas = tabela.rows.length
    


    let linhas = tabela.insertRow(qtdLinhas)

    let cellCodigo = linhas.insertCell(0)
    let cellNome = linhas.insertCell(1)
    let cellSobrenome = linhas.insertCell(2)
    let cellDelete = linhas.insertCell(3)

    cellCodigo.innerHTML = qtdLinhas
    cellNome.innerHTML = nome
    cellSobrenome.innerHTML = sobrenome
    cellDelete.innerHTML = document.body.appendChild(del)
    
}


