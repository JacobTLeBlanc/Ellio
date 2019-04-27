package com.jamescho.game.main;

// Imports
import java.applet.Applet;
import java.applet.AudioClip;

import java.awt.Color;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

import com.jamescho.framework.animation.Animation;
import com.jamescho.framework.animation.Frame;

@SuppressWarnings("deprecation")

public class Resources {
	
	// Initialize images
	public static BufferedImage welcome, iconimage, block, cloud1, cloud2, duck, grass, jump, run1, run2, run3, run4, run5, selector;
	
	// Init sound
	public static AudioClip hit, onjump;
	
	// Colors
	public static Color skyBlue;
	
	// Animation
	public static Animation runAnim;
	
	public static void load() {
		// Load images
		welcome = loadImage("welcome.png");
		iconimage = loadImage("iconimage.png");
		block = loadImage("iconimage.png");
		cloud1 = loadImage("cloud1.png");
		cloud2 = loadImage("cloud2.png");
		duck = loadImage("duck.png");
		grass = loadImage("grass.png");
		jump = loadImage("jump.png");
		run1 = loadImage("run_anim1.png");
		run2 = loadImage("run_anim2.png");
		run3 = loadImage("run_anim3.png");
		run4 = loadImage("run_anim4.png");
		run5 = loadImage("run_anim5.png");
		selector = loadImage("selector.png");
		
		// Load sounds
		hit = loadSound("hit.wav");
		onjump = loadSound("onjump.wav");
		
		// colors
		skyBlue = new Color(208, 244, 247);
		
		// Animation/Frames
		Frame f1 = new Frame(run1, .1f);
		Frame f2 = new Frame(run2, .1f);
		Frame f3 = new Frame(run3, .1f);
		Frame f4 = new Frame(run4, .1f);
		Frame f5 = new Frame(run5, .1f);
		runAnim = new Animation(f1, f2, f3, f4, f5, f3, f2);
		
	}
	
	
	private static AudioClip loadSound(String filename) {
		// Get audio file
		URL fileURL = Resources.class.getResource("/resources/" + filename);
		
		// Return as audio
		return Applet.newAudioClip(fileURL);
	}
	
	private static BufferedImage loadImage(String filename) {
		// Create new usable image object
		BufferedImage img = null;
		
		// try to get image from resources
		try {
			img = ImageIO.read(Resources.class.getResourceAsStream("/resources/" + filename));
		} catch (IOException e) {
			System.out.println("Error while reading: " + filename);
			e.printStackTrace();
		}
		return img;
	}
}
