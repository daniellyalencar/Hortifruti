function formatarTelefone(input) {
	let value = input.value.replace(/\D/g, ''); // Remove todos os caracteres não numéricos
	let formattedValue;

	if (value.length === 11) {
		formattedValue = value.replace(/^(\d{2})(\d{1})(\d{4})(\d{4})$/, '($1) $2 $3-$4');
	} else if (value.length === 10) {
		formattedValue = value.replace(/^(\d{2})(\d{4})(\d{4})$/, '($1) $2-$3');
	} else {
		formattedValue = value;
	}

	input.value = formattedValue;
}