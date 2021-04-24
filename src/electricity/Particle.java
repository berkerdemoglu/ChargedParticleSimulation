package electricity;

public final class Particle {
	// Define physical constants.
	public static final double CONSTANT_K = 9 * Math.pow(10, 9);

	// Physical properties of the particle.
	private final double charge; // in coulombs

	// X and Y coordinates of the particle
	private final int x;
	private final int y;

	public Particle(final double charge, final int x, final int y) {
		this.charge = charge;
		this.x = x;
		this.y = y;
	}

	public Particle(final int x, final int y) {
		// +1C at (x,y)
		this(1.0, x, y);
	}

	public Particle() {
		// +1C at (0, 0)
		this(0 , 0);
	}

	@Override
	public String toString() {
		return "(charge:" + charge + ", x:" + x + ", y:" + y + ")";
	}

	public double getCharge() {
		return charge;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}