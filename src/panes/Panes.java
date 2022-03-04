/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 * @author Csernay Attila
 *
 * Feladat: Create applications which use different Pane as the root node. You
 * can add minimum 3 nodes to the root node to see the difference between the
 * panes. They can be any types of nodes. You have to upload 4 different classes
 * with a different root node: - Use FlowPane - Use BorderPane - use minimum 5
 * other nodes here - Use GridPane - Use TextFlow You can choose the variables
 * names freely. Upload the entire project in one compressed file!
 */
public class Panes extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button buttonFlow = new Button("FlowPane");
        buttonFlow.setOnAction((e) -> {
            FlowPane p = new FlowPane();

            for (int i = 0; i < 10; i++) {
                p.getChildren().add(new Label("Lorem Ipsum " + (i + 1)));
            }

            Scene s = new Scene(p, 300, 250);
            Stage st = new Stage();
            st.setScene(s);
            st.show();
        });

        Button buttonBorder = new Button("BorderPane");
        buttonBorder.setOnAction((e) -> {
            BorderPane p = new BorderPane();

            Label l = new Label("TOP");
            p.setMargin(l, new Insets(1));
            p.setTop(l);

            l = new Label("LEFT");
            p.setMargin(l, new Insets(1));
            p.setLeft(l);

            l = new Label("CENTER");
            p.setMargin(l, new Insets(1));
            p.setCenter(l);

            l = new Label("RIGHT");
            p.setMargin(l, new Insets(1));
            p.setRight(l);

            l = new Label("BOTTOM");
            p.setMargin(l, new Insets(1));
            p.setBottom(l);

            Scene s = new Scene(p, 300, 250);
            Stage st = new Stage();
            st.setScene(s);
            st.show();
        });

        Button buttonGrid = new Button("GridPane");
        buttonGrid.setOnAction((e) -> {
            GridPane p = new GridPane();
            int row = 0;

            for (int i = 0; i < 10; i++) {
                p.addRow(row, new Label("Lorem Ipsum " + (i + 1)));
                if (i % 3 == 0) {
                    row++;
                }
            }

            Scene s = new Scene(p, 300, 250);
            Stage st = new Stage();
            st.setScene(s);
            st.show();
        });
        
        Button buttonText = new Button("TextFlow");
        buttonText.setOnAction((e) -> {
            TextFlow p = new TextFlow();
            Text t = new Text("asdslédgjéalfgk éladfkkkajfáa jdlkdfa ékdfjgk landfélk gjadf gjéaldkfa gádf\n\n");
            p.getChildren().add(t);

            for (int i = 0; i < 10; i++) {
                p.getChildren().add(new Label("Lorem Ipsum " + (i + 1)));
            }

            Scene s = new Scene(p, 300, 250);
            Stage st = new Stage();
            st.setScene(s);
            st.show();
        });

        VBox root = new VBox(buttonFlow, buttonBorder, buttonGrid, buttonText);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
