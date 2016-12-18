package com.aqiang.machine.screen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

public class Screen extends Panel {
	private static final long serialVersionUID = 1L;
	private Image offScreenimage = null;

	public void init() {
		this.setBounds(0, 0, Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
		this.setBackground(Color.GRAY);
		this.setVisible(true);
		this.setLayout(null);
	}

	@Override
	public void update(Graphics g) {
		if (offScreenimage == null) {
			offScreenimage = this.createImage(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
		}

		Graphics offScreen = offScreenimage.getGraphics();
		// Color c = offScreen.getColor();
		offScreen.setColor(Color.BLACK);
		offScreen.fillRect(0, 0, Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT);
		paint(offScreen);
		g.drawImage(offScreenimage, 0, 0, null);
		// offScreen.setColor(c);
	}

	@Override
	public void paint(Graphics g) {
		Font font = getFont();
		System.out.println(font.getFontName());
		g.setFont(font);
		g.drawString(">", 10, 10);
	}
}
