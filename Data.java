class Data {

	int dia;
	int mes;
	int ano;

	public Data (int a, int b, int c) {

		this.dia = a;
		this.mes = b;
		this.ano = c;

	}

	static String formata(int dia, int mes, int ano) {

		String dataFormatada = dia + "/" + mes + "/" + ano;
		return dataFormatada;

	}
	
	void imprime() {
		System.out.println(formata(this.dia, this.mes, this.ano));
	}

}
