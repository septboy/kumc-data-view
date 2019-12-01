package ksh.openjfx.example.view;

import javax.inject.Inject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ksh.openjfx.example.service.Greeter;
import ksh.openjfx.example.service.Message;

public class FXController {

	@FXML
	Label lblMessage;

	@FXML
	TextField txtName;

	@Inject @Message
	public Greeter greeter;

	public void updateMessage() {
		String greeting = greeter.greet(txtName.getText());
		lblMessage.setText(greeting);
	}

}
