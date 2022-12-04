package com.ingeniom22.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField usdInput;
    @FXML
    private TextField cadInput;
    @FXML
    private TextField gdmInput;
    @FXML
    private TextField gbpInput;
    @FXML
    private TextField cadOutput;
    @FXML
    private TextField gdmOutput;
    @FXML
    private TextField gbpOutput;

    @FXML
    private void convertClicked(ActionEvent event) {
        try {
            Integer usd = Integer.valueOf(usdInput.getText());
            Float cad = Float.valueOf(cadInput.getText());
            Float gdm = Float.valueOf(gdmInput.getText());
            Float gbp = Float.valueOf(gbpInput.getText());

            Float cadValue = cad * usd;
            Float gdmValue = gdm * usd;
            Float gbpValue = gbp * usd;

            cadOutput.setText(String.valueOf(cadValue) + " USD");
            gdmOutput.setText(String.valueOf(gdmValue) + " USD");
            gbpOutput.setText(String.valueOf(gbpValue) + " USD");

            System.out.println("Canadian Dollars value      :" + cadOutput);
            System.out.println("German Marks value          :" + gdmOutput);
            System.out.println("British Pounds value        :" + gbpValue);

        } catch (Exception e) {
            // throw new RuntimeException(e);
            System.out.println("Error occured, please try again");
            e.printStackTrace();
        }
    }

}