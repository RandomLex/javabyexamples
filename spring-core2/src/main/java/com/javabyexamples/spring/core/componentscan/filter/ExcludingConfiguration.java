package com.javabyexamples.spring.core.componentscan.filter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(
  basePackages = "com.javabyexamples.spring.core.componentscan.level1",
  excludeFilters = {@Filter(Repository.class)})
public class ExcludingConfiguration {

}
