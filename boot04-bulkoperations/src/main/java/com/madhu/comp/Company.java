package com.madhu.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="org.info")
//@PropertySource(value="in/madhu/commons/input.properties")
@PropertySource("application.properties")

public class Company {
	@Value("${name}")
private String name;
private String location;
private Integer size;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Integer getSize() {
	return size;
}
public void setSize(Integer size) {
	this.size = size;
}
@Override
public String toString() {
	return "Company [name=" + name + ", location=" + location + ", size=" + size + "]";
}

	
}
