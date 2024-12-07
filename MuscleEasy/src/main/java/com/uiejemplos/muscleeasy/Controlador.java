package com.uiejemplos.muscleeasy;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controlador {
    public TextField txtFldBotellas;
    public TextField txtFldTrieta;
    public TextField txtFldCarbo;
    public TextField txtFldAgua;
    public TextField txtFldColor;
    public TextField texFldHoja;
    public TextField texFldPetalo;
    public TextField TextFldFlor;
    public TextField TextFldAlcohol;
    public Button btnCalcular;
    public Button btnSalir;

    public void onActionTxtFldTrieta(ActionEvent actionEvent) {
    }

    public void onActionTxtFldCarbo(ActionEvent actionEvent) {
    }

    public void onActionTxtFldAgua(ActionEvent actionEvent) {
    }

    public void onActionTxtFldColor(ActionEvent actionEvent) {
    }

    public void onActionTextFldHoja(ActionEvent actionEvent) {
    }

    public void onActionTextFldPetalo(ActionEvent actionEvent) {
    }

    public void onActionTextFldFlor(ActionEvent actionEvent) {
    }

    public void onActionTextFldAlcohol(ActionEvent actionEvent) {
    }

    public void onActionCalcular(ActionEvent actionEvent) {
        int numBotellas;
        numBotellas = Integer.parseInt(txtFldBotellas.getText());
        txtFldCarbo.setText(String.valueOf((double)numBotellas*1));
        txtFldAgua.setText(String.valueOf((double)numBotellas*50));
        txtFldColor.setText(String.valueOf((double)numBotellas*3));
        txtFldTrieta.setText(String.valueOf((double)numBotellas*2));
        texFldHoja.setText(String.valueOf((double)numBotellas*4));
        texFldPetalo.setText(String.valueOf((double)numBotellas*4));
        TextFldAlcohol.setText(String.valueOf((double)numBotellas*2));
        TextFldFlor.setText(String.valueOf((double)numBotellas*4));
    }

    public void onActionBtnSalir(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        Stage stg = (Stage) node.getScene().getWindow();
        stg.close();
    }

    public void onActionTxtFldBotellas(ActionEvent actionEvent) {
    }
}
