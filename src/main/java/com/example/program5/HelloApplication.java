package com.example.program5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("PROGRAM TO ORDER THE LETTERS FROM z to a");
        System.out.println("Letters: z, b, e, f, a, c, o, s");
        char[] arride = {'z', 'b', 'e', 'f', 'a', 'c', 'o', 's'};
        int length = arride.length;

        // Ordenar de z a a
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arride[i] < arride[j]) {
                    char auxiliar = arride[i];
                    arride[i] = arride[j];
                    arride[j] = auxiliar;
                }
            }
        }
        System.out.println("Result:");
        for (char c : arride) {
            System.out.print(c + "   ");
        }
    }
}