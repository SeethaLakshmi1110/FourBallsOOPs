package com.processing.oops;
import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

public class Processor extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int NUMBER_OF_BALLS = 4;
    List<Ball> balls = new ArrayList<>();

    private void createBalls() {
        int number;
        for (number = 1; number <= NUMBER_OF_BALLS; number ++) {
            this.balls.add(new Ball(number));
        }
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        createBalls();
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.setHeight(NUMBER_OF_BALLS, HEIGHT);
            ellipse(setBallSpeed(ball), ball.getHeight(), Ball.SIZE, Ball.SIZE);
        }
    }

    private float setBallSpeed(Ball ball) {
        float position = ball.position + ball.number;
        ball.setPosition(position);
        return ball.getPosition();
    }

    public static void main(String[] args) {
        PApplet.main("com.processing.oops.Processor", args);
    }
}