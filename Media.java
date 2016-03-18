import java.util.Scanner;

class Media {

    public static void main(String[] args){

	Scanner stdin = new Scanner(System.in);
	System.out.println("Nota na P1");
	int p1 = stdin.nextInt();
	System.out.println("Nota na P2");
	int p2 = stdin.nextInt();
	// Vocês continuam daqui
	System.out.println("Nota do EP1");
	int ep1 = stdin.nextInt();
	System.out.println("Nota do EP2");
	int ep2 = stdin.nextInt();
	
	double media = (((double)ep1+(double)ep2)/2)*0.3 + (((double)p1+(double)p2)/2)*0.7;

	if(media>=0.0 && media<3.0){
	    System.out.println("Média: "+ media);
	    System.out.println("Reprovado");
	} else if(media>=3.0 && media<5.0){
	    System.out.println("Média: "+ media);
	    System.out.println("Em recuperação");
	}
	else if(media>=5.0 && media<=10.0){
	    System.out.println("Média: "+ media);
	    System.out.println("Aprovado");
	} else {
	    System.out.println("Valores informados inválidos");	
	}
	
    }
}
