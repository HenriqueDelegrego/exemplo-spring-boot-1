const formulario = document.getElementById('formulario');

formulario.addEventListener('submit', function (e) {
    e.preventDefault();

    // Recebe o único valor do formulário
    // Sem necessidade de montar um objeto
    const id = parseInt(document.getElementById('id').value);

    // Faz uma requisição DELETE
    fetch(`http://localhost:8080/produtos/${id}`, {
        method: 'DELETE'
    })
    // Limpa o formulário após o envio
    document.getElementById('formulario').reset();
});