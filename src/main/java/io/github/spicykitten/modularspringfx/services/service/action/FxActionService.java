package io.github.spicykitten.modularspringfx.services.service.action;

import io.github.spicykitten.modularspringfx.services.service.FxService;

public interface FxActionService extends FxService
{
	void handleAction(Object... args);
}
