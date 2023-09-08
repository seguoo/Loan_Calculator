package com.example.loan_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label mPay;
    @FXML
    private Label tPay;
    @FXML
    private TextField annualTF;
    @FXML
    private TextField numberOfYearsTF;
    @FXML
    private TextField loanAmountTF;


    @FXML
    public void buttonHandler(ActionEvent event) {

        double totalAmount = 0;
        double monthlyPay = 0;

        double loanAmount = Double.parseDouble(loanAmountTF.getText());
        double annualRate = Double.parseDouble(annualTF.getText());
        int numberYears = Integer.parseInt(numberOfYearsTF.getText());

        monthlyPay = loanAmount * annualRate/1200 / (1 - 1 / Math.pow(1 + annualRate/1200, numberYears * 12));
        mPay.setText(String.valueOf("$ " + monthlyPay * 100 / 100.0));

        totalAmount = monthlyPay * numberYears * 12;
        tPay.setText(String.valueOf("$ " + totalAmount));

    }

}