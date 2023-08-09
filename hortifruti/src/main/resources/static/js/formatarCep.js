function formatarCep(input) {
            let value = input.value.replace(/\D/g, ''); // Remove todos os caracteres não numéricos
            let formattedValue = value.replace(/^(\d{5})(\d{3})$/, '$1-$2');

            input.value = formattedValue;
        }