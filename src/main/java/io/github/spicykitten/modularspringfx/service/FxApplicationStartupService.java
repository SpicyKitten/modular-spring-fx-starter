package io.github.spicykitten.modularspringfx.service;

import org.springframework.boot.ApplicationArguments;

public interface FxApplicationStartupService extends FxService
{
	void start(ApplicationArguments args);
}
