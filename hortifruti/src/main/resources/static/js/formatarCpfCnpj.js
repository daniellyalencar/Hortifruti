function formatarCpfCnpj(input) {
	let value = input.value.replace(/\D/g, ''); // Remove todos os caracteres não numéricos
	let formattedValue;

	if (value.length === 11) {
		formattedValue = value.replace(/^(\d{3})(\d{3})(\d{3})(\d{2})$/, '$1.$2.$3-$4');
	} else if (value.length === 14) {
		formattedValue = value.replace(/^(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})$/, '$1.$2.$3/$4-$5');
	} else {
		formattedValue = value;
	}

	input.value = formattedValue;
}