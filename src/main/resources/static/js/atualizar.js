document.getElementById('formulario').addEventListener('submit', function (e) {
    e.preventDefault();

    const produto = {
        id: parseInt(document.getElementById('id').value),
        nomeProduto: document.getElementById('nome').value,
        preco: parseFloat(document.getElementById('preco').value)
    };
    // Envia o objeto 'produto' para o backend usando o método PUT
    fetch('http://localhost:8080/produtos', {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(produto)
    })
    // Limpa o formulário após o envio
    document.getElementById('formulario').reset();
});