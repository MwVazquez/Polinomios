package poli;


import org.junit.Assert;
import org.junit.Test;


public class PoliTest {
//	
//	@Test
//	public void prueba() {
//		Polinomio p1= new Polinomio(3,new double[] {3,4,2,2});
//		Assert.assertEquals(46, p1.evaluarMSucesivas(2),0);
//	}
//	@Test
//	public void prueba2(){
//		Polinomio p1= new Polinomio(4,new double[] {3,4,2,2,5});
//		Assert.assertEquals(97, p1.evaluarMSucesivas(2),0);
//	}
//	
//	@Test
//	public void prueba3(){
//		Polinomio p1= new Polinomio(4,new double[] {3,4,2,2,5});
//		Assert.assertEquals(97, p1.evaluarHorner(2),0);
//	}
//	@Test
//	public void prueba4(){
//		Polinomio p1= new Polinomio(4,new double[] {3,4,2,2,5});
//		Assert.assertEquals(97, p1.evaluarRecursiva(2),0);
//	}
//	@Test
//	public void prueba5(){
//		Polinomio p1= new Polinomio(4,new double[] {3,4,2,2,5});
//		Assert.assertEquals(97, p1.evaluarRecursivaPar(2),0);
//	}
//	@Test
//	public void pruebaPolinomioPrograDinamica(){ 
//		double[] coeficientes= {6,5,3,4,2,2,5};
//		Polinomio p7=new Polinomio(6,coeficientes);
//		Assert.assertEquals(641, p7.evaluarProgDinamica(2), 0);
//	}
//	
//	//Retestear
//	@Test
//	public void pruebaPolinomioPrograDinamicaMejora(){ 
//		double[] coeficientes= {6,5,3,4,2,2,5};
//		Polinomio p7=new Polinomio(6,coeficientes);
//		Assert.assertEquals(641, p7.evaluarMejorada(2), 0);
//	}
//	@Test
//	public void pruebaPow(){ 
//		double[] coeficientes= {6,5,3,4,2,2,5};
//		Polinomio p7=new Polinomio(6,coeficientes);
//		Assert.assertEquals(641, p7.evaluarPow(2), 0);
//	}
	@Test
	public void comple() {
		
	long comienzo,fin,diff;
		Polinomio b1= new Polinomio(1000,new double[] {3,4,2,5,6});
		comienzo=System.nanoTime();
		b1.evaluarMSucesivas(1,02);
		
		fin=System.nanoTime();
		 diff = fin-comienzo;
		System.out.println("Tiempo de resolucion de sumas sucecivas: " + diff + " Nanosegundos");
		
		
		Polinomio p1= new Polinomio(3,new double[] {3,4,2,2});
		comienzo=System.nanoTime();
		p1.evaluarMSucesivas(2);
		fin=System.nanoTime();
		diff = fin-comienzo;
		System.out.println("Tiempo de resolucion de sumas sucecivas: " + diff + " Nanosegundos");
		
		Polinomio p2= new Polinomio(2,new double[] {3,4,2});
		comienzo=System.nanoTime();
		p2.evaluarMSucesivas(2);
		fin=System.nanoTime();
		diff = fin-comienzo;
		System.out.println("Tiempo de resolucion de sumas sucecivas: " + diff + " Nanosegundos");

		Polinomio p3= new Polinomio(1,new double[] {3,4});
		comienzo=System.nanoTime();
		p3.evaluarMSucesivas(2);
		fin=System.nanoTime();
		diff = fin-comienzo;
		System.out.println("Tiempo de resolucion de sumas sucecivas: " + diff + " Nanosegundos");
		
//		
	
	
	
	
	
		comienzo=System.nanoTime();
		Polinomio b2= new Polinomio(4,new double[] {3,4,2,2,5});
		b2.evaluarProgDinamica(2);
		fin=System.nanoTime();
		diff = fin-comienzo;
		System.out.println("Tiempo de resolucion de evaluar Prog Dianmica: " + diff + " Nanosegundos");
		
		comienzo=System.nanoTime();
		Polinomio b3= new Polinomio(3,new double[] {3,4,2,2});
		b3.evaluarProgDinamica(2);
		fin=System.nanoTime();
		diff = fin-comienzo;
		System.out.println("Tiempo de resolucion de evaluar Prog Dianmica: " + diff + " Nanosegundos");
		
		comienzo=System.nanoTime();
		Polinomio b4= new Polinomio(2,new double[] {3,4,2});
		b4.evaluarProgDinamica(2);
		fin=System.nanoTime();
		diff = fin-comienzo;
		System.out.println("Tiempo de resolucion de evaluar Prog Dianmica: " + diff + " Nanosegundos");
		
		comienzo=System.nanoTime();
		Polinomio b5= new Polinomio(1,new double[] {3,4});
		b5.evaluarProgDinamica(2);
		fin=System.nanoTime();
		diff = fin-comienzo;
		System.out.println("Tiempo de resolucion de evaluar Prog Dianmica: " + diff + " Nanosegundos");
//		
//		comienzo=System.nanoTime();
//		double[] coeficientes= {6,5,3,4,2,2,5};
//		Polinomio p7=new Polinomio(6,coeficientes);
//		p7.evaluarPow(2);
//		fin=System.nanoTime();
//		diff = fin-comienzo;
//		
//		System.out.println("Tiempo de resolucion de evaluar Pow: " + diff + " Nanosegundos");
//	
//		comienzo=System.nanoTime();
//		p7.evaluarHorner(2);
//		fin=System.nanoTime();
//		diff = fin-comienzo;
//		
//		System.out.println("Tiempo de resolucion de evaluar Horner: " + diff + " Nanosegundos");
//		comienzo=System.nanoTime();
//		
//		p7.evaluarRecursiva(2);
//		fin=System.nanoTime();
//		diff = fin-comienzo;
//		System.out.println("Tiempo de resolucion de evaluar Recursiva: " + diff + " Nanosegundos");
//		
//		comienzo=System.nanoTime();
//		p7.evaluarRecursivaPar(2);
//		fin=System.nanoTime();
//		diff = fin-comienzo;
//		System.out.println("Tiempo de resolucion de evaluar Recursiva Par: " + diff + " Nanosegundos");
	}
}
