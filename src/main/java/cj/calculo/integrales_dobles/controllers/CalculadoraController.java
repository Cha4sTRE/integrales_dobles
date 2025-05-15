package cj.calculo.integrales_dobles.controllers;

import cj.calculo.integrales_dobles.models.IntegralDobre;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import org.mariuszgromada.math.mxparser.License;



public class CalculadoraController {

    @FXML
    private Spinner<Double> LimSupX;

    @FXML
    private Spinner<Double> limInfX;

    @FXML
    private Spinner<Double> limInfY;

    @FXML
    private Spinner<Double> limSupY;

    @FXML
    private ToggleGroup tipoCalculoGroup;

    @FXML
    private TextField txtFormula;

    @FXML
    private RadioButton areaRadio;

    @FXML
    private RadioButton volumenRadio;

    @FXML
    private Label lblResultado;

    @FXML
    private Canvas canva;


    @FXML
    void btnCalcular(ActionEvent event) {
        License.iConfirmNonCommercialUse("Proyecto académico - Ingeniería de Software");
        String funcionStr= txtFormula.getText();
        double a=limInfX.getValue();
        double b=limInfY.getValue();
        double c=LimSupX.getValue();
        double d=limSupY.getValue();
        String tipoCalculo= areaRadio.isSelected()?"area":"volumen";
        System.out.printf("f(x,y) = %s; a=%.2f, b=%.2f, c=%.2f, d=%.2f, tipo=%s%n",
                funcionStr, a, b, c, d, tipoCalculo);
        double resultado=new IntegralDobre().calcularIntegral(funcionStr,a,b,c,d,tipoCalculo);

        System.out.println(resultado);
        lblResultado.setText(String.format("%.4f",resultado));

    }
    @FXML
    void initialize(){
        SpinnerValueFactory<Double> valueactoryA= new SpinnerValueFactory.DoubleSpinnerValueFactory(-100.0,100.0,0.0,1.0);
        limInfX.setValueFactory(valueactoryA);
        SpinnerValueFactory<Double> valueactoryB= new SpinnerValueFactory.DoubleSpinnerValueFactory(-100.0,100.0,0.0,1.0);
        limInfY.setValueFactory(valueactoryB);
        SpinnerValueFactory<Double> valueactoryC= new SpinnerValueFactory.DoubleSpinnerValueFactory(-100.0,100.0,0.0,1.0);
        LimSupX.setValueFactory(valueactoryC);
        SpinnerValueFactory<Double> valueactoryD= new SpinnerValueFactory.DoubleSpinnerValueFactory(-100.0,100.0,0.0,1.0);
        limSupY.setValueFactory(valueactoryD);
    }



}

