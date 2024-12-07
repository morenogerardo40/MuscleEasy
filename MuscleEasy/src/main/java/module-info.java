module com.uiejemplos.muscleeasy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.muscleeasy to javafx.fxml;
    exports com.uiejemplos.muscleeasy;
}