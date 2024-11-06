package com.kadukitesesi.layout;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Retangulo extends Rectangle {

    private static int i = 0;
    public String[] cores = {
            "#c33c5e", "#39aac6", "#28d79a",
            "#fb750e", "#6657a8", "#f9060e"
    };

    public Retangulo() {
        this(100,100);
    }

    public Retangulo(int altura, int largura) {
        setWidth(largura);
        setHeight(altura);

        setFill(Color.web(cores[i]));

        i++;
        if (i == 6) i = 0;
    }

}
