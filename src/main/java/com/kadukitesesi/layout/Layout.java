package com.kadukitesesi.layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layout extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        VBox tela = new VBox();
        tela.getChildren().add(new Caixa().caixaComTexto("Caixa1"));
        tela.getChildren().add(new Caixa().caixaComTexto("Caixa2"));
        tela.getChildren().add(new Caixa().caixaComTexto("caixa3"));
        tela.setAlignment(Pos.CENTER);

        Scene principal = new Scene(tela, 400, 400);
        stage.setScene(principal);

        stage.setTitle("Gerenciadores de Layout");

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
