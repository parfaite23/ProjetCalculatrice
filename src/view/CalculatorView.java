/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.CalculatorModel;

public class CalculatorView extends GridPane {
    private TextField number1TextField;
    private TextField number2TextField;
    private Button calculateButton;
    private Label resultLabel;
    private CalculatorModel calculatorModel;

    public CalculatorView(CalculatorModel model) {
        this.calculatorModel = model;

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));
        setAlignment(Pos.CENTER);

        number1TextField = new TextField();
        number1TextField.setPromptText("Number 1");

        number2TextField = new TextField();
        number2TextField.setPromptText("Number 2");

        calculateButton = new Button("Calculate");

        resultLabel = new Label();

        calculateButton.setOnAction(e -> performCalculation());

        add(new Label("Number 1:"), 0, 0);
        add(number1TextField, 1, 0);
        add(new Label("Number 2:"), 0, 1);
        add(number2TextField, 1, 1);
        add(calculateButton, 0, 2);
        add(new Label("Result:"), 0, 3);
        add(resultLabel, 1, 3);
    }

    private void performCalculation() {
        double number1 = Double.parseDouble(number1TextField.getText());
        double number2 = Double.parseDouble(number2TextField.getText());
        calculatorModel.setNumber1(number1);
        calculatorModel.setNumber2(number2);
        calculatorModel.add(); // Effectuer l'addition dans le modèle
    }

    public TextField getNumber1TextField() {
        return number1TextField;
    }

    public TextField getNumber2TextField() {
        return number2TextField;
    }

    public Button getCalculateButton() {
        return calculateButton;
    }

    public Label getResultLabel() {
        return resultLabel;
    }
}
