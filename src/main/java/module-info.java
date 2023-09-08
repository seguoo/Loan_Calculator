module com.example.loan_calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.loan_calculator to javafx.fxml;
    exports com.example.loan_calculator;
}