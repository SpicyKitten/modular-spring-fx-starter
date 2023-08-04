package io.github.spicykitten.modularspringfx.services.impl.application;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;
import io.github.spicykitten.modularspringfx.services.impl.FxServiceImpl;
import io.github.spicykitten.modularspringfx.services.service.application.FxApplicationContextService;
import io.github.spicykitten.modularspringfx.services.service.application.FxApplicationService;
import io.github.spicykitten.modularspringfx.services.service.application.FxApplicationStartupService;
import io.github.spicykitten.modularspringfx.services.service.resource.FxResourceService;
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
	@Autowired
	private FxApplicationService applicationService;

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
				var application = applicationService.getApplication();
				application.start(stage);
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
