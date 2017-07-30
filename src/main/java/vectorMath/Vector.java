package vectorMath;

public class Vector {
	private double x, y, z;

	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector(double x, double y) {
		this(x, y, 0);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public double getLength() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}

	public void addExact(Vector vector) {
		x += vector.x;
		y += vector.y;
		z += vector.z;
	}

	public void subtractExact(Vector vector) {
		x -= vector.x;
		y -= vector.y;
		z -= vector.z;
		
	}

}
