package io.github.spicykitten.modularspringfx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.spicykitten.modularspringfx.configuration.FxContext;
import io.github.spicykitten.modularspringfx.services.service.action.FxButtonActionService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

@Component
public class FxController implements Initializable
{
	@Autowired
	private FxContext context;
	@FXML
	private Button button;
	@Autowired
	private FxButtonActionService buttonActionService;

	public FxContext getContext()
	{
		return context;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		System.out.println("Initialized using FxController: %s".formatted(this));
		button.setOnAction(buttonActionService::handleButtonAction);
	}
}
