package poli;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


	public class BinomioDeNewton {
		/// (X + Y ) a ala GRADO
		//si solo son X y Y ; X es uno y Y es 1
		// si es 5X es 5 y asi
		private double x;
		private double y;
		private int grado;
		private int [][] matrizTartagal;
		
		
		public BinomioDeNewton(int terminoLineal, int terminoIndependiente, int grado) {
			this.x = terminoLineal;
			this.y = terminoIndependiente;
			this.grado = grado;
		}
		
		public BinomioDeNewton(String path) throws FileNotFoundException{
			
			Scanner sc = new Scanner(new File(path+".in"));
			x = sc.nextDouble();
			y = sc.nextDouble();
			grado = sc.nextInt();
			
			sc.close();
		}
		
		public void calcularTriangulo(){
			
			this.matrizTartagal = new int[this.grado+1][];
			
			for (int i = 0; i < matrizTartagal.length; i++) {
				matrizTartagal[i]= new int [i+1];
			}
			
			
			for(int i = 0; i < this.grado+1; i++){
				matrizTartagal[i][i] = 1;
				matrizTartagal[i][0] = 1;
			}
			
			for(int i = 2; i < this.grado+1; i++){
				for(int j = 1; j < i; j++){
					matrizTartagal[i][j] = matrizTartagal[i-1][j-1] + matrizTartagal[i-1][j];
				}
			}
		}
		
		public double factorialRecursivo(double numero) {
			 
			if (numero == 0) 
				return 1; 
			else 
				return numero * factorialRecursivo(numero-1); 
		}
			
		public double calcularCombinatoria(int n, int k){
			if (n==1 && k==0) {
				return 1;
			}
			
			return factorialRecursivo(n)/(factorialRecursivo(k)*factorialRecursivo(n-k));
		}
		
		public double devolverTerminoK(int a, int b, int terminoK, int grado) {
			return calcularCombinatoria(grado, terminoK-1)*Math.pow(a, (grado-(terminoK-1)))*Math.pow(b, terminoK-1);
		}
		public int devolverCoeficiente(int n){
				
			return  matrizTartagal[grado][n-1];
		}
		
		
		
		public double evaluarBinomio (double x){
					
			double resultado = 0;
			
			for (int i = 0; i < grado + 1	; i++) {
				resultado += (matrizTartagal[grado][i] * (Math.pow(x * x, i) * Math.pow(y, grado-i)))	;
			}
				
			return resultado;
		}
		
	}


