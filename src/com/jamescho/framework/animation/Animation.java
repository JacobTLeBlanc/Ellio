package com.jamescho.framework.animation;

import java.awt.Graphics;

public class Animation {
	// Instance vars
	private Frame[] frames; // Images used in animation
	private double[] frameEndTimes; // When to end frames
	private int currentFrameIndex = 0; // Current frame
	
	private double totalDuration = 0; // Total duration of animation
	private double currentTime = 0; // Timer
	
	public Animation(Frame... frames) {
		this.frames = frames;
		
		frameEndTimes = new double[frames.length];
		
		for (int i = 0; i < frames.length; i++) {
			Frame f = frames[i];
			totalDuration += f.getDuration();
			frameEndTimes[i] = totalDuration;
		}
	}
	
	public synchronized void update(float increment) {
		currentTime += increment; // Update time by adding time of last frame
		
		if (currentTime > totalDuration) {
			wrapAnimation();
		}
		
		while (currentTime > frameEndTimes[currentFrameIndex]) {
			currentFrameIndex++;
		}
	}
	
	private synchronized void wrapAnimation() {
		currentFrameIndex = 0;
		currentTime %= totalDuration; 
	}
	
	public synchronized void render(Graphics g, int x, int y, int width, int height) {
		g.drawImage(frames[currentFrameIndex].getImage(), x, y, width, height, null);
	}
}
