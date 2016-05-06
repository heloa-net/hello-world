import java.util.Scanner; 

public class Alliteration {
	
	public static void main(String[] args){
		
		System.out.println("Digite uma frase");
		
		Scanner entrada = new Scanner(System.in);
		
		while (entrada.hasNextLine()) { // Scanner de todo o texto
			Scanner entrada2 = new Scanner(entrada.nextLine().toLowerCase()); // Scanner de cada linha

			while (entrada2.hasNext()) {
				System.out.println(entrada2.nextLine());
				String[] palavras;
				palavras = entrada2.nextLine().split(" ");
				int contador = 0;
				
				for (int i = 0; i < palavras.length; i++) {

					char anterior = palavras[i].charAt(0);
					char atual = palavras[i+1].charAt(0);
					char proximo;

					if (anterior == atual) {
						contador++;
						for (int k = i+2; k < palavras.length-1; k++) {
							proximo = palavras[k].charAt(0);
							if (anterior != proximo) {
								i = k;
								break;								
							}
						}		
					}				
				}
			System.out.println(contador);
			}
		}
	}
} 


