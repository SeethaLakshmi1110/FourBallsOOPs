package com.processing.oops;

public class Ball {
    public final int number;
    public float position;
    public float height;
    static final float SIZE = 15;

    public Ball(int number) {
        this.number = number;
    }

    public void setPosition(float position) {
        this.position = position;
    }

    public float getPosition() {
        return this.position;
    }

    public void setHeight(int totalBalls, int screenHeight) {
        int totalPartitions = totalBalls + 1;
        int ballHeight = screenHeight * this.number;
        this.height = ballHeight / totalPartitions;
    }

    public float getHeight() {
        return this.height;
    }
}