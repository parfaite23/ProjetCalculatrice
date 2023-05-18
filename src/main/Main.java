/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.CalculatorModel;
import view.CalculatorView;
import controller.CalculatorController;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Créer le modèle, la vue et le contrôleur
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView(model);
        CalculatorController controller = new CalculatorController(view, model);

        // Créer une scène et y ajouter la vue
        Scene scene = new Scene(view, 400, 200);

        // Configurer la fenêtre principale
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
