package com.example.colorinfo.Model;

public class Color {

    private final int DEFAULT = 127;

    public Color() {
        this.red = DEFAULT;
        this.green = DEFAULT;
        this.blue = DEFAULT;
    }

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getColorValue() {
        int color = 0;
        color |= red;
        color <<= 8;
        color |= green;
        color <<= 8;
        color |= blue;
        return color;
    }

    private int red;
    private int green;
    private int blue;
}
