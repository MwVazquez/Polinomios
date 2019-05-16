package poli;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;


public class BinomioTest {

	
	final String PathBinomioIn = "LoteDePrueba/Entrada/Binomio/";
		
		@Test
		public void pruebaObtencionDeCoeficiente(){
			BinomioDeNewton b1 = new BinomioDeNewton(2,3,5);
			b1.calcularTriangulo();
			Assert.assertEquals(10, b1.devolverCoeficiente(3),0);
		}
		
		@Test
		public void pruebaEvaluarBinomio(){
			BinomioDeNewton b1 = new BinomioDeNewton(2,3,6);
			b1.calcularTriangulo();
			Assert.assertEquals(117649, b1.evaluarBinomio(2),0);
		}
		
		@Test
		public void pruebaEvaluarBinomioGradoCero(){
			BinomioDeNewton b1 = new BinomioDeNewton(2,3,0);
			b1.calcularTriangulo();	
			Assert.assertEquals(1, b1.evaluarBinomio(2),0);
		}
		
		
		@Test
		public void pruebaRendimiento() throws FileNotFoundException{
			
			BinomioDeNewton b1= new BinomioDeNewton (PathBinomioIn + "01_BinomioSimpleGrado5");
			BinomioDeNewton b2= new BinomioDeNewton (PathBinomioIn + "02_BinomioSimpleGrado1000");
			BinomioDeNewton b3= new BinomioDeNewton (PathBinomioIn + "03_BinomioSimpleGradoCero");
			BinomioDeNewton b4= new BinomioDeNewton (PathBinomioIn + "04_BinomioNegativoGrado50");
			
			
		
			System.out.println("Evaluacion de tiempo de ejecucion del Binomio 1");
			
			long comienzo,fin;
			comienzo=System.nanoTime();
			b1.calcularTriangulo();
			b1.evaluarBinomio(2136);
			fin=System.nanoTime();
			long diff = fin-comienzo;
			System.out.println("Tiempo de resolucion de evaluar Prog Dianmica: " + diff + " Nanosegundos");
			
			System.out.println("Evaluacion de tiempo de ejecucion del Binomio 2");
			
			comienzo=System.nanoTime();
			b2.calcularTriangulo();
			b2.evaluarBinomio(2136);
			fin=System.nanoTime();
			diff = fin-comienzo;
			System.out.println("Tiempo de resolucion de evaluar Prog Dianmica: " + diff + " Nanosegundos");
			
			comienzo=System.nanoTime();
			b3.calcularTriangulo();
			b3.evaluarBinomio(2136);
			fin=System.nanoTime();
			diff = fin-comienzo;
			System.out.println("Tiempo de resolucion de evaluar Prog Dianmica: " + diff + " Nanosegundos");
			
			comienzo=System.nanoTime();
			b4.calcularTriangulo();
			b4.evaluarBinomio(2136);
			fin=System.nanoTime();
			diff = fin-comienzo;
			System.out.println("Tiempo de resolucion de evaluar Prog Dianmica: " + diff + " Nanosegundos");
		}
		
		@Test
		public void test() {
			BinomioDeNewton b1 = new BinomioDeNewton(2,3,5);
			Assert.assertEquals(120, b1.factorialRecursivo(5),0);
		}
		
		@Test
		public void terminoK() {
			BinomioDeNewton b1 = new BinomioDeNewton(1,2,5);
			Assert.assertEquals(80, b1.devolverTerminoK(1, 2, 5, 5),0);
		}
		
		

}

