package examen.ejercicio1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Lienzo extends JPanel {

	private static final long serialVersionUID = 1L;

	public Lienzo(int width, int height) {
		setPreferredSize(new Dimension(width, height));
	}

	@Override
	protected void paintComponent(Graphics paint) {
		super.paintComponent(paint);
		Graphics2D paint2 = (Graphics2D) paint;

		paint2.setColor(Color.BLACK);
		paint2.drawLine(470, 470, 30, 470);
		paint2.drawLine(30, 470, 30, 30);
		paint2.drawLine(30, 30, 350, 30);
		paint2.drawLine(150, 30, 30, 150);
		paint2.drawLine(350, 30, 350, 120);
		paint2.drawArc(320, 120, 61, 61, 0, 360);
		paint2.drawLine(350, 180, 350, 290);
		paint2.drawLine(350, 200, 300, 250);
		paint2.drawLine(350, 200, 400, 250);
		paint2.drawLine(350, 290, 300, 390);
		paint2.drawLine(350, 290, 400, 390);
	}

}