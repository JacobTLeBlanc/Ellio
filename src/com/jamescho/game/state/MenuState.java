package com.jamescho.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.jamescho.game.main.Resources;

public class MenuState extends State {

	@Override
	public void init() {
		System.out.println("Entered MenuState");
	}

	@Override
	public void update() { }
	public void update(float delta) {
		// Do Nothing
		
	}
	

	@Override
	public void render(Graphics g) {
		// Draw welcome.png to screen at (0, 0)
		g.drawImage(Resources.welcome, 0, 0, null);
	}

	@Override
	public void onClick(MouseEvent e) {
		// Ignore
	}

	@Override
	public void onKeyPress(KeyEvent e) {
		// Ignore
		
	}

	@Override
	public void onKeyRelease(KeyEvent e) {
		// Ignore
	}

}
