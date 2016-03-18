import java.util.Scanner;

class MDC {

    public static void main(String[] args){

	Scanner entrada = new Scanner(System.in);

	int MDC = 0;
	int aux = 0;
	int maior = 0;
	int menor = 0;

	System.out.println("\nEntre dois números para calcular seu MDC (Máximo Múltiplo Comum)");
	System.out.println("Digite o primeiro número:");
	int primeiro = entrada.nextInt();
	System.out.println("Digite o segundo número:");
	int segundo = entrada.nextInt();
	
	if(primeiro > segundo){
	   maior = primeiro;
	   menor = segundo;
	}  else if(segundo > primeiro){
	   maior = segundo;
	   menor = primeiro;
	}

	do{
	  aux = maior%menor;

	    if (aux==0){
	        MDC = menor;
	    } else {
	        maior = menor;
		menor = aux; 
	    }
	  } while(aux != 0);

	System.out.println("O MDC é: " + MDC);

    }
}
