package ponyExpress;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PonyExpressTests {
	
	@Test
	public void estaciones() {
		Assert.assertEquals(1, PonyExpress.caballos(new int[] { 18, 15 }));
		Assert.assertEquals(2, PonyExpress.caballos(new int[] { 43, 23, 40, 13 }));
		Assert.assertEquals(3, PonyExpress.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		Assert.assertEquals(3, PonyExpress.caballos(new int[] { 51, 51, 51 }));
		Assert.assertEquals(4, PonyExpress.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));

	}
	
	@Test(expected = Error.class)
	public void distanciasNegativasDaError() {
		Assert.assertEquals(1, PonyExpress.caballos(new int[] { -17, 11 }));
		
	}
	
	@Test(expected = Error.class)
	public void distanciasMayoresA100DaError() {
		Assert.assertEquals(2, PonyExpress.caballos(new int[] { 180, 10 }));
	}

	

	
	

}