package com.kadukitesesi.quentinhas;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private Stage janela;
    private Scene cena1;
    private Scene cena2;
    private Scene cena3;

    @Override
    public void start(Stage primaryStage) throws Exception {

        janela = primaryStage;
        criarCena1();
        criarCena2();
        criarCena3();
        janela.setTitle("Segunda Tela");
        janela.setScene(cena1);
        janela.show();
    }

    private void criarCena1() {
        HBox boxCena1 = new HBox();
        Button proximoPasso = new Button("Ir para a cena 2");
        proximoPasso.setOnAction(e -> {
            janela.setScene(cena2);
        });
        boxCena1.getChildren().add(proximoPasso);
        boxCena1.setAlignment(Pos.CENTER);

        cena1 = new Scene(boxCena1, 400, 400);
    }

    private void criarCena2() {
        HBox boxCena1 = new HBox();
        Button proximoPasso = new Button("Ir para a cena 3");
        proximoPasso.setOnAction( e -> janela.setScene(cena3));
        Button passoAnterior = new Button("Ir para a cena 1");
        passoAnterior.setOnAction(e -> janela.setScene(cena1));
        boxCena1.getChildren().add(proximoPasso);
        boxCena1.getChildren().add(passoAnterior);
        boxCena1.setSpacing(10);
        boxCena1.setAlignment(Pos.CENTER);

        cena2 = new Scene(boxCena1, 400, 400);
    }

    private void criarCena3() {
        HBox boxCena1 = new HBox();
        Button passoAnterior = new Button("Ir para a cena 2");
        passoAnterior.setOnAction(e -> janela.setScene(cena2));

        Button primeiroPasso = new Button("Ir para a cena 1");
        passoAnterior.setOnAction(e -> janela.setScene(cena1));
        boxCena1.getChildren().add(primeiroPasso);
        boxCena1.getChildren().add(passoAnterior);
        boxCena1.setSpacing(10);
        boxCena1.setAlignment(Pos.CENTER);

        cena3 = new Scene(boxCena1, 400, 400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
