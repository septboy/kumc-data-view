package ksh.openjfx.example;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.util.AnnotationLiteral;

import javafx.application.Application;
import javafx.stage.Stage;

public class MICApplication extends Application {

	private static SeContainer seContainer = null ;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	@SuppressWarnings("serial")
	public void start(Stage primaryStage) throws Exception {
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		seContainer = initializer.initialize();	
		
		startStage(new StageInfo(primaryStage, "hello-world" ));
	}
	
	public static void startStage(StageInfo stageInfo) {
		seContainer.getBeanManager().fireEvent(
				stageInfo
				, new AnnotationLiteral<StartupScene>() {}
			);
	}

}