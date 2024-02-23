import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos las variables.
		int num1;
		int num2;
		int mover=0;
		//Lamamos a Scanner
		Scanner reader=new Scanner(System.in);
		
		//Pedimos que nos introduzca los años.
		System.out.println("Introduce el año inicial ");
		num1=reader.nextInt();
		System.out.println("Introduce el año final ");
		num2=reader.nextInt();
		reader.close();
		
		//Hacemos que el primer año sea el menor y el segundo el mayor.
		if (num1>num2) {
			mover=num2;
			num2=num1;
			num1=mover;
		}
		
		
		//Creamos el bucle para conseguir las fechas entre una y otra
		for (int i=num1; i<=num2;i++) {
			//comprobamos que sea múltiplo de 10
			if(i%10!=0) {
				continue;
			}
			
			//Comprobamos que sea bisiesto
			if(i%4==0 && i%100!=0 || i%400==0) {
				System.out.println(i);
			}
			
		}
	}

}
