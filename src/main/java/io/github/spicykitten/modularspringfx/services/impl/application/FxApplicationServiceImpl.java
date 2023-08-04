package io.github.spicykitten.modularspringfx.services.impl.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.spicykitten.modularspringfx.application.FxApplication;
import io.github.spicykitten.modularspringfx.services.impl.FxServiceImpl;
import io.github.spicykitten.modularspringfx.services.service.application.FxApplicationService;

@Service
public class FxApplicationServiceImpl extends FxServiceImpl implements FxApplicationService
{
	@Autowired
	private FxApplication application;

	@Override
	public FxApplication getApplication()
	{
		return application;
	}
}
