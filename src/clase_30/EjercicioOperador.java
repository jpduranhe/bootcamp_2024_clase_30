package clase_30;

import java.util.Scanner;

public class EjercicioOperador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  + 
		 *  -
		 *  *
		 *  /
		 *  %
		 * 
		 * 
		 */
		System.out.println("*****OPERADORES aritméticos****");
		
		int num1=10, num2=5, num3=20, num4=11;
		
		int resultadoSuma = num1+num2;
		
		System.out.println("resultado num1+num2= "+resultadoSuma);
		
		int resultadoResta = num1-num2;
		
		System.out.println("resultado num1-num2= "+resultadoResta);
		
		int resultadoMult = num1*num2;
		
		System.out.println("resultado num1*num2= "+resultadoMult);
		
		int resultadoDiv = num1/num2;
		
		System.out.println("resultado num1/num2= "+resultadoDiv);
		
		int resultadoMod = num1%num2;
		
		System.out.println("resultado num1%num2= "+resultadoMod);
		
		System.out.println();
		System.out.println();
		System.out.println("*****OPERADORES UNARIOS****");
		/*
		 * ++
		 * --
		 * 
		 */
		int resultadoPlusPlus = num1++;
		System.out.println("resultado num1++= "+resultadoPlusPlus );
		System.out.println("valor num1= "+num1 );
		
		int plusPlusresultado = ++num2;
		System.out.println("resultado num1++= "+plusPlusresultado );
		System.out.println("valor num1= "+num2 );
		
		
		System.out.println("valor Original de num3= "+num3 );
		System.out.println("resultado 10  + num3--  = "+(   10  + (num3-- ) ));
		System.out.println("valor 10 + num3= "+  (10 + num3) );
		
		int resultadoMinusMinus = num3--;
		System.out.println("resultado num3--= "+resultadoMinusMinus );
		System.out.println("valor num3= "+num3 );
		
		
		System.out.println();
		System.out.println();
		System.out.println("*****OPERADORES DE RELACIÓN****");
		
		/*
		 *  ==
		 *  !=
		 *  
		 *  <
		 *  >
		 * 	<=
		 *  >=
		 * 
		 * 
		 * */
	
		System.out.println("valores de num1  y de  num4 "+num1+" ==  "+num4 );
		System.out.println("resultado num1 == num4 "+(  num1 == num4 ) );
		
		
		System.out.println("valores de num1  y de  num2 "+num1+" == "+num2 );
		System.out.println("resultado num1 == num2 "+(  num1 == num2 ) );
		
		
		System.out.println("valores de num1  y de  num2 "+num1+" != "+num2 );
		System.out.println("resultado num1 != num2 "+(  num1 != num2 ) );
		
		System.out.println("valores de num1  y de  num2 "+num1+" > "+num2 );
		System.out.println("resultado num1 > num2 "+(  num1 > num2 ) );
		
		System.out.println("valores de num1  y de  num2 "+num1+" > "+num2 );
		System.out.println("resultado num1 > num2 "+(  num1 > num2 ) );

		System.out.println("valores de num1  y de  num2 "+num1+" < "+num2 );
		System.out.println("resultado num1 < num2 "+(  num1 < num2 ) );
		
		System.out.println();
		System.out.println();
		System.out.println();
		Scanner leer=new Scanner(System.in); 
		System.out.println("Ingrese un Numero");
		int num=leer.nextInt();
		System.out.println("Tu Numero Ingresado es ----->"+num);
	}

}
