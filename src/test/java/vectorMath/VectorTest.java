package vectorMath;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

	@Test
	public void shouldConstructATwoDimensionalVectorCorrectly() {
		Vector twoDimensionalVector = new Vector(1, 2);
		assertEquals(1, twoDimensionalVector.getX(), 0.000001);
		assertEquals(2, twoDimensionalVector.getY(), 0.000001);
		assertEquals(0, twoDimensionalVector.getZ(), 0.000001);
	}

	@Test
	public void shouldConstructAThreeDimensionalVectorCorrectly() {
		Vector threeDimensionalVector = new Vector(1, 2, 3);
		assertEquals(1, threeDimensionalVector.getX(), 0.000001);
		assertEquals(2, threeDimensionalVector.getY(), 0.000001);
		assertEquals(3, threeDimensionalVector.getZ(), 0.000001);
	}
}
