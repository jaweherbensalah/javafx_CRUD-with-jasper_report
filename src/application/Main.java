package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
private FXMLLoader loader;
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Test.fxml"));
			loader.load();
			Scene scene = new Scene(loader.getRoot());
			scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("JavaFX + Database + Jasper Report CRUD");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
