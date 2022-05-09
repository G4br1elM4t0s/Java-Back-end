package OO.Lambdas;
@FunctionalInterface
public interface Calculo {
	
	// por padrão o metodo é publico e abstrato
	double executar(double x, double y);
	
	
	
	//implementacao padrão
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muitoLegal";
	}
	
}
