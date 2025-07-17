document.getElementById('formulario').addEventListener('submit', function (e) {
    e.preventDefault();

    const id = parseInt(document.getElementById('id').value);
    // Faz uma requisição DELETE
    fetch(`http://localhost:8080/produtos/${id}`, {
        method: 'DELETE'
    })
    // Limpa o formulário após o envio
    document.getElementById('formulario').reset();
});