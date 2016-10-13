package com.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@javax.ws.rs.ApplicationPath("resources")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();

		addRestResourceClasses(resources);
		return resources;
	}
	
	@Override
    public Set<Object> getSingletons() {
        final Set<Object> instances = new HashSet<>();
        instances.add(new JacksonJsonProvider());
        return instances;
    }

	private void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(CourseController.class);
	}
}
