package io.github.spicykitten.modularspringfx.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import io.github.spicykitten.modularspringfx.service.FxApplicationContextService;
import io.github.spicykitten.modularspringfx.service.FxApplicationStartupService;
import io.github.spicykitten.modularspringfx.service.FxResourceService;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Service
public class FxApplicationStartupServiceImpl extends FxServiceImpl
	implements FxApplicationStartupService
{
	@Autowired
	private FxResourceService resourceService;
	@Autowired
	private FxApplicationContextService contextService;

	@Override
	public void start(ApplicationArguments args)
	{
		Platform.startup(() ->
		{
			try
			{
				var loader = resourceService.fetchLoader();
				loader.setControllerFactory(contextService.getApplicationContext()::getBean);
				Parent root = resourceService.fetchResource(loader, "/fxml/main.fxml");
				var scene = new Scene(root);
				var stage = new Stage();
				System.out.println("Stage: " + stage);
				stage.setScene(scene);
				stage.show();
				System.out.println("Stage width: %s".formatted(stage.getWidth()));
				System.out.println("Run successfully as an application!");
			}
			catch(IOException e)
			{
				throw new RuntimeException(e);
			}
		});
	}
}
