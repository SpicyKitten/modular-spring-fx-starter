package io.github.spicykitten.modularspringfx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import io.github.spicykitten.modularspringfx.service.FxApplicationStartupService;

@SpringBootApplication
@EnableAutoConfiguration( exclude =
	{ DataSourceAutoConfiguration.class } )
@Profile( "!test" )
@Component
public class ModularSpringFxApplication implements ApplicationRunner
{
	@Autowired
	private FxApplicationStartupService startupService;

	public static void main(String[] args)
	{
		SpringApplication.run(ModularSpringFxApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		startupService.start(args);
	}
}
