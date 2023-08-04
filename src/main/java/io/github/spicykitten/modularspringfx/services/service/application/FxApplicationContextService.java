package io.github.spicykitten.modularspringfx.services.service.application;

import org.springframework.context.ApplicationContext;

import io.github.spicykitten.modularspringfx.services.service.FxService;

public interface FxApplicationContextService extends FxService
{
	public ApplicationContext getApplicationContext();
}
