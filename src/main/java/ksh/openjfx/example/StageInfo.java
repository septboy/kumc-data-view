package ksh.openjfx.example;

import javafx.stage.Stage;

public class StageInfo {

	private Stage stage ;
	
	private String stageId ;

	public StageInfo(Stage stage, String stageId) {
		this.stage = stage;
		this.stageId = stageId ;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public String getStageId() {
		return stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
	}
	
	
}
