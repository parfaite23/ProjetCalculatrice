/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        view.getCalculateButton().setOnAction(new CalculateButtonHandler());

        model.addObserver((o, arg) -> {
            view.getResultLabel().setText(String.valueOf(model.getResult()));
        });
    }

    private class CalculateButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            double number1 = Double.parseDouble(view.getNumber1TextField().getText());
            double number2 = Double.parseDouble(view.getNumber2TextField().getText());

            model.setNumber1(number1);
            model.setNumber2(number2);
            model.add(); // Effectuer l'addition dans le modèle
        }
    }
}
