package OO.Lambdas;

public class testeLambda {
	public static void main(String[] args) {
		Calculo calculo = (x,y) -> {return x + y;};
		System.out.println(calculo.executar(2, 3));
		
		
		//A interface so podera fazer uma instaciação lambda se a
		//inteface tive apenas um metodo
		
		calculo = (x,y) -> x*y;
		System.out.println(calculo.executar(2,3));
	}

}
