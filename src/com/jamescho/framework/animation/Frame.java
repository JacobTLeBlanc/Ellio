package com.jamescho.framework.animation;

import java.awt.Image;

public class Frame {
	// Instance vars
	private Image image;
	private double duration;
	
	// Constructor
	public Frame(Image image, double duration) {
		this.image = image;
		this.duration = duration;
	}
	
	// Get methods
	public double getDuration() {
		return duration;
	}
	
	public Image getImage() {
		return image;
	}
}
