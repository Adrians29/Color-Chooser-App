package com.vendetta.colorchooserapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class ColorChooserController {
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private int alpha = 0;
    
    @FXML
    private Slider alphaSlider;

    @FXML
    private TextField alphaTextField;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField blueTextField;

    @FXML
    private Rectangle colorRectangle;

    @FXML
    private Slider greenSlider;

    @FXML
    private TextField greenTextField;

    @FXML
    private Slider redSlider;

    @FXML
    private TextField redTextField;
    
    public void initialize() {
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty().bind(blueSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(greenSlider.valueProperty().asString("%.0f"));
        redTextField.textProperty().bind(redSlider.valueProperty().asString("%.0f"));
    
        alphaSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            alphaTextField.setText(String.valueOf(newValue));
        });
        blueSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            blueTextField.setText(String.valueOf(newValue));
        });
        greenSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            greenTextField.setText(String.valueOf(newValue));
        });
        redSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            redTextField.setText(String.valueOf(newValue));
        });
    }
    
    
}
