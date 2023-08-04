package io.github.spicykitten.modularspringfx.services.service.application;

import org.springframework.boot.ApplicationArguments;

import io.github.spicykitten.modularspringfx.services.service.FxService;

public interface FxApplicationStartupService extends FxService
{
	void start(ApplicationArguments args);
}
