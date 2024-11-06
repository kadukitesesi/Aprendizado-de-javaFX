package com.kadukitesesi.layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Caixa extends HBox {


    private static int i = 0;
    public String[] cores = {
            "#c33c5e", "#39aac6", "#28d79a",
            "#fb750e", "#6657a8", "#f9060e"
    };

    public Caixa() {
        this(100,100);
    }

    public Caixa(int altura, int largura) {
        setAlignment(Pos.CENTER);
        setMaxWidth(largura);
        setMinHeight(altura);
        BackgroundFill fill = new BackgroundFill(Color.web(cores[i]),
                CornerRadii.EMPTY, Insets.EMPTY);
        setBackground(new Background(fill));

        i++;
        if (i == 6) i = 0;
    }

    public Caixa caixaComTexto(String texto) {
        Label label = new Label(texto);
        getChildren().add(label);
        return this;
    }
}
