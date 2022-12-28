package io.github.spicykitten.modularspringfx.service;

import org.springframework.context.ApplicationContext;

public interface FxApplicationContextService extends FxService
{
	public ApplicationContext getApplicationContext();
}
