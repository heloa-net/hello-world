import java.util.Scanner;

class Instancia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Funcionario numeroUm = new Funcionario();
		Data admissaoUm;

		System.out.println("Digite o nome do funcionário: ");
		numeroUm.nome = entrada.nextLine();

		System.out.println("Digite o RG do funcionário: ");
		numeroUm.RG = entrada.nextLine();

		System.out.println("Digite o dia da admissão do funcionário: ");
		int dia = entrada.nextInt();

		System.out.println("Digite o mês da admissão do funcionário: ");
		int mes = entrada.nextInt();

		System.out.println("Digite o ano da admissão do funcionário: ");
		int ano = entrada.nextInt();

		admissaoUm = new Data(dia, mes, ano);
		numeroUm.dataDeAdmissao = admissaoUm;

		System.out.println("Digite o salário do funcionário: ");
		numeroUm.salario = entrada.nextDouble();

		numeroUm.imprime(); // Imprime os dados do funcionário
		
	}
}
