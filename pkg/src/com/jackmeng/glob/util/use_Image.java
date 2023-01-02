package com.jackmeng.glob.util;

import java.awt.image.*;

import javax.swing.ImageIcon;

import java.awt.*;

public final class use_Image
{
  public static final BufferedImage NO_TEXTURE = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
  static
  {
    Graphics2D g2 = NO_TEXTURE.createGraphics();
    g2.setColor(Color.MAGENTA);
    g2.fillRect(0, 0, 16, 16);
    g2.setColor(Color.BLACK);
    g2.fillRect(16, 0, 32, 16);
    g2.setColor(Color.BLACK);
    g2.fillRect(0, 16, 16, 32);
    g2.setColor(Color.MAGENTA);
    g2.fillRect(16, 16, 32, 32);
    g2.dispose();
  }

  public static ImageIcon imageicon_resize(int width, int height, ImageIcon i)
  {
    return new ImageIcon(i.getImage().getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING));
  }
}
