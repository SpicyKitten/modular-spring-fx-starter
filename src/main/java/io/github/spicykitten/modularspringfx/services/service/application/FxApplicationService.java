package io.github.spicykitten.modularspringfx.services.service.application;

import io.github.spicykitten.modularspringfx.application.FxApplication;
import io.github.spicykitten.modularspringfx.services.service.FxService;

public interface FxApplicationService extends FxService
{
	FxApplication getApplication();
}