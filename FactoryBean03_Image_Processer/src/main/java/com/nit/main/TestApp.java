package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.ImageProcessor;

public class TestApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
	ImageProcessor imageProcessor=ctx.getBean(ImageProcessor.class);
	imageProcessor.process();
	
}
}
