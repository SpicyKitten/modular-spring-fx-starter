package io.github.spicykitten.modularspringfx.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javafx.fxml.FXMLLoader;

public interface FxResourceService extends FxService
{
	InputStream fetchStream(String resource);
	<T> List<T> fetchResources(FXMLLoader loader, String... resources) throws IOException;
	<T> T fetchResource(FXMLLoader loader, String resource) throws IOException;
	<T> List<T> fetchResources(String... resources) throws IOException;
	<T> T fetchResource(String resource) throws IOException;
	FXMLLoader fetchLoader();;
}