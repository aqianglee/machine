package com.aqiang.machine.screen;

import java.awt.Button;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Monitor extends JFrame {
	private static final long serialVersionUID = 1L;

	public void init() {
		this.setSize(Config.MONITOR_WIDTH, Config.MONITOR_HEIGHT);
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		this.setLocation((width - Config.MONITOR_WIDTH) / 2, (height - Config.MONITOR_HEIGHT) / 2);
		this.setVisible(true);
		this.setLayout(null);
		final Screen screen = new Screen();
		screen.init();
		this.add(screen);
		final Button startup = new Button("startup");
		final Button shutdown = new Button("shutdown");
		startup.setVisible(true);
		startup.setBounds(820, 10, 150, 50);
		startup.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				screen.setBackground(Color.BLACK);
				startup.setEnabled(false);
				shutdown.setEnabled(true);
			}
		});
		shutdown.setBounds(820, 60, 150, 50);
		shutdown.setVisible(true);
		shutdown.setEnabled(false);
		shutdown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				screen.setBackground(Color.GRAY);
				startup.setEnabled(true);
				shutdown.setEnabled(false);
			}
		});
		this.add(startup);
		this.add(shutdown);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
