package logica;

public class Parcial {
	
	public String  calcularFormulaCuadratica(double a, double b, double c) throws IllegalArgumentException {
	
		if (a == 0) {throw new IllegalArgumentException("el valor de a no puede ser 0 ya q no constituye una ecuacion de segundo grado");
			
	}
	
		double discriminante = (b * b) - (4 * a * c);
		
		if (discriminante < 0) { throw new IllegalArgumentException( " el discriminante es negativo, lasa raices son complejas (imaginarias)" );
		}
		
		double raiz1 = ( -b + Math.sqrt(discriminante))/(2 * a) ;
		
        double raiz2 = ( -b -Math.sqrt( discriminante)) / ( 2 *a);
        
        return raiz1 + "," +raiz2 ; 
        
        
    }
}
