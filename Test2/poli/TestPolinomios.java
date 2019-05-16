package poli;

import org.junit.Assert;
import org.junit.Test;



public class TestPolinomios {
	@Test
	public void pruebaSucecivas1() {
		Polinomio p1= new Polinomio(3,new double[] {3,4,2,2});
		Assert.assertEquals(46, p1.evaluarMSucesivas(2),0);
	}
	@Test
	public void pruebaSucecivas2(){
		Polinomio p1= new Polinomio(6,new double[] {1,1,-1,1,1,1,9});
		Assert.assertEquals(53403, p1.evaluarMSucesivas(6),0);
	}
	@Test
	public void pruebaProgDinamica1() {
		Polinomio p1= new Polinomio(3,new double[] {3,4,2,2});
		Assert.assertEquals(46, p1.evaluarProgDinamica(2),0);
	}
	@Test
	public void pruebaProgDinamica2(){
		Polinomio p1= new Polinomio(6,new double[] {1,1,-1,1,1,1,9});
		Assert.assertEquals(53403, p1.evaluarProgDinamica(6),0);
	}
	@Test
	public void pruebaMejorada1() {
		Polinomio p1= new Polinomio(3,new double[] {3,4,2,2});
		Assert.assertEquals(46, p1.evaluarMejorada(2),0);
	}
	@Test
	public void pruebaMejorada2(){
		Polinomio p1= new Polinomio(6,new double[] {1,1,-1,1,1,1,9});
		Assert.assertEquals(53403, p1.evaluarMejorada(6),0);
	}
	
}
