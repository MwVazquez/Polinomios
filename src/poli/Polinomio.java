package poli;

import java.util.Random;

//0,95
//1,009
public class Polinomio {
	/// horner
	private int grado ; 
	private double [ ] coeficientes ; 
	//La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n
	// la posicion n contiene al termino independiente .
	
	public Polinomio(int grado, double[] coe) {
		this.grado=grado;
		this.coeficientes=coe;
	} 
	public double evaluarMSucesivas (double x)
	{
		double res=0;
		double especificado=x;
		for (int i = 1; i < grado +1; i++) {
			res=res+especificado*coeficientes[grado-i];
			especificado*=x;
		}
		res+=coeficientes[grado];
		return res;
	} 
	
	public double evaluarRecursiva(double x){
		double resultado = 0;
		for (int i = 0; i < (grado+1); i++) {
			if(this.coeficientes[i] != 0)
				resultado+= this.coeficientes[i] * potencia(x,(grado-i));
		}
		return resultado;
	}
	
	private double potencia(double x, int n){
		if(n==0) return 1;
		return x*potencia(x,n-1);
	}
	
	public double evaluarRecursivaPar(double x){
		double resultado = 0;
		for (int i = 0; i < (grado+1); i++) {
			if(this.coeficientes[i] != 0)
				resultado+= this.coeficientes[i] * potenciaPar(x,(grado-i));
		}
		return resultado;
	}
	
	private double potenciaPar(double x, int n){
		if(n == 0) return 1;
		if(n%2 != 0)
			return x*potenciaPar(x,n-1);
		return potenciaPar(x*x, n/2);
	}
	
	public double evaluarProgDinamica(double x){
		double res[]=new double[grado+1],res1=0;
		res[0]=1;
		/*completo con el anterior, luego mutiplico
		 * x=4
		 * res[0]=1
		 * res[1]=1		1*4
		 * res[2]=4 	4*4
		 * res[3]=16 	16*4
		 */
		for (int i = 1; i <= grado ; i++) {
			res[i]=res[i-1];
			res[i]=res[i]*x;
		}
		for (int i = 0; i <=grado; i++) {
			res1+=res[grado-i]*coeficientes[i];
		}
		return res1;
	}
	
	
	//similar a sucesivas
	public double evaluarMejorada(double x){
		double resultado = this.coeficientes[grado];
		double potencia=x;
		for(int i=1 ; i<= grado ; i++) {
			resultado=resultado+potencia*coeficientes[grado-i];
			potencia*=x;
		}	
		return resultado;
	}
	
	public double evaluarPow(double x){
		double resultado = 0;
		for (int i = 0; i < (grado+1); i++) {
			if(this.coeficientes[i] != 0)
				resultado+= this.coeficientes[i] * Math.pow(x,(grado-i));
		}
		return resultado;
	}
	
	//Saco factor comun x(muchas veces)
	public double evaluarHorner(double x){     
        double resultado = coeficientes[0];		/// COEFICIENTE MAS ALTO
        for (int i = 1; i < this.coeficientes.length ; i++)
            resultado = this.coeficientes[i] + (x * resultado);       ///a0*x+a1
        return resultado;
    }
	
	public double valorMedio(double neg, double pos) {
		
		double c=(neg+pos)/2;
		double res=evaluarHorner(c);

		while(Math.abs(res)>0.01) {
			if(res>0)
				pos=c;
			if(res<0)
				neg=c;
			if(res==0)
				return c;
			c=(neg+pos)/2;
			res=evaluarHorner(c);
			
		}
		return c;
	}
}
