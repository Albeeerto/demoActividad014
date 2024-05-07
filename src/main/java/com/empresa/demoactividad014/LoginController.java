package com.empresa.demoactividad014;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField loginPasswordInput;

    @FXML
    protected void login(ActionEvent event) {
        System.out.println("Botón de inicio de sesión clickeado");
        String username = usernameInput.getText();
        String password = loginPasswordInput.getText();

        // Verifica las credenciales
        if (username.equals("admin@gmail.com") && password.equals("123")) {
            // Muestra un mensaje de inicio de sesión exitoso
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Inicio de Sesión Correcto");
            alert.setHeaderText(null);
            alert.setContentText("Inicio de sesión correcto");
            alert.showAndWait();
        } else {
            // Muestra un mensaje de error
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de inicio de sesión");
            alert.setHeaderText(null);
            alert.setContentText("Usuario o contraseña incorrectos");
            alert.showAndWait();
        }
    }
}