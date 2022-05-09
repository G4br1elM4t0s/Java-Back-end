package OO.Lambdas;

import java.util.function.BinaryOperator;

public class testeLambda2 {
	public static void main(String[] args) {
		
		
		//Não permite int-> Double do tipo classe
		//double -> Double
		
		
		BinaryOperator<Double> calculo = (x,y) -> {return x + y;};
		System.out.println(calculo.apply(2.0, 3.0));
		
		
		//A interface so podera fazer uma instaciação lambda se a
		//inteface tive apenas um metodo
		
		calculo = (x,y) -> x*y;
		System.out.println(calculo.apply(2.0,3.0));
		
		BinaryOperator<Integer> calculo2 = (x,y) -> {return x + y;};
		System.out.println(calculo2.apply(2, 3));
		
		
	}

}
