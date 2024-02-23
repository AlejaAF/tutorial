import java.util.Scanner;

public class Ejercicio1 {
	
	public static int potencia(int p_base,int p_exponente){
		//Variable que calcula la potencia
		int poten; 
		
		if(p_exponente==0){
			poten=1;
        }else {
        	poten=p_base * potencia(p_base, p_exponente-1);
        }
		return poten;
	}

	public static void main(String[] args) {
		//Creamos las variables
		int base;
		int exponente;
		
		//Lamamos a la funcion Scanner para poder tener entrada por teclado
		Scanner reader=new Scanner(System.in);
		
		
		//Hacemos el bucle para  tener enteros positivos.
		
		do {
			//Damos valor a las variables
			System.out.println("Introduce la base de la potencia ");
			base=reader.nextInt();
			System.out.println("Introduce el exponente de la potencia ");
			exponente=reader.nextInt();
			if (base<0 || exponente<0) {
				System.out.println("Los datos no son válidos.");
			}
		}while (base<0 || exponente<0);
		
		reader.close();
		//Sacamos por pantalla el resultado. LLamando a la  funcion.
		System.out.println("La potencia de "+base+" elevado al "+exponente+" es "+potencia(base,exponente));

	}

}
