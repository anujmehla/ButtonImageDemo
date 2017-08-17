package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
/*
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }*/
    Label response;
    public void start(Stage myStage)
    {

        myStage.setTitle("ButtonImageDemo");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode,500,500);
        myStage.setScene(myScene);
        myStage.setResizable(false);
        response =new Label("Push A Button");
        ImageView hourGlassIV=new ImageView("hourglass.png");
        Button myButton = new Button("hourglass",hourGlassIV);
        Button myButton2 = new Button("Analog Clock",new ImageView("analog.jpg"));
        myButton.setContentDisplay(ContentDisplay.TOP);
        myButton2.setContentDisplay(ContentDisplay.TOP);
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("HourGlass Pressed.");
            }
        });
        myButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Analog Clock Pressed.");
            }
        });

        rootNode.getChildren().addAll(myButton,myButton2,response);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
