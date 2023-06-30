import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class BallChallenge extends PApplet {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final int DIAMETER = 15;
    List<Circle> balls;

    public static void main(String[] args) {
        PApplet.main("BallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Circle ball1 = new Circle(1, HEIGHT / 5, 0, DIAMETER);
        Circle ball2 = new Circle(2, HEIGHT / 5, 0, DIAMETER);
        Circle ball3 = new Circle(3, HEIGHT / 5, 0, DIAMETER);
        Circle ball4 = new Circle(4, HEIGHT / 5, 0, DIAMETER);

        balls = Arrays.asList(ball1, ball2, ball3, ball4);
    }

    @Override
    public void draw() {

        for (Circle ball : balls) {
            ellipse(ball.getSpeed(), ball.getHeight(), ball.getDiameter(), ball.getDiameter());
            ball.updateSpeed();
        }
    }
}
