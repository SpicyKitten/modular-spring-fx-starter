package io.github.spicykitten.modularspringfx.services.impl.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import io.github.spicykitten.modularspringfx.services.impl.FxServiceImpl;
import io.github.spicykitten.modularspringfx.services.service.resource.FxResourceService;
import javafx.fxml.FXMLLoader;

@Service
public class FxResourceServiceImpl extends FxServiceImpl implements FxResourceService
{
	public InputStream fetchStream(String resource)
	{
		System.out.println("Fetching stream for: " + resource);
		return getClass().getResourceAsStream(resource);
	}

	public <T> List<T> fetchResources(FXMLLoader loader, String... resources) throws IOException
	{
		var result = new ArrayList<T>();
		for(var resource : resources)
		{
			System.out.println("The resource is: " + resource);
			result.add(loader.load(fetchStream(resource)));
		}
		return result;
	}

	public <T> T fetchResource(FXMLLoader loader, String resource) throws IOException
	{
		return this.<T>fetchResources(loader, resource).get(0);
	}

	public <T> List<T> fetchResources(String... resources) throws IOException
	{
		return fetchResources(fetchLoader(), resources);
	}

	public <T> T fetchResource(String resource) throws IOException
	{
		return this.<T>fetchResources(resource).get(0);
	}

	public FXMLLoader fetchLoader()
	{
		return new FXMLLoader();
	}
}