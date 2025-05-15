package cj.calculo.integrales_dobles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.mariuszgromada.math.mxparser.License;


public class Calculadora extends Application {

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        License.iConfirmNonCommercialUse("Proyecto académico - Ingeniería de Software");
        AnchorPane loader=FXMLLoader.load(Calculadora.class.getResource("menu_calculadora.fxml"));
        Scene scene=new Scene(loader);
        stage.setScene(scene);
        stage.show();
    }
}
