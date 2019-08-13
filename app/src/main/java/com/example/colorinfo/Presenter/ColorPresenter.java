package com.example.colorinfo.Presenter;


import com.example.colorinfo.Model.Color;
import com.example.colorinfo.View.ColorView;

public class ColorPresenter {

    public ColorPresenter(ColorView colorView) {
        this.color = new Color();
        this.colorView = colorView;
    }

    public int getRed() {
        return color.getRed();
    }

    public int getGreen() {
        return color.getGreen();
    }

    public int getBlue() {
        return color.getBlue();
    }

    public int getColor() {
        return color.getColorValue();
    }

    public void updateRedValueOfBackgroundColor(int red) {
        this.color.setRed(red);
        this.colorView.updateRedColorOfBackground(red);
    }

    public void updateGreenValueOfBackgroundColor(int green) {
        this.color.setGreen(green);
        this.colorView.updateGreenColorOfBackground(green);
    }

    public void updateBlueValueOfBackgroundColor(int blue) {
        this.color.setBlue(blue);
        this.colorView.updateBlueColorOfBackground(blue);
    }

    private ColorView colorView;
    private Color color;
}
