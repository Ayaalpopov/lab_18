package com.example.lab_18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {
    @FXML
    private TextArea area;
    @FXML
    private TextField text;
    @FXML
    public void sendMess(ActionEvent event) {
        area.appendText("Your massage: " + text.getText() + "\n");
        text.setText("");
        text.requestFocus();
    }
    public void sendMess_enter(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
        }
    }
}