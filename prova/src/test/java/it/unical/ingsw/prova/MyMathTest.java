package it.unical.ingsw.prova;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Unit test for simple App.
 */

@RunWith(Parameterized.class)
public class MyMathTest {
	
	int x, y;
	private MyMath m;
	
	public MyMathTest(int n1, int n2) {
		this.x = n1;
		this.y = n2;
		m = new MyMath();
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {{1, 2}, {2, 1}, {2, 1}});
	}
	
	@Test
    public void shouldAnswerWithTrue() {
		assertEquals(2, m.multiply(x, y));
    }
}
