package com.example.colorinfo.View;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.colorinfo.Presenter.ColorPresenter;
import com.example.colorinfo.R;

public class MainActivity extends AppCompatActivity implements ColorView {

    private ColorPresenter presenter;

    private LinearLayout linearLayout;

    private EditText redText;
    private EditText greenText;
    private EditText blueText;

    private SeekBar redBar;
    private SeekBar greenBar;
    private SeekBar blueBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPresenter(this);

        linearLayout = findViewById(R.id.linearLayout);

        redText = findViewById(R.id.redEditText);
        greenText = findViewById(R.id.greenEditText);
        blueText = findViewById(R.id.blueEditText);

        redBar = findViewById(R.id.redSeekBar);
        greenBar = findViewById(R.id.greenSeekBar);
        blueBar = findViewById(R.id.blueSeekBar);

        this.linearLayout.setBackgroundColor(Color.rgb(presenter.getRed(), presenter.getGreen(), presenter.getBlue()));

        redBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                presenter.updateRedValueOfBackgroundColor(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        greenBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                presenter.updateGreenValueOfBackgroundColor(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blueBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                presenter.updateBlueValueOfBackgroundColor(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        redText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    updateRedColorOfBackground(R.integer.minColorValue);
                else
                    updateRedColorOfBackground(Integer.valueOf(charSequence.toString()));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        greenText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    updateGreenColorOfBackground(R.integer.minColorValue);
                else
                    updateGreenColorOfBackground(Integer.valueOf(charSequence.toString()));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        blueText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0)
                    updateBlueColorOfBackground(R.integer.minColorValue);
                else
                    updateBlueColorOfBackground(Integer.valueOf(charSequence.toString()));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void updateRedColorOfBackground(int red) {
        if (this.redText.getText().toString().compareTo(String.valueOf(red)) != 0) {
            this.redText.setText(String.valueOf(red));
            this.redText.setSelection(this.redText.length());
        }

        this.redBar.setProgress(red);
        this.linearLayout.setBackgroundColor(Color.rgb(presenter.getRed(), presenter.getGreen(), presenter.getBlue()));
    }

    @Override
    public void updateGreenColorOfBackground(int green) {

        if (this.greenText.getText().toString().compareTo(String.valueOf(green)) != 0) {
            this.greenText.setText(String.valueOf(green));
            this.greenText.setSelection(this.greenText.length());
        }

        this.greenBar.setProgress(green);
        this.linearLayout.setBackgroundColor(Color.rgb(presenter.getRed(), presenter.getGreen(), presenter.getBlue()));
    }

    @Override
    public void updateBlueColorOfBackground(int blue) {
        if (this.blueText.getText().toString().compareTo(String.valueOf(blue)) != 0) {
            this.blueText.setText(String.valueOf(blue));
            this.blueText.setSelection(this.blueText.length());
        }

        this.blueBar.setProgress(blue);
        this.linearLayout.setBackgroundColor(Color.rgb(presenter.getRed(), presenter.getGreen(), presenter.getBlue()));
    }

    @Override
    public void setPresenter(ColorView colorView) {
        this.presenter = new ColorPresenter(colorView);
    }
}
