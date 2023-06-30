public class Circle {
    private final int id;
    private final float diameter;
    private final int height;
    private int speed;

    public Circle(int id, int height, int speed, float diameter) {
        this.id = id;
        this.diameter = diameter;
        this.height = id * height;
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }

    public int getSpeed() {
        return speed;
    }

    public void updateSpeed() {
        this.speed = getSpeed() + getId();
    }


    public float getDiameter() {
        return this.diameter;
    }
}

