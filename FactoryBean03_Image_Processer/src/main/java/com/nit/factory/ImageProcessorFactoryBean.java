package com.nit.factory;

import org.springframework.beans.factory.FactoryBean;

import com.nit.sbeans.FilterProcessor;
import com.nit.sbeans.ImageProcessor;
import com.nit.sbeans.ResizeProcessor;
import com.nit.sbeans.WatermarkProcessor;

public class ImageProcessorFactoryBean implements FactoryBean<ImageProcessor>{
	
	private String imageProcessorType;
	
	

	public void setImageProcessorType(String imageProcessorType) {
		this.imageProcessorType = imageProcessorType;
	}

	@Override
	public ImageProcessor getObject() throws Exception {
		if("resize".equalsIgnoreCase(imageProcessorType)) {
			return new ResizeProcessor();
		}
		else if("filter".equalsIgnoreCase(imageProcessorType)) {
			return new FilterProcessor();
		}
		if("watermark".equalsIgnoreCase(imageProcessorType)) {
			return new WatermarkProcessor();
		}
		else {
			throw new IllegalArgumentException("This sevice is not available");
		}
	}

	@Override
	public Class<ImageProcessor> getObjectType() {
		return ImageProcessor.class;
	}

}
