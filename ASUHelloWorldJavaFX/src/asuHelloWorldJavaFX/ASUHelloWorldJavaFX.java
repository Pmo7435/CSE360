package asuHelloWorldJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class ASUHelloWorldJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
    	System.out.println("Emilio Valencia Hello World!");
    	System.out.println("It started!");
        primaryStage.setTitle("Inclass Github Activity1");
        Button btn = new Button();
        
        btn.setText("Display: 'Emilio says: Hello World!'");
        
        btn.setOnAction(new EventHandler<>() {
            public void handle(ActionEvent event) {
            	
            	for (int i= 0 ; i < 3; i++) {
                System.out.println("Emilio second commit");
            	}
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}