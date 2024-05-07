package com.empresa.demoactividad014;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField emailInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private PasswordField confirmPasswordInput;

    @FXML
    private DatePicker datePicker;

    @FXML
    private CheckBox privacyCheckBox;

    @FXML
    protected void registerUser() {
        // Aquí puedes implementar la lógica para registrar al usuario
        // Por ahora, mostraremos un mensaje de registro exitoso
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro Exitoso");
        alert.setHeaderText(null);
        alert.setContentText("Usuario registrado");
        alert.showAndWait();
    }

    @FXML
    protected void switchToLoginView() throws IOException {
        // Aquí puedes cambiar a la ventana de inicio de sesión
        Parent root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        Stage stage = (Stage) emailInput.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}