package ksh.openjfx.example.view;

import java.io.IOException;
import java.net.URL;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ksh.openjfx.example.StageInfo;
import ksh.openjfx.example.StartupScene;

public class ViewStarter {

	@Inject 
	public FXMLLoader fxmlLoader;

	public void start(@Observes @StartupScene StageInfo stageInfo) {
		try {
			Class<?> clazz = getClass();
			Stage stage = stageInfo.getStage();
			String stageFxml = getStageFxml(stageInfo.getStageId()) ;
			
			URL arquivoFXML = clazz.getResource(stageFxml);
			Parent fxmlParent = fxmlLoader.load(arquivoFXML.openStream());
			stage.setScene(new Scene(fxmlParent, 300, 100));
			stage.setTitle("Hello World FXML and JavaFX");
			
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getStageFxml(String stageId) {
		return stageId+".fxml";
	}

}
