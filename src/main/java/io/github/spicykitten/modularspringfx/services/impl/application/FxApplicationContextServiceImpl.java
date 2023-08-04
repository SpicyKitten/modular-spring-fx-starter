package io.github.spicykitten.modularspringfx.services.impl.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import io.github.spicykitten.modularspringfx.services.impl.FxServiceImpl;
import io.github.spicykitten.modularspringfx.services.service.application.FxApplicationContextService;

@Service
public class FxApplicationContextServiceImpl extends FxServiceImpl
	implements FxApplicationContextService
{
	@Autowired
	private ConfigurableApplicationContext applicationContext;

	@Override
	public ConfigurableApplicationContext getApplicationContext()
	{
		return applicationContext;
	}
}
