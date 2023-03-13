package pacote;

import java.util.Scanner;

public class mediaBi {

	public static void main(String[] args) {
		Scanner bimestre = new Scanner(System.in);
		double b1;
		double b2;
		double b3;
		double b4;
		double media;
		
		System.out.print("Entre com o primeiro bi : ");
		b1 = bimestre.nextDouble();
		System.out.print("Entre com o segundo bi : ");
		b2 = bimestre.nextDouble();
		System.out.print("Entre com o terceiro bi : ");
		b3 = bimestre.nextDouble();
		System.out.print("Entre com o terceiro bi : ");
		b4 = bimestre.nextDouble();
		bimestre.close();
		
		media = (b1 + b2 + b3 +b4)/4;
		
		if (media >= 6) {
			System.out.println("Parabéns você passou de ano!!!!!" + "\nSua media é : " + media);
			
		
		}else {
			System.out.println("Infelizmente você terá que passar pela recuperção" +"\nSua media é : " + media);
		}
		
	}


	}

