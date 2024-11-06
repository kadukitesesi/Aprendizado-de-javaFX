package com.kadukitesesi.quentinhas;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class HelloApplication extends Application {

    private Integer contador = 0;

    public void mudarCor(Label label) {
        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelho");
        label.setText(contador.toString());
        if (contador > 0 ) {
            label.getStyleClass().add("verde");
        } else if(contador < 0 ) {
            label.getStyleClass().add("vermelho");
        }
        }

    @Override
    public void start(Stage stage) throws IOException {

        Label labelTitulo = new Label("Contador");
        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("contador");

        Button decremento = new Button("-");
        decremento.getStyleClass().add("decremento");
        decremento.setOnAction(e -> {
            contador--;
            mudarCor(labelNumero);
        });
        Button incremento = new Button("+");
        incremento.setOnAction(e -> {
            contador++;
            mudarCor(labelNumero);
        });
        HBox boxBotoes = new HBox();
        boxBotoes.getChildren().add(decremento);
        boxBotoes.getChildren().add(incremento);
        boxBotoes.setSpacing(10);
        boxBotoes.setAlignment(Pos.CENTER);

        TextField texto = new TextField();
        HBox boxInput = new HBox();
        Label labelInput = new Label("Escreva algo: ");
        texto.setAlignment(Pos.CENTER);
        texto.setMaxWidth(200);
        boxInput.getChildren().add(labelInput);
        boxInput.getChildren().add(texto);
        boxInput.setSpacing(10);
        boxInput.setAlignment(Pos.CENTER);
        texto.setOnAction(e -> {
            System.out.println(texto.getCharacters());
        });


        VBox boxPrincipal = new VBox();


        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.setSpacing(10);
        boxPrincipal.getChildren().add(labelTitulo);
        boxPrincipal.getChildren().add(labelNumero);
        boxPrincipal.getChildren().add(boxBotoes);
        boxPrincipal.getChildren().add(boxInput);
        boxPrincipal.getStyleClass().add("principal");


        Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);

        cenaPrincipal.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        stage.setScene(cenaPrincipal);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}