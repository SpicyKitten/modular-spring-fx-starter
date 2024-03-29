package io.github.spicykitten.modularspringfx.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.github.spicykitten.modularspringfx.controller.FxController;
import javafx.application.Application;
import javafx.stage.Stage;

@Component
public class FxApplication extends Application
{
	@Autowired
	private FxController controller;

	@Override
	public void start(Stage primaryStage)
	{
		System.out.println("Controller is: " + controller);
		System.out.println(primaryStage);
		primaryStage.setTitle(controller.getContext().getTitle());
		primaryStage.show();
	}
}
