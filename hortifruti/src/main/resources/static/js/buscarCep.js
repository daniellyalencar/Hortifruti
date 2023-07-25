function buscarCEP() {
  var cep = document.getElementById('cep').value;

  // Remover caracteres não numéricos do CEP, se houver
  cep = cep.replace(/\D/g, '');

  if (cep.length === 8) {
    var url = 'https://viacep.com.br/ws/' + cep + '/json/';

    // Fazer a requisição para o serviço do ViaCEP
    fetch(url)
      .then(response => response.json())
      .then(data => preencherCampos(data))
      .catch(error => console.log('Erro ao buscar o CEP: ', error));
  }
}

// Função para preencher os campos do formulário com os dados do ViaCEP
function preencherCampos(data) {
  if (!data.erro) {
    document.getElementById('rua').value = data.logradouro;
    document.getElementById('bairro').value = data.bairro;
    document.getElementById('cidade').value = data.localidade;
    document.getElementById('estado').value = data.uf;
  }
}