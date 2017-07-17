package vectorMath;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

	
	@Test
	public void shouldConstructATwoDimensionalVectorCorrectly(){
		Vector twoDimensionalVector = new Vector(1,2);
		assertEquals(1, twoDimensionalVector.getX(), 0.000001);
		assertEquals(2, twoDimensionalVector.getY(), 0.000001);
	}
}
