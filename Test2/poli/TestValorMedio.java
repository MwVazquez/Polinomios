package poli;

import org.junit.Assert;
import org.junit.Test;

public class TestValorMedio {
	@Test
	public void prueba() {
		Polinomio p1= new Polinomio(2,new double[] {1,-1,-1});
		Assert.assertEquals(46, p1.valorMedio(1, 2),0.02);
	}
}
