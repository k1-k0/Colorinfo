package com.example.colorinfo.View;

import com.example.colorinfo.Presenter.ColorPresenterInterface;

public interface ColorView extends ColorPresenterInterface {
    void setPresenter(ColorView colorView);
}
