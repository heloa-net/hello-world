class Funcionario {
	
	String nome;
	double salario;
	Data dataDeAdmissao;
	String RG;

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double ganhoAnual() {
		return this.salario * 12;
	}

	void imprime() {
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");
		System.out.println("Imprimindo informações do funcionário " + this.nome + "\n");
		System.out.println("Nome = " + this.nome);
		System.out.println("Salário = " + this.salario);
		System.out.println("RG = " + this.RG);
		System.out.println("Ganho anual = " + this.ganhoAnual());
		System.out.print("Data de admissão = ");
		this.dataDeAdmissao.imprime();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

}
