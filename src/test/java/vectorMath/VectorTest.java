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
	
	@Test
	public void shouldObtainTheCorrectLengthOfATwoDimensionalVector() {
		Vector twoDimensionalVector = new Vector(3, 4);
		assertEquals(5, twoDimensionalVector.getLength(), 0.000001);
	}
	@Test
	public void shouldObtainTheCorrectLengthOfAThreeDimensionalVector() {
		Vector threeDimensionalVector = new Vector(1, 1, 1);
		assertEquals(Math.sqrt(3), threeDimensionalVector.getLength(), 0.000001);
	}
	@Test
	public void shouldAddTwoVectorsCorrectly() {
		Vector twoDimensionalVector = new Vector(3, 4);
		Vector threeDimensionalVector = new Vector(1, 1, 1);
		threeDimensionalVector.addExact(twoDimensionalVector);
		assertEquals(4, threeDimensionalVector.getX(), 0.000001);
		assertEquals(5, threeDimensionalVector.getY(), 0.000001);
		assertEquals(1, threeDimensionalVector.getZ(), 0.000001);
	}
	@Test
	public void shouldSubtractTwoVectorsCorrectly() {
		Vector twoDimensionalVector = new Vector(3, 4);
		Vector threeDimensionalVector = new Vector(1, 1, 1);
		threeDimensionalVector.subtractExact(twoDimensionalVector);
		assertEquals(-2, threeDimensionalVector.getX(), 0.000001);
		assertEquals(-3, threeDimensionalVector.getY(), 0.000001);
		assertEquals(1, threeDimensionalVector.getZ(), 0.000001);
	}
}
