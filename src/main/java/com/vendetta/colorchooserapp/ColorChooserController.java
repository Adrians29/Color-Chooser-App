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
    
}
