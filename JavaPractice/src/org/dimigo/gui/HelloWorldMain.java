package org.dimigo.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by HIPERCUBE on 11/16/15.
 */
public class HelloWorldMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        // Create Container
        final VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);

        Button btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create UI Control
                final Label label = new Label();
                label.setText("Label");
                label.setFont(new Font(40));
                root.getChildren().add(label);
            }
        });
        root.getChildren().add(btnAdd);

        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
}
