package io.github.spicykitten.modularspringfx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import io.github.spicykitten.modularspringfx.service.FxApplicationContextService;

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
