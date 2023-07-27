    function formatarMoeda(valor) {
        var formatter = new Intl.NumberFormat('pt-BR', {
            style: 'currency',
            currency: 'BRL'
        });

        return formatter.format(valor);
    }

    function removerFormatacaoMoeda(valor) {
        return parseFloat(valor.replace(',', '.'));
    }
    
    function atualizarCampoMoeda(input) {
        var valor = input.value.replace(/\D/g, '');
        input.value = formatarMoeda(valor / 100);
        input.setAttribute('data-valor', removerFormatacaoMoeda(input.value));
    }

