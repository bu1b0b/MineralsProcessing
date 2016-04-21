package ru.minepro.main;

import java.util.Locale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MineProMain extends Application {

	Scene scene;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("MineProMain.fxml"));
			scene = new Scene(parent, 800, 500);
			// primaryStage.setMaximized(true);

			primaryStage.getIcons().add(new Image(MineProMain.class.getResourceAsStream("MineProLogo.png")));
			primaryStage.setOpacity(1);
			primaryStage.setScene(scene);
			primaryStage.setTitle("MinePro");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		initLocale();
		launch(args);
	}

	private static void initLocale() {
		Locale.setDefault(Locale.forLanguageTag("ru-RU"));
	}

} // class end
