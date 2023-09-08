package com.example.loan_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
//importing all label & text field fx:id
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

//allows functionality with button
    @FXML
    public void buttonHandler(ActionEvent event) {

//initializing values for monthly loan payments & total loan payment
        double totalAmount = 0;
        double monthlyPay = 0;

//allow user input on GUI to input loan amount, annual rate, and number of years to pay
        double loanAmount = Double.parseDouble(loanAmountTF.getText());
        double annualRate = Double.parseDouble(annualTF.getText());
        int numberYears = Integer.parseInt(numberOfYearsTF.getText());

//calculation to find monthly pay
        monthlyPay = loanAmount * annualRate/1200 / (1 - 1 / Math.pow(1 + annualRate/1200, numberYears * 12));
        mPay.setText("$ " + monthlyPay * 100 / 100.0);

//calculation to find total pay
        totalAmount = monthlyPay * numberYears * 12;
        tPay.setText("$ " + totalAmount);

    }

}