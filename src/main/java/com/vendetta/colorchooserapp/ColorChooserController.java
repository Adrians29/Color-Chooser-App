package com.vendetta.colorchooserapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorChooserController {
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 0.00;
    
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
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.2f"));
        blueTextField.textProperty().bind(blueSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(greenSlider.valueProperty().asString("%.0f"));
        redTextField.textProperty().bind(redSlider.valueProperty().asString("%.0f"));
    
        alphaSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            
            updateRectangleColor();
        });
        blueSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            updateRectangleColor();
        });
        greenSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            updateRectangleColor();
        });
        redSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            updateRectangleColor();
        });
        
        
    }
    
    private void updateRectangleColor() {
        blue = (int) blueSlider.getValue();
        green = (int) greenSlider.getValue();
        red = (int) redSlider.getValue();
        alpha = (double) alphaSlider.getValue();
        colorRectangle.setFill(Color.rgb(red, green, blue));
        colorRectangle.setOpacity(alpha);
    }
    

}
