package com.ss;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration                               // by this we are telling to spring container this is my configuration file
@ComponentScan (basePackages = "com.ss")    //  We are telling which packages to scan for beans
public class config {
	
}
