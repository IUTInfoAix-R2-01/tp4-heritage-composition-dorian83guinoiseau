package tp3exosYaip5;

public class Cylinder {
	private Circle base;   // composition
	private double height;

	// Constructeur par défaut
	public Cylinder() {
		this.base = new Circle();
		this.height = 1.0;
	}

	// Constructeur avec paramètres
	public Cylinder(double radius, String color, double height) {
		this.base = new Circle(radius, color);
		this.height = height;
	}

	// Getters
	public double getHeight() {
		return height;
	}

	public Circle getBase() {
		return base;
	}

	// Volume
	public double getVolume() {
		return base.getArea() * height;
	}

	@Override
	public String toString() {
		return "Cylinder[base=" + base + ", height=" + height + "]";
	}
}


