public class Vector3 {
    public double x, y, z;

    // Constructor
    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Add two vectors
    public Vector3 add(Vector3 v) {
        return new Vector3(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    // Subtract two vectors
    public Vector3 subtract(Vector3 v) {
        return new Vector3(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    // Multiply vector by a scalar
    public Vector3 multiply(double scalar) {
        return new Vector3(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    // Dot product (Skalarprodukt)
    public double dot(Vector3 v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    // Cross product (Kreuzprodukt) — only needed for Camera setup
    public Vector3 cross(Vector3 v) {
        return new Vector3(
                this.y * v.z - this.z * v.y,
                this.z * v.x - this.x * v.z,
                this.x * v.y - this.y * v.x
        );
    }

    // Normalize vector (length = 1)
    public Vector3 normalize() {
        double length = Math.sqrt(this.dot(this));
        if (length == 0) return new Vector3(0, 0, 0);  // Avoid division by zero
        return this.multiply(1.0 / length);
    }

    // Optional: Get length
    public double length() {
        return Math.sqrt(this.dot(this));
    }

    // For debugging: Print vector
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
