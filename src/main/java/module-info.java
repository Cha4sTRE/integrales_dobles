module cj.calculo.integrales_dobles {
    requires javafx.controls;
    requires javafx.fxml;
    requires MathParser.org.mXparser;
    requires java.xml;


    opens cj.calculo.integrales_dobles.controllers to javafx.fxml;
    exports cj.calculo.integrales_dobles;
    opens cj.calculo.integrales_dobles.models to javafx.fxml;
}