package tp3exosYaip5;

public class Circle {
	private double radius;
	private String color;

	// Constructeur par défaut
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}

	// Constructeur avec paramètres
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// Getters
	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	// Aire
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle[radius=" + radius + ", color=" + color + "]";
	}
}



