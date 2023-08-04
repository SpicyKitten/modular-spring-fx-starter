package io.github.spicykitten.modularspringfx.services.service.action;

public interface FxButtonActionService extends FxActionService
{
	abstract void handleButtonAction(Object... args);

	default void handleAction(Object... args)
	{
		handleButtonAction(args);
	}
}
