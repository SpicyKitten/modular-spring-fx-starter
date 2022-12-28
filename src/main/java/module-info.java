open module io.github.spicykitten.modular_spring_fx_starter
{
	requires javafx.controls;
	requires javafx.media;
	requires transitive javafx.fxml;
	requires transitive javafx.graphics;
	requires org.assertj.core;
	requires org.junit.jupiter.api;
	requires org.junit.platform.commons;
	requires org.slf4j;
	requires spring.boot.autoconfigure;
	requires spring.boot.starter.test;
	requires spring.boot.test;
	requires transitive spring.context;
	requires spring.test;
	requires spring.beans;
	requires transitive spring.boot;
	requires spring.core;

	exports io.github.spicykitten.modularspringfx.application;
	exports io.github.spicykitten.modularspringfx.configuration;
	exports io.github.spicykitten.modularspringfx.controller;
	exports io.github.spicykitten.modularspringfx.service;
	exports io.github.spicykitten.modularspringfx.service.impl;
}