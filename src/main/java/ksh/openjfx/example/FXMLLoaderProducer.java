package ksh.openjfx.example;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import javafx.fxml.FXMLLoader;

public class FXMLLoaderProducer {

	@Inject
	public Instance<Object> instance;

	@Produces
	public FXMLLoader createLoader() {
		FXMLLoader loader = new FXMLLoader();
		loader.setControllerFactory(param -> instance.select(param).get());
		return loader;
	}
}