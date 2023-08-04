package io.github.spicykitten.modularspringfx.services.impl.action;

import org.springframework.stereotype.Service;
import io.github.spicykitten.modularspringfx.services.impl.FxServiceImpl;
import io.github.spicykitten.modularspringfx.services.service.action.FxButtonActionService;

@Service
public class FxButtonActionServiceImpl extends FxServiceImpl implements FxButtonActionService
{
	@Override
	public void handleButtonAction(Object... args)
	{
		System.out.println("Button pressed");
	}
}
