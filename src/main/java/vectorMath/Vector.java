package vectorMath;

public class Vector {
	private double x,y,z;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
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
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
	}
	
}
