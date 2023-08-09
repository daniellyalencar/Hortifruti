function formatarMoeda(input) {
	var value = input.value.replace(/\D/g, ''); // Remove caracteres não numéricos
	value = (value / 100).toFixed(2) + '';
	value = value.replace(".", ",");
	value = value.replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1.');

	input.value = value;
}
